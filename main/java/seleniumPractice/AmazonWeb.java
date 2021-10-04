package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWeb {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
		//Thread.sleep(4000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Samsung")).click();
		driver.navigate().to("https://edureka.co/blog");
		//Thread.sleep(4000);
		driver.navigate().back();
		//driver.quit();
	}

}
