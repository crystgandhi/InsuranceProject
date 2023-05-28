package InsurancePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToRegistrationPage {
	
	WebDriver ldriver;
	
	public GoToRegistrationPage(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-default']")	
	WebElement registerHere;
	public void registrationLink() {
		registerHere.click();
	}
		
			
	

}
