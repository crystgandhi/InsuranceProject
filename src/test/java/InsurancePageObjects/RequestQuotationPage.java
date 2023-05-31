package InsurancePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RequestQuotationPage {
	WebDriver driver;

	public RequestQuotationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="ui-id-2")
	WebElement linkToRequstQutoPage;
	public void goToRequstQutoPage() {
		linkToRequstQutoPage.click();
	}
	@FindBy(xpath = "//h2[normalize-space()='Request a quotation']")
	WebElement pageTitle;
	public String getPageTitle() {
		return pageTitle.getText();
	}
	
	@FindBy(xpath = "//label[@for='quotation_policyexcess']")
	WebElement policyExcess;
	public String retriveText() {
		return policyExcess.getText();
	}
	@FindBy(xpath = "//select[@id='quotation_breakdowncover']")
	WebElement breakdownCover;
	public void breakDownCover() {
		Select brkdwnCover=new Select(breakdownCover);
		brkdwnCover.selectByIndex(2);
	}
	@FindBy(xpath = "//label[@for='quotation_windscreenrepair']")
	WebElement windScreenRepairText;
	public String getWindScreenRepairText() {
		return windScreenRepairText.getText();
	}
	@FindBy(css = "#quotation_windscreenrepair_t")
	WebElement windScreenRepairYes;
	@FindBy(xpath = "//*[@id='quotation_windscreenrepair_f']")
	WebElement windScreenRepairNo;
	public void windScreenRepair(String status){
		if (status.equals("yes")){
			windScreenRepairYes.click();
		}
		else{
			windScreenRepairNo.click();
		}
	}

	@FindBy(xpath = "//label[@for='quotation_excesspaid']")
	WebElement excessPaid;
	public String getExcessPaidText() {
		return excessPaid.getText();
	}
	@FindBy(xpath = "//strong[normalize-space()='Vehicle:']")
	WebElement vehivcle;
	public String vehicleText() {
		return vehivcle.getText();
	}
	@FindBy(xpath = "//input[@id='quotation_incidents']")
	WebElement incidents;
	public void enterIncidentsInfo(String incident) {
		incidents.sendKeys(incident);
	}
	@FindBy(xpath = "//*[@id='quotation_vehicle_attributes_registration']")
	WebElement vehicregistration;
	public void vechicRegistration(String registration) {
		vehicregistration.sendKeys(registration);
	}
	
	@FindBy(id = "quotation_vehicle_attributes_mileage")
	WebElement mileage;
	public void mileageInfo(String mile) {
		mileage.sendKeys(mile);
	}
	@FindBy(css = "#quotation_vehicle_attributes_value")
	WebElement vehicleValue;
	public void VehiclValueInfo(String value) {
		vehicleValue.sendKeys(value);
	}
	
	@FindBy(xpath = "//select[@id='quotation_vehicle_attributes_parkinglocation']")
	WebElement parkLocation;
	public void parkLocationInfo() {
		Select location=new Select(parkLocation);
		location.selectByValue("Driveway");
	}
	
	
	@FindBy(xpath = "//select[@id='quotation_vehicle_attributes_policystart_1i']")
	WebElement year;
	public void startPolicyYear() {
		Select policyyear=new Select(year);
		policyyear.selectByValue("2018");
	}
	
	@FindBy(xpath = "//select[@id='quotation_vehicle_attributes_policystart_2i']")
	WebElement month;
	public void startPolicyMonth() {
		Select policymonth=new Select(month);
		policymonth.selectByVisibleText("February");
	}
	
	@FindBy(xpath = "//select[@id='quotation_vehicle_attributes_policystart_3i']")
	WebElement date;
	public void startPolicyDate() {
		Select policydate=new Select(date);
		policydate.selectByIndex(0);
	}
	@FindBy(xpath = "//*[@value='Calculate Premium']")
	WebElement calculatpremium;
	public void calculatepremium() {
		calculatpremium.click();
	}
	
	@FindBy(xpath="//p[@id='calculatedpremium']")
	WebElement premiumAmount;
	public String getPremium(){
		return premiumAmount.getText();
	}
	
	@FindBy(id = "resetquote")
	WebElement reset;
	public void resetQuote() {
		reset.clear();
	}
	
	@FindBy(name = "submit")
	WebElement saveQuote;
	public void saveQuotation() {
		saveQuote.click();
	}
	@FindBy(css= "body")
	WebElement identnumber;
	public String saveIdentificationNumber() {
		return identnumber.getText();
	}
	
	
}
