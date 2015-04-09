package no.hib.dpf.text.util;

import no.hib.dpf.text.DPFConstants;
import no.hib.dpf.text.tdpf.Specification;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Some common helper methods to work with IFiles and DPF-Text-Files
 */
public final class CommonUtil {

	private CommonUtil() {
	}

	/**
	 * Get the name from a Specification-File without its ending "_Specification.tpf".
	 * @param f
	 * @return
	 */
	public static String getSpecNameFromFileName(final IFile f) {
		return f.getName().substring(0, f.getName().indexOf(DPFConstants.SPECIFICATION_FILE_EXTENSION));
	}

	/**
	 * Get the name from a Signature-File without its ending "_Signature.tpf".
	 * @param f
	 * @return
	 */
	public static String getSigNameFromFileName(final IFile f) {
		return f.getName().substring(0, f.getName().indexOf(DPFConstants.SIGNATURE_FILE_EXTENSION));
	}

	/**
	 * Get the name from a Batch-File without its ending "_Batch.tpf".
	 * @param f
	 * @return
	 */
	public static String getBatchFileNameFromIFile(IFile f) {
		return f.getName().substring(0, f.getName().indexOf(DPFConstants.BATCH_FILE_EXTENSION));
	}

	/**
	 * Get the IFile from an EObject. 
	 * Attention: May not always be possible!
	 * @param o
	 * @return
	 */
	public static IFile eObject2IFile(EObject o) {
		final Resource eResource = o.eResource();
		final URI eUri = eResource.getURI();
		final String platformString = eUri.toPlatformString(true);
		final IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
		return file;
	}

	/**
	 * Get "meta-model"/meta-specification from a specification
	 * @param dir directory
	 * @param s specification
	 * @return
	 */
	public static IFile metaSpecificationFromSpecification(IResource dir, Specification s) {
		final String path = dir.getFullPath() + "/" + s.getType().getId() + DPFConstants.SPECIFICATION_FILE_EXTENSION;
		return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(path));
	}
	
	/**
	 * Get a IFile with a specific name from a directory
	 * @param dir
	 * @param fileName
	 * @return
	 */
	public static IFile iFileFromDirectory(IResource dir, String fileName) {
		final String path = dir.getFullPath() + "/" + fileName;
		return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(path));
	}

	/**
	 * Get a IFile from a Java IO file
	 * @param file
	 * @return
	 */
	public static IFile iFileFromJavaFile(java.io.File file) {
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IPath location = Path.fromOSString(file.getAbsolutePath());
		return workspace.getRoot().getFileForLocation(location);
	}

	/**
	 * Get a IResource from a directory as String
	 * @param dir
	 * @return
	 */
	public static IResource iResourceFromDirectory(String dir) {
		return ResourcesPlugin.getWorkspace().getRoot().findMember(dir);
	}

}
