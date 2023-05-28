package InsurancePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterHerePage {
	
	WebDriver driver;
	public RegisterHerePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='user_title']")
	WebElement userTitle;
	public void SelectUserTitle() {
	Select selectTitle=new Select(userTitle);
	selectTitle.selectByIndex(4);
	}
	@FindBy(id="user_firstname")
	WebElement uname;
	public void enterUserName(String uName) {
		uname.sendKeys(uName);
	}
	@FindBy(id="user_surname")
	WebElement sname;
	public void enterSurName(String sName) {
		sname.sendKeys(sName);
	}
	@FindBy(xpath="//*[@id='user_phone']")
	WebElement phoneNum;
	public void enterUserPhoneNum(String phnum) {
		phoneNum.sendKeys(phnum);
	}
	@FindBy(xpath="//select[@id='user_dateofbirth_1i']")
	WebElement dob1;
	public void selectdDate() {
		Select selectdate=new Select(dob1);
		selectdate.selectByIndex(7);
	}
	@FindBy(xpath="//select[@id='user_dateofbirth_2i']")
	WebElement dob2;
	public void selectdMonth() {
		Select selectmonth=new Select(dob2);
		selectmonth.selectByIndex(5);
	}
	@FindBy(xpath="//select[@id='user_dateofbirth_3i']")
	WebElement dob3;
	public void selectdYear() {
		Select selectyear=new Select(dob3);
		selectyear.selectByIndex(5);
	}
	//input[@id='licencetype_f']
	//input[@id='user_address_attributes_street']
	//input[@id='user_address_attributes_city']
	//input[@id='user_address_attributes_county']
	//input[@id='user_address_attributes_postcode']
	//input[@id='user_user_detail_attributes_email']
	//input[@id='user_user_detail_attributes_password']
	//input[@id='user_user_detail_attributes_password_confirmation']
	//input[@name='submit']

	//dd
	
	//select[@id='user_licenceperiod']
	//select[@id='user_occupation_id']
}
