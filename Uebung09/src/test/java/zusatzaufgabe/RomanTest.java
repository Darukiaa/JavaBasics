package zusatzaufgabe;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RomanTest {

	Roman testee;

	@Before
	public void init() {
		testee = new Roman();
	}

	@Test
	public void shouldCalculateRomanToArabic() {
		assertEquals(17, testee.calc("XVII"));
		assertEquals(73, testee.calc("LXXIII"));
		assertEquals(333, testee.calc("CCCXXXIII"));
		assertEquals(1987, testee.calc("MCMLXXXVII"));
		assertEquals(1996, testee.calc("MCMXCVI"));
	}

	@Test
	public void singleRomanNumber() {
		assertEquals(1, testee.calc("I"));
		assertEquals(5, testee.calc("V"));
		assertEquals(10, testee.calc("X"));
		assertEquals(50, testee.calc("L"));
		assertEquals(100, testee.calc("C"));
		assertEquals(500, testee.calc("D"));
		assertEquals(1000, testee.calc("M"));
	}

	@Test
	public void twoRomanNumbers() {
		assertEquals(2, testee.calc("II"));
		assertEquals(11, testee.calc("XI"));
		assertEquals(6, testee.calc("Vi"));
		assertEquals(15, testee.calc("xV"));
		assertEquals(1005, testee.calc("MV"));
	}

	@Test
	public void multipleRomanNumbers() {
		assertEquals(12, testee.calc("XII"));
		assertEquals(111, testee.calc("CXI"));
		assertEquals(506, testee.calc("DVI"));
		assertEquals(1015, testee.calc("MXV"));
		assertEquals(1705, testee.calc("MDCCV"));
	}

	@Test
	public void substractRomanNumbers() throws Exception {
		assertEquals(9, testee.calc("IX"));
		assertEquals(96, testee.calc("XCVI"));
		assertEquals(444, testee.calc("CDXLIV"));
	}

	@Test
	public void shouldCalculateArabicToRoman() {
		assertEquals("XVI", testee.calc(16));
		assertEquals("LXXVIII", testee.calc(78));
		assertEquals("DCLXVI", testee.calc(666));
		assertEquals("MDCCLXXXIV", testee.calc(1784));
		assertEquals("MCCCXII", testee.calc(1312));
	}

	@Test
	public void singleArabicNumber() {
		assertEquals("I", testee.calc(1));
		assertEquals("V", testee.calc(5));
		assertEquals("X", testee.calc(10));
		assertEquals("L", testee.calc(50));
		assertEquals("C", testee.calc(100));
		assertEquals("D", testee.calc(500));
		assertEquals("M", testee.calc(1000));
	}

	@Test
	public void twoArabicNumbers() {
		assertEquals("II", testee.calc(2));
		assertEquals("XI", testee.calc(11));
		assertEquals("VI", testee.calc(6));
		assertEquals("XV", testee.calc(15));
		assertEquals("MV", testee.calc(1005));
	}

	@Test
	public void multipleArabicNumbers() {
		assertEquals("XII", testee.calc(12));
		assertEquals("CXI", testee.calc(111));
		assertEquals("DVI", testee.calc(506));
		assertEquals("MXV", testee.calc(1015));
		assertEquals("MDCCV", testee.calc(1705));
	}

	@Test
	public void substractArabicNumbers() throws Exception {
		assertEquals("IV", testee.calc(4));
		assertEquals("IX", testee.calc(9));
		assertEquals("XCVI", testee.calc(96));
		assertEquals("CDXLIV", testee.calc(444));
	}

}