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
	@FindBy(xpath="//input[@id='licencetype_f']")
	WebElement licencetype;
	public void licenceType() {
		licencetype.click();
	}
	@FindBy(xpath="//select[@id='user_licenceperiod']")
	WebElement licenceperiod;
	public void selectdLicencePeriod() {
		Select selectyear=new Select(licenceperiod);
		selectyear.selectByIndex(3);
	}
	@FindBy(xpath="//select[@id='user_occupation_id']")
	WebElement occupationId;
	public void selectdoccupationId() {
		Select selectyear=new Select(occupationId);
		selectyear.selectByIndex(11);
	}
	@FindBy(xpath="//input[@id='user_address_attributes_street']")
	WebElement streetName;
	public void enterStreetname(String streetname) {
		streetName.sendKeys(streetname);
	}
	@FindBy(xpath="//input[@id='user_address_attributes_city']")
	WebElement cityName;
	public void enterCityname(String cityname) {
		cityName.sendKeys(cityname);
	}	
	@FindBy(xpath="//input[@id='user_address_attributes_county']")
	WebElement county;
	public void enterCountyname(String countyname) {
		county.sendKeys(countyname);
	}
	@FindBy(xpath="//input[@id='user_address_attributes_postcode']")
	WebElement postalcode;
	public void enterpostalCode(String postcode) {
		postalcode.sendKeys(postcode);
	}
	@FindBy(xpath="	//input[@id='user_user_detail_attributes_email']")
	WebElement email;
	public void enterEmail(String emailid) {
		email.sendKeys(emailid);
	}
	@FindBy(xpath="//input[@id='user_user_detail_attributes_password']")
	WebElement password;
	public void enterPassword(String pword) {
		password.sendKeys(pword);
	}
	@FindBy(xpath="//input[@id='user_user_detail_attributes_password_confirmation']")
	WebElement confirmpassword;
	public void enterConfirmPassword(String confirmpword) {
		confirmpassword.sendKeys(confirmpword);
	}
	@FindBy(xpath="//input[@name='submit']")
	WebElement submitbtn;
	public void submitbtnClick() {
		submitbtn.click();
	}
		@FindBy(xpath="//*[@value='Log out']")
		WebElement logout;
		public void clickLogout() {
			logout.click();
		}
	
	
}
