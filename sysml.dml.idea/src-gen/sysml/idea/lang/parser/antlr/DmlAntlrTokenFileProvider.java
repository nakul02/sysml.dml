/*
 * generated by Xtext 2.9.0
 */
package sysml.idea.lang.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DmlAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("sysml/idea/parser/antlr/internal/PsiInternalDml.tokens");
	}
}