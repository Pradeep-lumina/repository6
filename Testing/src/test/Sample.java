package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void testA() {
		
		Assert.assertEquals("gmail", "gmails");
		
	}
	
	@Test
	public void testC() {
		
		Assert.assertEquals("Google", "Google");
		
	}
	
	@Test
	public void testB() {
		
		Assert.assertEquals("Yahoo", "Yahoo");
		
	}


}
