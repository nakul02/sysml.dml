/*
 * generated by Xtext 2.9.0
 */
package sysml.idea.highlighting;

import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import org.jetbrains.annotations.NotNull;
import sysml.idea.lang.DmlLanguage;

public class DmlSyntaxHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {
	
	@Override
    @NotNull
    protected SyntaxHighlighter createHighlighter() {
        return DmlLanguage.INSTANCE.getInstance(SyntaxHighlighter.class);
    }
}
