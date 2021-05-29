package GmailProject.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GmailProject.implementations.ComposeMailImpl;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendMail extends Page {

	ComposeMailImpl compose = new ComposeMailImpl();

	@After("@LastTag")
	public void teardown() {
		Page.driver.manage().deleteAllCookies();
		Page.driver.close();
		Page.driver.quit();
	}

	@Given("^User will click Compose button$")
	public void clickCompose() throws Throwable {
		compose.clickComposebutton();

	}

	@Then("^Compose email pop up will come$")
	public void verifyMailPopup() throws Throwable {
		System.out.print("compose");
		compose.verifyMailPopup();
	}

	@When("^User will enter valid email \"([^\"]*)\"$")
	public void enterEmail(String email) throws Throwable {
		System.out.print("compose");
		compose.enterEmail(email);

	}

	@When("^User will enter subject \"([^\"]*)\"$")
	public void enterMailSubject(String subject) throws Throwable {
		System.out.print("compose");
		compose.enterMailSubject(subject);

	}

	@When("^User will enter body \"([^\"]*)\"$")
	public void enterMailBody(String body) throws Throwable {
		System.out.print("compose");
		compose.enterMailBody(body);
	}

	@Then("^User click Send button$")
	public void clickSend() throws Throwable {
		System.out.print("compose");
		compose.clickSend();

	}

	@Given("^User will navigate to Sent tab$")
	public void navigateToSentTab() throws Throwable {
		System.out.print("compose");
		compose.navigateToSentTab();

	}

	@Then("^User will verify the content$")
	public void verifyContents() throws Throwable {
		System.out.print("compose");
		compose.verifyMailSent();

	}

}
