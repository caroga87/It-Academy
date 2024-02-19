package tasca104n1exercici3;

import static org.junit.Assert.assertThrows;
import org.junit.jupiter.api.Test;

class TestMetodeException {

	@Test
	public void metodeArrayException () {
		
		assertThrows (ArrayIndexOutOfBoundsException.class, () -> {
		MetodeException.metodeArrayException(6);
		});
	}
	
		
	
	}


