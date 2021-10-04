package com.testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TesngBasics {
	
	
	//Preconditions  annotations 
	
	@BeforeSuite  //1
	public void setUp()
	{
		System.out.println("setup system property for chrome");
	}
	
	
	@BeforeTest  //2
	public void login()
	{
		System.out.println("login on app");
	}
	
	@BeforeClass   //3
	public void lanchbrowser()
	{
		System.out.println("Launch chrome Browser ");
	}
	
//	@BeforeMethod
//	@test -1
//	@AferMethod
//	
//	@BeforeMethod
//	@test  -2
//	@AfterMethod
	
	@BeforeMethod   //4
	public void enterurl() {
		System.out.println("enter url");
	}
	
	
	//test cases starting with @test
	@Test     //5
	public void googleTitleTest()
	{
		System.out.println("Google title test");
	}
	 
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	
	//post conditions Starting with after
	@AfterMethod     //6
	public void logOut() {
		System.out.println("logout from App");
	}
	
	@AfterTest
	public void deleteAllCockies() {
		System.out.println("deleteall cockies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}

	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate test report");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
