package seleniumPractice;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkdemobox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		
		
		//only one check box
		//driver.findElement(By.id("monday")).click();
		
		WebElement webed = driver.findElement(By.name("submit"));
		Actions actions = new Actions(driver);
		actions.moveToElement(webed);
		actions.perform();
		
		
		List<WebElement>cbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("total no of checkbox" + cbox.size());
		
//		for(int i= 0; i<cbox.size(); i++)
//		{
//			cbox.get(i).click();
//			
//		}	
		//for each loop
		
//		
//		for(WebElement x : cbox ) {
//		x.click();
//		}
		
//		if i check only last 2 checkbox
		
		int totalCB = cbox.size();
		
		for(int i = totalCB-2;i<totalCB;i++) {
			cbox.get(i).click();
		}
		
		
	}

}
