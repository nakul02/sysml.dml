/*
 * generated by Xtext 2.9.0
 */
package sysml.idea.completion

import org.eclipse.xtext.idea.lang.AbstractXtextLanguage
import sysml.idea.lang.DmlLanguage

class DmlCompletionContributor extends AbstractDmlCompletionContributor {
	new() {
		this(DmlLanguage.INSTANCE)
	}
	
	new(AbstractXtextLanguage lang) {
		super(lang)
		//custom rules here
	}
}