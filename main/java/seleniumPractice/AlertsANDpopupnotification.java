package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsANDpopupnotification {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//alert with ok button

//driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//Thread.sleep(2000);
//driver.switchTo().alert().accept();

//alert with ok or cancel button

//driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//Thread.sleep(2000);
//driver.switchTo().alert().accept();
//driver.switchTo().alert().dismiss();







	}

}
