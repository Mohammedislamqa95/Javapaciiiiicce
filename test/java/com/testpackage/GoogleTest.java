package com.testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

	WebDriver driver;

	@SuppressWarnings("deprecation")
	//1  //4  //7
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}

	@Test(priority=1,groups="Title")  //2
	public void googleTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority=3,groups="Logo")  //8
	public void googleLOgoTest() {
		boolean b = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
	}

	@Test(priority=2,groups="Linktest")   //5
	public void mailLinkTest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).isDisplayed();
	}
	
	@Test(priority=4,groups="Test")
	public void test4() {
		System.out.println("test4");
	}
	
	@Test(priority=5,groups="Test")
	public void test5() {
		System.out.println("test5");
	}
	
	@Test(priority=6,groups="Test")
	public void test6() {
		System.out.println("test6");
	}
	

	
//3  //6  //9
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
