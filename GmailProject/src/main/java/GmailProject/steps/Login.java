package GmailProject.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import GmailProject.implementations.ComposeMailImpl;
import GmailProject.implementations.LoginImpl;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	public static WebDriver driver;

	LoginImpl log = new LoginImpl();

	Page page = new Page();

	@Before("@tagLogin")
	public void setup() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

		this.driver = new ChromeDriver();
		// Login.driver.get("https://www.gmail.com/");
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		page.setWebDriver(driver);
		WebDriverWait w = new WebDriverWait(this.driver, 3);
	}

	@Given("^User navigates to gmail login page$")
	public void navigateToLogin() throws Throwable {
		System.out.print(" navigate function ");

		log.openGmail();
		
	}

	@Given("^User will click Sign in button$")
	public void clickSignIn() throws Throwable {
		log.clickSignIn();
	}

	@Given("^User will enter valid username \"([^\"]*)\"$")
	public void enterUsername(String username) throws Throwable {
		log.verifyLoginPage();
		log.enterUsername(username);
	}

	@When("^User click Next button$")
	public void clickNext() throws Throwable {
		log.clickNext();
	}

	@When("^User will enter valid password \"([^\"]*)\"$")
	public void enterPassword(String pass) throws Throwable {
		log.verifyPasswordPage();
		log.enterPassword(pass);
	}

	@When("^User click Next button to Sign in$")
	public void clickNextToSignIn() throws Throwable {

		log.clickNextToSignIn();
	}

	@Then("^User should be logged in to the account successfully$")
	public void verifyLogin() throws Throwable {
		log.verifyInbox();
	}

}
