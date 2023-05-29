package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import InsurancePageObjects.GoToRegistrationPage;
import InsurancePageObjects.Homepage;
import InsurancePageObjects.LoginPage;
import InsurancePageObjects.RegisterHerePage;
import io.cucumber.java.en.*;

public class Steps {

	public WebDriver driver;
	public GoToRegistrationPage gtrp;
	public RegisterHerePage rp;
	public LoginPage lp;
	public Homepage hp;

	@Given("User lauch Chrome Browser")
	public void user_lauch_chrome_browser() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webDriver.chrome.driver", projectPath + "//Drivers/chromedrive.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		gtrp = new GoToRegistrationPage(driver);
		rp = new RegisterHerePage(driver);
		lp=new LoginPage(driver);
		hp=new Homepage(driver);
	}

	@Given("User Opens Url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@Given("click register link")
	public void click_register_link() {
		gtrp.registrationLink();
	}

	@Given("User Should see the Title as {string}")
	public void user_should_see_the_title_as(String title) {
		if (driver.getPageSource().contains("Sign up as a new user")) {
			Assert.assertEquals(title, driver.getTitle());
		} else {
			driver.close();
		}
	}

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
	@Given("User landed on Loginpage and get URL of the page")
	public void user_landed_on_loginpage_and_get_url_of_the_page() {
		String urlofTheCurrentPage=driver.getCurrentUrl();
		System.out.println(urlofTheCurrentPage);
	}

	@When("User enter loginEmail as {string}")
	public void user_enter_login_email_as(String email) {
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

	@Then("User see the PageTitle as {string}")
	public void user_see_the_page_title_as(String string) {
	    String title=hp.getHomePageTitle();
	    System.out.println(title);
	}


}
