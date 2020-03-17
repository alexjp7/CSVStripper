import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestCases 
{

	private CSVStripper stripper = new CSVStripper();
	
	@Test
	void emptyString() 
	{
		String expected = "";
		String actual = stripper.strip("");
		Assert.assertEquals(expected, actual);
	}
		
	@Test
	void nothingToSanitize() 
	{
		String expected = "clean-string";
		String actual = stripper.strip("clean-string");
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test  
	void atMinusAtWithNegativeFloat() 
	{
		String expected = "-50.00";
		String actual = stripper.strip("@-@-50.00");
		Assert.assertEquals(expected, actual);
	}
	
	@Test  
	void atWithPositiveInteger() 
	{
		String expected = "13";
		String actual = stripper.strip("@13");
		Assert.assertEquals(expected, actual);
	}
	
	@Test  
	void minusWithPositiveInteger() 
	{
		String expected = "13";
		String actual = stripper.strip("@13");
		Assert.assertEquals(expected, actual);
	}
	
	@Test  
	void atWithPositiveFloat() 
	{
		String expected = "60.53";
		String actual = stripper.strip("@60.53");
		Assert.assertEquals(expected, actual);
	}
	
	@Test  
	void atEqualsPlusWithPositiveFloat() 
	{
		String expected = "100.50";
		String actual = stripper.strip("@=+100.50");
		Assert.assertEquals(expected, actual);
	}
	
	
	
	
	@Test 
	void minusEqualsWithNegativeInteger() 
	{
		String expected = "-100";
		String actual = stripper.strip("-=-100");
		Assert.assertEquals(expected, actual);
	}
		
	@Test 
	void atMinusString() 
	{
		String expected = "20-07-2010";
		String actual = stripper.strip("@-20-07-2010");
		Assert.assertEquals(expected, actual);
	}
	
	@Test 
	void equalsAtString() 
	{
		String expected = "value";
		String actual = stripper.strip("=@value");
		Assert.assertEquals(expected, actual);
	}
	
	
	
	

}
