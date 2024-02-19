/**
 * 
 */
package tasca104n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * 
 */
class DniTest {

	private static Stream<Arguments> testCalculDni() {
	    return Stream.of(
	    	// Creem una llista amb 10 nums i les seves lletres corresponents	
	        Arguments.of(38371758, 'F'), 
	        Arguments.of(47889696, 'Q'),
	        Arguments.of(47889695, 'S'),
	        Arguments.of(48868575, 'S'),
	        Arguments.of(33364816, 'G'),
	        Arguments.of(90380966, 'M'),
	        Arguments.of(71467683, 'J'),
	        Arguments.of(19115427, 'N'),
	        Arguments.of(61264998, 'J'),
	        Arguments.of(84338665, 'B')
	      
	        );
	    
	}
	
	@ParameterizedTest
	@MethodSource(value = "testCalculDni")
	@DisplayName(value = "Calcul lletra Dni")
	
	public void testCalculDni (int dni, char lletra) {
		
		char lletraEsperada = CalculoDni.obtenirLletraDni(dni);
		
		assertEquals(lletraEsperada, lletra); /*compara la lletra obtinguda fent servir el metode creat
											amb la lletra correcte*/	
			
	}
}
