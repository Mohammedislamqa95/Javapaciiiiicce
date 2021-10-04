 package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtabledemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		//driver.get("https://www.asx.com.au/");
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
			//how many rows in tableff
		
		int rows = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr")).size();
		System.out.println("total number of rows" + rows);
		
		// total number of colomns
		
		int cols = driver.findElements(By.xpath("//table[@class='data-list']//thead/tr/th")).size();
		System.out.println("total number of cols" + cols);
//		
//		for(int r=1;r<=rows;r++) {
//			
//			for(int c=1; c<=cols; c++) {
//				String data = driver.findElement(By.xpath("//table[@class='data-list']//tr["+r+"]/td["+c+"]")).getText();
//				System.out.print(data+ "     ");
//				
//			}
//			System.out.println();
//		}
		
		//print relese date ,version of java 
		
		for(int r=1; r<=rows; r++) {
		String language=	driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[1]")).getText();
			
			if(language.equals("java")) {
				String version=driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[2]")).getText();
				String relase=driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[3]")).getText();
				System.out.println(language +"   "+version+"   "+relase);
			}
		}
		}
		
		
		
		
	}

	
