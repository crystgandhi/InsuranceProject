package stepDefinitions;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import InsurancePageObjects.GoToRegistrationPage;
import InsurancePageObjects.Homepage;
import InsurancePageObjects.LoginPage;
import InsurancePageObjects.RegisterHerePage;
import InsurancePageObjects.RequestQuotationPage;

public class Baseclass {
	
	public WebDriver driver;
	public GoToRegistrationPage gtrp;
	public RegisterHerePage rp;
	public LoginPage lp;
	public Homepage hp;
	public RequestQuotationPage rqp;
	
	public static String randomString(){
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		return generatedString1;
		}
		/*
		 * public String pageTitle(){ 
		 * return pagetitle; }
		 */
	public void retriveText(){
	}
}