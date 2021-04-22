package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample4 {
	
	@Test 
	public void testA() {
		
		Assert.assertEquals("Gmail", "Gmail");
		
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
