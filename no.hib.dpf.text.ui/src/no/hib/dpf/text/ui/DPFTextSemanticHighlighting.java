package no.hib.dpf.text.ui;

import no.hib.dpf.text.tdpf.Arrow;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Customize the semantic highlighting
 */
//TODO: Sometimes the highlighter has a strange behavior
//There may be a bug here.
public class DPFTextSemanticHighlighting implements
		ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		
		if (resource == null || resource.getParseResult() == null)
			return;
		
		INode root = resource.getParseResult().getRootNode();
		int arrowStart = -1;
		int arrowStop = -1;
		for (INode node : root.getAsTreeIterable()) {
			final EObject eo = NodeModelUtils.findActualSemanticObjectFor(node);			
			if(eo instanceof Arrow){
				try {
					//Inheritance:
					if(node.getText().indexOf("-|>") > -1){
						final int start = node.getText().indexOf("-|>");
						arrowStart=node.getTotalOffset()+start;
						acceptor.addPosition(arrowStart,4,DPFTextHighlighting.ARROW);
						arrowStart = -1;
					}else{					
						//Start Arrow:
						if(arrowStart < 0){
							final int start = node.getText().indexOf("-");
							if(start > -1){
								arrowStart=node.getTotalOffset()+start;
							}						
						}else {
							final int stop = node.getText().indexOf("->");
							if(stop > -1){
								arrowStop=node.getTotalOffset()+stop+2;
								acceptor.addPosition(arrowStart,arrowStop-arrowStart,DPFTextHighlighting.ARROW);
								arrowStart = -1;
							}
						}
					}
				} catch (Exception e) {
					//do nothing
				}
			}else{
				try {
					if (eo.getClass().getName().contains("Choosen")) {
						acceptor.addPosition(node.getOffset(), node.getLength(),DPFTextHighlighting.CHOOSEN);
					}				
				} catch (Exception e) {
					//do nothing
				}
			}
		}
	}
}
