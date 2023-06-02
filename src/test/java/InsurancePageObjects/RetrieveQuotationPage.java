package InsurancePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrieveQuotationPage {

	WebDriver driver;

	public RetrieveQuotationPage(WebDriver driver) {
		this.driver = driver;
	}

	By retrieveQuo = By.linkText("Retrieve Quotation");

	public void clickRetrieveQuotation() {
		driver.findElement(retrieveQuo).click();
	}

	By idenNum = By.xpath("//input[@placeholder='identification number']");

	public void enterIdentificationNum(String identiNum) {
		driver.findElement(idenNum).sendKeys(identiNum);
	}

	By retieveBtn = By.xpath("//input[@id='getquote']");

	public void clickRetrieveBtn() {
		driver.findElement(retieveBtn).click();
	}

	By error = By.xpath("/html/body/b");

	public String retrieveErrorMessage() {
		String msg = driver.findElement(error).getText();
		return msg;
	}

	By pageHeading = By.tagName("font");

	public String getPageTitle() {
		String heading = driver.findElement(pageHeading).getText();
		return heading;
	}

	By estimatedValue = By.xpath("//tr[8]/td[2]");

	public String getEstimatedValue() {
		String estivalue = driver.findElement(estimatedValue).getText();
		return estivalue;
	}

	By startDate = By.xpath("//tr[10]/td[2]");

	public String getStartPolicyDate() {
		String policyDate = driver.findElement(startDate).getText();
		return policyDate;
	}

}
