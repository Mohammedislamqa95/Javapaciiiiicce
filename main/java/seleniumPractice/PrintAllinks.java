package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https:www.sugarcrm.com/au/request-demo/");
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Deals")).click();
		
		List<WebElement> links= 	driver.findElements(By.tagName("a"));
		
		//System.out.println( " Numbers of linkspresetnt" +links.size());
		 
		for(WebElement alllinks : links) {
			System.out.println(alllinks.getText());
			System.out.println(alllinks.getAttribute("href"));
		}
	}

}
