package stepDifinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	WebDriver driver=null;
	
	@SuppressWarnings("deprecation")
	@Given("browser is open")
	public void browser_is_open() {
	   System.out.println("inside step- browser is open"); 
	   
//	   String projectpath = System.getProperty("user.dir");
//	   System.out.println("project path is" + projectpath);
	   WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

	}

	@And("user o google search page")
	public void user_o_google_search_page() {
	    //System.out.println("inside step-user is navigated to search results");
	    //driver.findElement(By.name("q")).click();
	    driver.navigate().to("https://gmail.com");
	    
	}

	@When("user enters a test in a search box")
	public void user_enters_a_test_in_a_search_box() {
		System.out.println("inside step-user enters a test in a search box"); 
	   driver.findElement(By.name("q")).sendKeys("Automation step by step");
	}
	

	@And("hits enter")
	public void hits_enter() {
	  System.out.println("inside step- hits enter");  
	  
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    System.out.println("user is navigated to search results");
	    
	    driver.getPageSource().contains("Online Courses");
	    driver.close();
	    driver.quit();
	}

}
