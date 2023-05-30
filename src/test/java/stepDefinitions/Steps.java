package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import InsurancePageObjects.GoToRegistrationPage;
import InsurancePageObjects.Homepage;
import InsurancePageObjects.LoginPage;
import InsurancePageObjects.RegisterHerePage;
import InsurancePageObjects.RequestQuotationPage;
import io.cucumber.java.en.*;

public class Steps extends Baseclass {

	@Given("User lauch Chrome Browser")
	public void user_lauch_chrome_browser() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webDriver.chrome.driver", projectPath + "//Drivers/chromedrive.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("User Opens Url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}
	
	//goto registration page
	@Given("click register link")
	public void click_register_link() {
		gtrp = new GoToRegistrationPage(driver);
		gtrp.registrationLink();
	}
    //retriveText
	@Given("User Should see the Title as {string}")
	public void user_should_see_the_title_as(String title) {
		rp = new RegisterHerePage(driver);
		if (driver.getPageSource().contains("Sign up as a new user")) {
			Assert.assertEquals(title, driver.getTitle());
		} else {
			driver.close();
		}
	}
    
	//Register here
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
	    rp.clickLogout();
	}
    //Login page
	@Given("User landed on Loginpage and get URL of the page")
	public void user_landed_on_loginpage_and_get_url_of_the_page() {
		String urlofTheCurrentPage = driver.getCurrentUrl();
		System.out.println(urlofTheCurrentPage);
	}

	@When("User enter loginEmail as {string}")
	public void user_enter_login_email_as(String email) {
		lp=new LoginPage(driver);
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
     //Home tab     //retriveText
	@Then("User see the PageTitle as {string}")
	public void user_see_the_page_title_as(String string) {
		hp = new Homepage(driver);
		String title = hp.getHomePageTitle();
		System.out.println(title);
	}

	// Request Quotation tab
	@When("User click on requestQuotation link")
	public void user_click_on_request_quotation_link() {
		rqp = new RequestQuotationPage(driver);
		rqp.goToRequstQutoPage();
	}
	//retriveText
	@Then("User should see the title as {string}")
	public void user_should_see_the_Pagetitle_as(String title) {
		Assert.assertEquals("Request a quotation", rqp.getPageTitle());
	}
	//retriveText
	@Then("User can see \"polciyexcess-{int}%")
	public void user_can_see_polciyexcess(Integer int1) {
		Assert.assertEquals("Policyexcess", rqp.retriveText());
	}

}
