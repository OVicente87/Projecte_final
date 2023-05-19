
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Joc de proves
 * 
 * @author Grup1
 * @version 1.0.0
 * @since 1.0.0
 */

class Tests {
	@Test
	void test1Resta() {
		Assertions.assertEquals("2+1i", Resta.calculResta("5+3i","3+2i"));
	}
	
	@Test
	void test2Resta() {
		Assertions.assertEquals("5-2i", Resta.calculResta("9+5i","4+7i"));
	}
	
	@Test
	void test3Resta() {
		Assertions.assertThrows(NumberFormatException.class, ()->Resta.calculResta("a+7i", "4+2i"));
	}
}
