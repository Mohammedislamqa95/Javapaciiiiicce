package com.testpackage;

import org.testng.annotations.Test;

public class TestngFeatures {
	
@Test
public void loginTest() {
System.out.println("login Test");

	}	
	
@Test(dependsOnMethods="loginTest")
public void HomepageTest() {
System.out.println("Home page Test");
	}	
	
@Test(dependsOnMethods="loginTest")
public void searchpageTest() {
System.out.println("Serach page Test");
	}	
	
@Test(dependsOnMethods="loginTest")
public void registrationTest() {
System.out.println("Registration page");
	}	
	
	
	
}
