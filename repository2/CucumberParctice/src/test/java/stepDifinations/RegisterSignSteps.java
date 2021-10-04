package stepDifinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterSignSteps {
	
	public static WebDriver driver;
	
@Given("User is in homepage")
public void user_is_in_homepage() {	
	

	WebDriverManager.chromedriver().setup();
//	DesiredCapabilities dc= new DesiredCapabilities();
//	dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//	dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//	
//	ChromeOptions coptions = new ChromeOptions();
//	coptions.merge(dc);
	
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://www.automationpractice.com");
	
	
}

@When("Clicks on signin button")
public void clicks_on_signin_button() {
   
}

@Then("User see the n sign in page")
public void user_see_the_n_sign_in_page() {
    
}

@And("Enter username {string}")
public void enter_username(String string) {
    
}

@And("Enter password {string}")
public void enter_password(String string) {
    
}

@And("Click on sign button")
public void click_on_sign_button() {
    
}

@Then("User redirected to the my Account page")
public void user_redirected_to_the_my_account_page() {
   
}
	
	
}
