package InsurancePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='email']")
	WebElement loginEmail;
	public void enterLoginEmail(String email) {
		loginEmail.sendKeys(email);
	}
	@FindBy(xpath="//input[@id='password']")
	WebElement loginPassword;
	public void enterLoginPassword(String pword) {
		loginPassword.sendKeys(pword);
	}
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement loginbtn;
	public void Loginbtnclick() {
		loginbtn.click();
	}
}
