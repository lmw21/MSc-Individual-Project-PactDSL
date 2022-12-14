/*
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.tests

import com.google.inject.Inject
import imperialmsc.lmw21.pactdsl.pactDSL.Model
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
//import static org.junit.Assert.*
//import org.eclipse.xtext.testing.validation.ValidationTestHelper
//import imperialmsc.lmw21.pactdsl.pactDSL.Party
//import imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage
//import imperialmsc.lmw21.pactdsl.validation.PactDSLValidator

@ExtendWith(InjectionExtension)
@InjectWith(PactDSLInjectorProvider)

class PactDSLParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	 
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			ContractTitle: "Test". 
			Entities: 
			EffectiveDate: 01 09 2022.
			Party: A "A".
			Party: B "B".
			PrimaryObligations:
			PaymentObligation: A must pay 120 to B by date 10 09 2022.
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}

/* 
class PactDLSValidatorTest {
	@Inject ParseHelper<Model> parseHelper
	@Inject ValidationTestHelper validationTestHelper 
	
	@Test
	def void testcheckPartyNameStartsWithCapital() {
	val Party = parseHelper.parse(
         "Party: b")
         validationTestHelper.assertError(Party, PactDSLPackage.Literals.PARTY, "Name should start with a capital letter")
         
         }
}
*/
