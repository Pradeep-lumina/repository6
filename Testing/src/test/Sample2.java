package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2 {
	
	@Test (priority=1)
	public void testA() {
		
		Assert.assertEquals("Gmail", "Gmail");
		
	}
	
	@Test (priority=2, enabled=false)
	public void testC() {
		
		Assert.assertEquals("Google", "Google");
		
	}
	
	@Test (priority=3)
	public void testB() {
		
		Assert.assertEquals("Yahoo", "Yahoo");
		
	}

}
