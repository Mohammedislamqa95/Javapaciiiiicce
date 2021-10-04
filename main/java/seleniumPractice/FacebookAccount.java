package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAccount {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Thread.sleep(3000);
		//driver.manage().deleteAllCookies();
		//driver.findElement(By.xpath("//*[@id=\"u_4_b_Cl\"]")).sendKeys("Selenim");
		//driver.findElement(By.)
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();		
		driver.findElement(By.name("firstname")).sendKeys("Selenim");
		driver.findElement(By.name("lastname")).sendKeys("Lansdale");
		driver.findElement(By.name("reg_email__")).sendKeys("mohammedislamqa95@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mohammedislamqa95@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Automation95@&$");
		
		WebElement month=driver.findElement(By.id("month"));
		Select select1=new Select(month);
		select1.selectByVisibleText("Mar");
		
		
		
		
		
		
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select2=new Select(day);
		select2.selectByVisibleText("1");
		
		
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select3=new Select(year);
		select3.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		//Thread.sleep(5000);
		
		
		//driver.findElement(By.xpath("//*[@id=\"u_5_3_HS\"]")).click();
		
	    //driver.close();
	    
	    //driver.quit();
	}

}
