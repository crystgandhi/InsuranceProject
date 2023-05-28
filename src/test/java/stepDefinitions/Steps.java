package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import InsurancePageObjects.GoToRegistrationPage;
import InsurancePageObjects.RegisterHerePage;
import io.cucumber.java.en.*;

public class Steps {

	public WebDriver driver;
	public GoToRegistrationPage gtrp;
	public RegisterHerePage rp;

	@Given("User lauch Chrome Browser")
	public void user_lauch_chrome_browser() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webDriver.chrome.driver", projectPath + "//Drivers/chromedrive.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		gtrp = new GoToRegistrationPage(driver);
		rp = new RegisterHerePage(driver);
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

}
