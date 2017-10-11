import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_IXCM_repetition() {
		RomanNumerals roma = new RomanNumerals();
		String Ix3 = "IIII" ;
		String Xx3 = "XXXX" ;
		String Cx3 = "CCCC" ;
		String Mx3 = "MMMM" ;
		int code= roma.convertToInteger(Ix3);
		assertEquals(0, code);
		code= roma.convertToInteger(Xx3);
		assertEquals(0, code);
		code= roma.convertToInteger(Cx3);
		assertEquals(0, code);
		code= roma.convertToInteger(Mx3);
		assertEquals(0, code);
		
		String no_repetition = "XIII";
		code= roma.convertToInteger(no_repetition);
		assertEquals(13, code);
	
	}

	@Test
	public void test_VLD_repetition() {
		RomanNumerals roma = new RomanNumerals();
		String V = "XVVII" ;
		String L = "ILLII" ;
		String D = "DDDDD" ;
		String valid = "DLV" ;
		int code= roma.convertToInteger(V);
		assertEquals(0, code);
		code= roma.convertToInteger(L);
		assertEquals(0, code);
		code= roma.convertToInteger(D);
		assertEquals(0, code);
		code= roma.convertToInteger(valid);
		assertEquals(555, code);
	
	}
	
	@Test
	public void test_basic_numbers() {
		RomanNumerals roma = new RomanNumerals();
		String I = "I" ;
		String V = "V" ;
		String X = "X" ;
		String L = "L" ;
		String C = "C" ;
		String D = "D" ;
		String M = "M" ;
		
		int code= roma.convertToInteger(I);
		assertEquals(1, code);
		
		code= roma.convertToInteger(V);
		assertEquals(5, code);
		
		code= roma.convertToInteger(X);
		assertEquals(10, code);
		
		code= roma.convertToInteger(L);
		assertEquals(50, code);
		
		code= roma.convertToInteger(C);
		assertEquals(100, code);
		
		code= roma.convertToInteger(D);
		assertEquals(500, code);
		
		code= roma.convertToInteger(M);
		assertEquals(1000, code);
	
	}
	
	@Test
	public void test_larger_basic_numbers() {
		RomanNumerals roma = new RomanNumerals();
		String s3 = "III" ;
		String s2012 = "MMXII" ;
		String s55 = "LV" ;

		
		int code= roma.convertToInteger(s3);
		assertEquals(3, code);
		
		code= roma.convertToInteger(s2012);
		assertEquals(2012, code);
		
		code= roma.convertToInteger(s55);
		assertEquals(55, code);

	
	}
	
	@Test
	public void test_substraction() {
		RomanNumerals roma = new RomanNumerals();
		String s4 = "IV" ;
		String s1984 = "MCMLXXXIV" ;


		
		int code= roma.convertToInteger(s4);
		assertEquals(4, code);
		
		code= roma.convertToInteger(s1984);
		assertEquals(1984, code);


	
	}
	
	@Test
	public void test_invalid_substraction() {
		RomanNumerals roma = new RomanNumerals();
		String s1 = "MVX" ;
		String s2 = "LC";
		String s3 = "DM";
		
		int code= roma.convertToInteger(s1);
		assertEquals(0, code);
		
		code= roma.convertToInteger(s2);
		assertEquals(0, code);

		code= roma.convertToInteger(s3);
		assertEquals(0, code);
	
	}
	
	
	@Test
	public void test_invalid_substraction_IX() {
		RomanNumerals roma = new RomanNumerals();
		String s1 = "MIL" ;
		String s2 = "XD";
		
		int code= roma.convertToInteger(s1);
		assertEquals(0, code);
		
		code= roma.convertToInteger(s2);
		assertEquals(0, code);


	
	}
	
	@Test
	public void test_random_values() {
		RomanNumerals roma = new RomanNumerals();
		String s1 = "MMMDXLI" ;
		String s2 = "CXII";
		
		int code= roma.convertToInteger(s1);
		assertEquals(3541, code);
		
		code= roma.convertToInteger(s2);
		assertEquals(112, code);


	
	}
		
	
}
