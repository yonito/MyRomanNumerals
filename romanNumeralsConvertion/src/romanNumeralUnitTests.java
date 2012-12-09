import static org.junit.Assert.*;

import org.junit.Test;


public class romanNumeralUnitTests {

	private romanNumerals n = new romanNumerals();
	@Test
	public void test()
	{
		assertEquals(false, n.checkInput(-3));
		assertEquals("I", n.NumberToRomain(1));
		assertEquals("LX", n.NumberToRomain(60));
		assertEquals("CCC", n.NumberToRomain(300));
	}

}
