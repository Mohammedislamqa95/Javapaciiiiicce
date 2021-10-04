package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicmethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		 String currenturl = driver.getCurrentUrl();
		 System.out.println("currenturl");
		 
		 
		 
		 driver.findElement(By.id("user-name")).sendKeys("fatehul");
		 
	}

}
