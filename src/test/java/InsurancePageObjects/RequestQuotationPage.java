package InsurancePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	WebElement Vehivcle;
	@FindBy(xpath = "//input[@id='quotation_incidents']")
	WebElement incidents;
	@FindBy(xpath = "//*[@id='quotation_vehicle_attributes_registration']")
	WebElement vehicRegistration;
	@FindBy(id = "quotation_vehicle_attributes_mileage")
	WebElement mileage;
	@FindBy(css = "#quotation_vehicle_attributes_value")
	WebElement vehicleValue;
	@FindBy(xpath = "//select[@id='quotation_vehicle_attributes_parkinglocation']")
	WebElement parkLocation;
	@FindBy(xpath = "//*[@value='Calculate Premium']")
	WebElement calculatePremium;
	@FindBy(id = "resetquote")
	WebElement reset;
	@FindBy(name = "submit")
	WebElement subBtn;

}
