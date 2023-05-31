package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import InsurancePageObjects.GoToRegistrationPage;
import InsurancePageObjects.Homepage;
import InsurancePageObjects.LoginPage;
import InsurancePageObjects.RegisterHerePage;
import InsurancePageObjects.RequestQuotationPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Steps extends Baseclass {

	@Before
	public void setUp() throws IOException {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webDriver.chrome.driver", projectPath + "//Drivers/chromedrive.exe");
		
		  logger = Logger.getLogger("InsuranceProject"); String path =
		  ".//log4j.properties"; PropertyConfigurator.configure(path);
		 
		logger.info("-------------Launch Browser---------");
		prop = new Properties();
		FileInputStream fis = new FileInputStream("./config.properties");
		prop.load(fis);
		String brow = prop.getProperty("browser");
		if (brow.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (brow.equals("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Given("User lauch Chrome Browser")
	public void user_lauch_chrome_browser() {
		gtrp = new GoToRegistrationPage(driver);
	}

	@Given("User Opens Url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		logger.info("-------------Open Url---------");
	}

	// goto registration page
	@Given("click register link")
	public void click_register_link() {
		logger.info("-------------Registration---------");
		gtrp.registrationLink();
	}

	// retriveText
	@Given("User Should see the Title as {string}")
	public void user_should_see_the_title_as(String title) {
		rp = new RegisterHerePage(driver);
		if (driver.getPageSource().contains("Sign up as a new user")) {
			Assert.assertEquals(title, driver.getTitle());
		} else {
			driver.close();
		}
	}

	// Register here
	@When("User enter title")
	public void user_enter_title() {
		rp.SelectUserTitle();
	}

	@When("user enter firstname as {string}")
	public void user_enter_firstname_as(String uname) {
		rp.enterUserName(uname);
	}

	@When("user enter surname as {string}")
	public void user_enter_surname_as(String sname) {
		rp.enterSurName(sname);
	}

	@When("user enter phonenumber as {string}")
	public void user_enter_phonenumber_as(String pnum) {
		rp.enterUserPhoneNum(pnum);
	}

	@When("User select date")
	public void user_select_date() {
		rp.selectdDate();
	}

	@When("User select month")
	public void user_select_month() {
		rp.selectdMonth();
	}

	@When("user select year")
	public void user_select_year() {
		rp.selectdYear();
	}

	@When("user select licencetype")
	public void user_select_licencetype() {
		rp.licenceType();
	}

	@When("user select licenceperiod")
	public void user_select_licenceperiod() {
		rp.selectdLicencePeriod();
	}

	@When("user enter streetName as {string}")
	public void user_enter_street_name_as(String street) {
		rp.enterStreetname(street);
	}

	@When("user enter cityName as {string}")
	public void user_enter_city_name_as(String city) {
		rp.enterCityname(city);
	}

	@When("user enter county   as {string}")
	public void user_enter_county_as(String county) {
		rp.enterCountyname(county);
	}

	@When("user enter postalcode as {string}")
	public void user_enter_postalcode_as(String postcode) {
		rp.enterpostalCode(postcode);
	}

	@When("user enter email as {string}")
	public void user_enter_email_as(String email) {
		rp.enterEmail(email);
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String password) {
		rp.enterPassword(password);
	}

	@When("user enter confirmpassword as {string}")
	public void user_enter_confirmpassword_as(String cpword) {
		rp.enterConfirmPassword(cpword);
	}

	@When("user click submitbtn")
	public void user_click_submitbtn() {
		rp.submitbtnClick();
	}

	@Then("click Logout")
	public void click_logout() {
		lp.clickLogout();
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
		;
	}

	// Login page
	@Given("User landed on Loginpage and get URL of the page")
	public void user_landed_on_loginpage_and_get_url_of_the_page() {
		String urlofTheCurrentPage = driver.getCurrentUrl();
		System.out.println(urlofTheCurrentPage);
	}

	@When("User enter loginEmail as {string}")
	public void user_enter_login_email_as(String email) {
		logger.info("-------------Login---------");
		lp = new LoginPage(driver);
		lp.enterLoginEmail(email);
	}

	@When("User enter loginPassword as {string}")
	public void user_enter_login_password_as(String pword) {
		lp.enterLoginPassword(pword);
	}

	@When("Usen click on the loginbtn")
	public void usen_click_on_the_loginbtn() {
		lp.Loginbtnclick();
	}
	@When("Use Should see error message as {string}")
	public void use_should_see_error_message_as(String string) {
	    Assert.assertEquals("Enter your Email address and password correct", lp.errorMessage());
	}


	// Home tab //retriveText
	@Then("User see the PageTitle as {string}")
	public void user_see_the_page_title_as(String string) {
		hp = new Homepage(driver);
		String title = hp.getHomePageTitle();
		System.out.println(title);
	}
	
	// Request Quotation tab
	@When("User click on requestQuotation link")
	public void user_click_on_request_quotation_link() {
		logger.info("-------------Request Quotation---------");
		rqp = new RequestQuotationPage(driver);
		rqp.goToRequstQutoPage();
	}

	// retriveText
	@Then("User should see the title as {string}")
	public void user_should_see_the_Pagetitle_as(String title) {
		Assert.assertEquals("Request a quotation", rqp.getPageTitle());
	}

	// retriveText
	@Then("User can see \"polciyexcess-{int}%")
	public void user_can_see_polciyexcess(Integer int1) {
		Assert.assertEquals("Policyexcess", rqp.retriveText());
	}

	@When("user select BreakdownCover")
	public void user_select_breakdown_cover() {
		rqp.breakDownCover();
	}

	@Then("User can see {string}")
	public void user_can_seeWindScreen(String string) {
		Assert.assertEquals(rqp.getWindScreenRepairText(), "Windscreenrepair");
	}

	@When("User select windscreen repairtype")
	public void user_select_windscreen_repairtype() {
		rqp.windScreenRepair("No");
	}

	@Then("user can see {string}")
	public void user_can_seeExcessPaid(String string) {
		Assert.assertEquals(rqp.getExcessPaidText(), "Excesspaid");

	}

	@Then("User can see {string} text")
	public void user_can_see_text(String string) {
		Assert.assertEquals(rqp.vehicleText(), "Vehicle:");
	}

	@When("User enter all insurance Info")
	public void user_enter_all_insurance_info() {
		rqp.enterIncidentsInfo("breakdown");
		rqp.vechicRegistration("86767");
		rqp.mileageInfo("80");
		rqp.VehiclValueInfo("45000");
		rqp.parkLocationInfo();
		rqp.startPolicyYear();
		rqp.startPolicyMonth();
		rqp.startPolicyDate();

	}

	@Then("User calculate Premium")
	public void user_calculate_premium() {
		rqp.calculatepremium();
	}

	@Then("User can get Premium Amount")
	public void user_can_get_premium_amount() {
		System.out.println(rqp.getPremium());
	}

	@Then("User can save the quotation")
	public void user_can_save_the_quotation() {
		rqp.saveQuotation();
	}

	@Then("User should get Identification Number")
	public void user_should_get_identification_number() {
		String idenNumber = rqp.saveIdentificationNumber();
		String[] array1 = idenNumber.split(":");
		String[] inum = array1[1].split("Please");
		String identificationNumber = inum[0];
		System.out.println("identificationNumber :" + identificationNumber);
	}
	

}
