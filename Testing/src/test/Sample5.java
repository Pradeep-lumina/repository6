package test;

import org.testng.annotations.Test;

public class Sample5 {
	@Test (groups ="Sanity")
	public void login() {
		System.out.println("Login Successful");
	}
	
	@Test (groups="Smoke")
	public void search() {
		System.out.println("Search Successful");
	
	}
	
	@Test (groups={"Smoke", "Sanity"})
	public void advancedsearch() {
		System.out.println("Advanced Search Successful");
	}
	
	@Test (groups ="Sanity")
	public void logout() {
		System.out.println("Logout Successsful");
	}

}
