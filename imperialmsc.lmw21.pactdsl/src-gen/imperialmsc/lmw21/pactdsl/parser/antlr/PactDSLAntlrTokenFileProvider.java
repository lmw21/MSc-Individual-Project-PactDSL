/*
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PactDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("imperialmsc/lmw21/pactdsl/parser/antlr/internal/InternalPactDSL.tokens");
	}
}