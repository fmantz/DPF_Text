package no.hib.dpf.text;

import java.io.InputStreamReader;

import no.hib.dpf.text.DPFConstants;
import no.hib.dpf.text.scala.DPFTextCore;
import no.hib.dpf.text.parser.antlr.DPFTextParser;
import no.hib.dpf.text.tdpf.Batch;
import no.hib.dpf.text.tdpf.Command;
import no.hib.dpf.text.tdpf.MakeDiagram;
import no.hib.dpf.text.tdpf.MakeEcore;
import no.hib.dpf.text.tdpf.MakeEmf;
import no.hib.dpf.text.tdpf.MakeImage;
import no.hib.dpf.text.tdpf.Specification;
import no.hib.dpf.text.tdpf.TestMatch;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Launcher for DPF-Text Batch-Files ("Run as")
 */
public class DPFTextLauncher extends LaunchConfigurationDelegate {

	/**
	 * Run commands from a batch file
	 */
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		try {
			MessageConsoleStream out = initConsole();
			final Path path = new Path(configuration.getAttribute(DPFConstants.LAUNCH_FILE, ""));
			final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			out.print("\nLaunch " + file);

			// final Injector injector = new
			// DPFTextStandaloneSetup().createInjectorAndDoEMFRegistration();
			// https://bugs.eclipse.org/bugs/show_bug.cgi?format=multiple&id=326024
			final Injector injector = Guice.createInjector(new DPFTextRuntimeModule());

			final IParser parser = injector.getInstance(DPFTextParser.class);
			final String pathString = file.getParent().getFullPath().toOSString();
			// out.println("Read: " + path);
			try {
				final IParseResult result = parser.parse(new InputStreamReader(file.getContents()));
				final EObject eRoot = result.getRootASTElement();
				if (eRoot instanceof Batch) {
					final Batch b = (Batch) eRoot;
					for (Command c : b.getCommands()) {
						if (c instanceof MakeImage) {
							final MakeImage image = (MakeImage) c;
							final String imageId = image.getId();
							final String imageType = image.getType().getLiteral();
							final String dir = file.getParent().getLocation().toFile().getAbsolutePath();
							DPFTextCore.makeImage(imageId, pathString, imageType, dir);
							final String fileName = DPFConstants.GRAHVIZ_IMAGE_PREFIX + imageId;
							out.print(runGraphVizCommand(fileName, imageType, dir));
						} else if (c instanceof MakeDiagram) {
							final MakeDiagram image = (MakeDiagram) c;
							final String imageId = image.getId();
							final String imageType = image.getType().getLiteral();
							final String dir = file.getParent().getLocation().toFile().getAbsolutePath();
							final String fileName = DPFConstants.GRAHVIZ_DIAGRAM_PREFIX + imageId;
							DPFTextCore.makeDiagram(imageId, pathString, imageType, dir);
							out.print(runGraphVizCommand(fileName, imageType, dir));
						} else if (c instanceof MakeEcore) {
							final MakeEcore ecore = (MakeEcore) c;
							final String id = ecore.getId();
							final String dir = file.getParent().getLocation().toFile().getAbsolutePath();
							DPFTextCore.makeEcore(id, pathString, dir);
						} else if (c instanceof MakeEmf) {
							final MakeEmf emf = (MakeEmf) c;
							final String id = emf.getId();
							final Specification s = DPFTextCore.loadSpecification(file.getParent(), id, true);
							final String dir = file.getParent().getLocation().toFile().getAbsolutePath();
							DPFTextCore.makeEMF(id, s.getType().getId(), pathString, dir);
						} else if (c instanceof TestMatch) {
							final TestMatch test = (TestMatch) c;
							final IContainer parent = file.getParent();
							final IFolder folder = parent.getFolder(new Path("debug"));
							if (!folder.exists()) {
								folder.create(false, true, null);
							}
							final String debugDir = folder.getLocation().toFile().getAbsolutePath();
							out.print(DPFTextCore.testMatch(test.getSearch(), test.getInto(), pathString, debugDir));
						}
					}
					out.print("\tOK");
				}
				// out.println(eRoot.toString());
			} catch (Exception e) {
				throw new RuntimeException(e);
			} finally {
				try {
					Thread.sleep(1000);
					file.getParent().refreshLocal(1, null);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Inits Eclipse console for writing messages to
	 * 
	 * @return
	 * @throws PartInitException
	 */
	private MessageConsoleStream initConsole() throws PartInitException {
		MessageConsole myConsole = findConsole(DPFConstants.CONSOLE_NAME);
		String id = IConsoleConstants.ID_CONSOLE_VIEW;
		IConsoleView view = (IConsoleView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(id);
		view.display(myConsole);
		MessageConsoleStream out = myConsole.newMessageStream();
		return out;
	}

	/**
	 * Finds standard Eclipse console by name, if the console does not exist it
	 * is created.
	 * 
	 * @param name
	 * @return
	 */
	private MessageConsole findConsole(final String name) {
		final ConsolePlugin plugin = ConsolePlugin.getDefault();
		final IConsoleManager conMan = plugin.getConsoleManager();
		final IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		// no console found, so create a new one
		final MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}
	
	/**
	 * Run Graphviz command
	 * @param fileName
	 * @param imageType
	 * @param dir
	 * @return
	 */
	private String runGraphVizCommand(final String fileName,final String imageType,final String dir){
	  final String sep = java.io.File.separator;	
	  final String fNameAndPath = dir + sep + fileName;
	  String cmd = "dot -T " + imageType + " " + fNameAndPath + ".dot -o " + fNameAndPath + "." + imageType;
      try {
          Runtime.getRuntime().exec(cmd);
      } catch (Throwable t){
    	  //Add "" for spaces in path expressions:
    	  cmd = "dot -T " + imageType + " \"" + fNameAndPath + ".dot\" -o \"" + fNameAndPath + "." + imageType + "\"";
    	  return t.getMessage() + "\n Call the command from the console/bash/terminal>" + cmd;
      }
	  return cmd;
	}
}
