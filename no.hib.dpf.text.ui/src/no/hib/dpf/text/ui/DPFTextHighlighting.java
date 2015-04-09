package no.hib.dpf.text.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Customization of the default highlighting.
 */
public class DPFTextHighlighting extends DefaultHighlightingConfiguration {
	
	public static final String ID_SEP = "ID_SEPERATOR";
	public static final String ARROW = "ARROW";
	public static final String CHOOSEN = "CHOOSEN";
	
	/**
	 * Configure the highlighting customization for different elements.
	 */
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(ID_SEP, "ID Seperator", idSeperator());
		acceptor.acceptDefaultHighlighting(ARROW, "Arrow", arrow());
		acceptor.acceptDefaultHighlighting(CHOOSEN, "Choosen", choosen());
	}

	/**
	 * Change the highlighting of the id sepaerator "@"
	 * @return
	 */
	public static final TextStyle idSeperator() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(128,128,128));
		//textStyle.setColor(new RGB(128, 0, 0));
		//textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	/**
	 * Change the highlighting for arrows
	 * Used for semantic highlighting
	 * @return
	 */
	public static final TextStyle arrow() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 255));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	/**
	 * Change the highlighting for chosen (specification / signature)
	 * Used for semantic highlighting
	 * @return
	 */
	public static final TextStyle choosen() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 150));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

}
