package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage {

	public WebDriver ldriver;

	public CustomerLoginPage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);}

	public void CustomerLoginPage(WebDriver rdriver) {
			
	}

	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id="Password")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement btnlogin;

	@FindBy(linkText="Logout")
	@CacheLookup
	WebElement linkLogout;


	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
		
	}

	public void setPassword(String pwd) {
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
		
	}

	public void clickLogin() {
		btnlogin.click();
	 }

	public void clickLogout() {
		linkLogout.click();
	}
	
	
}
