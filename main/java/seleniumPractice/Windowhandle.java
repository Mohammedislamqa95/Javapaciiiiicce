package seleniumPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windos = driver.getWindowHandles();
		//frist method iteraroto
		
//		Iterator<String> it =windos.iterator();
//		
//		String parentwindow =it.next();
//		String childwindow = it.next();
//		
//		System.out.println("Parent window id" + parentwindow);
//		System.out.println("Child Window ID" + childwindow);
		
		//second method
		
		List<String> windowslist = new ArrayList(windos);
		
		String ParentWindowID = windowslist.get(0);
		String childwindowID = windowslist.get(1);
		
		System.out.println("Parent window id" + ParentWindowID);
		System.out.println("Child Window ID" + childwindowID);
		
		
		
	}

}
