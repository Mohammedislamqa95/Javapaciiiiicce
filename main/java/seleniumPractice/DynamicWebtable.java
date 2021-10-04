package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebtable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/index.php");
		
		WebElement username=driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("clear");
		
		WebElement password=driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse26\"]/li[1]/a")).click();
		
		String text=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[2]/div/div[2]")).getText();
		System.out.println(text);	//sowing 1 to 501 
		
		int totalpage = Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("pages")-1));
		System.out.println("total number of pages" + totalpage);
		
		for(int p = 1;p<=totalpage;p++) {
		WebElement activepage=	driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
		
		
		
		
		
		
		}
		
		
		
		
		
		
	}

}
