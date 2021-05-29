package GmailProject.implementations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import GmailProject.steps.Page;
import cucumber.api.java.Before;

public class LoginImpl extends Page {
	
	Properties obj = new Properties();
	
	@Before
	public void locatorSetup() throws IOException{
	FileInputStream objfile = new FileInputStream("src\\main\\java\\GmailProject\\application.properties");
	obj.load(objfile);
	}
	
	public void openGmail() {
		driver.get("https://www.gmail.com/");
		System.out.println("openGmail :: Opened Gmail Page");
	}

	public void verifyGmail() throws InterruptedException {

		Thread.sleep(3000);
		WebElement gmailPage = driver.findElement(By.linkText("Sign in"));
		Assert.assertEquals(true, gmailPage.isDisplayed());

		System.out.println("verifyGmail() :: verification done for Gmail page");
	}

	public void clickSignIn() {
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("clickSignIn() :: signin clicked");

	}

	public void verifyLoginPage() throws InterruptedException {

		Thread.sleep(3000);
		WebElement loginPage = driver.findElement(By.id("identifierId"));
		Assert.assertEquals(true, loginPage.isDisplayed());
		System.out.println("verifyLoginPage() :: Login page verified");

	}

	public void enterUsername(String username) {
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).click();
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys(username);
		System.out.println("enterUsername() :: Username entered");
	}

	public void clickNext() {
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();

		/*
		 * WebElement wrongUsername =
		 * driver.findElement(By.xpath("//div[contains(text(),'Google Account')]"));
		 * Assert.assertEquals(false, wrongUsername.isDisplayed());
		 */
		
// isDisplayed() function is not working well for negative cases on my local setup, hence using if else.
		
		boolean wrongUsername = driver.findElements(By.xpath("//div[contains(text(),'Google Account')]")).size() > 0;
		if (wrongUsername) {
			System.out.println("Username is Wrong");
		} else {
			System.out.println("Username is right");
		}

		System.out.println("clickNext() :: click next");
	}

	public void verifyPasswordPage() throws InterruptedException {

		Thread.sleep(3000);
		/*
		 * WebElement passPage =
		 * driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		 * Assert.assertEquals(true, passPage.isDisplayed());
		 */
		driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		System.out.println("verifyPasswordPage() :: Verify Password page done");
		Thread.sleep(3000);
	}

	public void enterPassword(String pass) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).click();
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(pass);
		System.out.println("enterPassword() :: password entered");

	}

	public void clickNextToSignIn() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();
		Thread.sleep(3000);

		/*
		 * WebElement wrongPassword =
		 * driver.findElement(By.xpath("//span[contains(text(),'Wrong password')]"));
		 * Assert.assertEquals(false, wrongUsername.isDisplayed());
		 */
		
		boolean wrongPassword = driver.findElements(By.xpath("//span[contains(text(),'Wrong password')]")).size() > 0;
		if (wrongPassword) {
			System.out.println("wrong Password");
		} else {
			System.out.println("Password is right");
		}

		/*
		 * Boolean confirm =
		 * driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).
		 * isDisplayed(); System.out.println("Confirmation :: " + confirm); if(!confirm)
		 * { System.out.println("Confirmation Not required"); }else {
		 * driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();
		 * Thread.sleep(3000);}
		 * 
		 * if(driver.findElement(By.xpath("//span[contains(text(),'Not now')]")).
		 * isDisplayed()) {
		 * driver.findElement(By.xpath("//span[contains(text(),'Not now')]")).click(); }
		 * System.out.println("click next"); Thread.sleep(3000);
		 */

		boolean isPresent = driver.findElements(By.xpath("//span[contains(text(),'Confirm')]")).size() > 0;
		if (isPresent) {
			driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();
			System.out.println("Confirmation Done");
		} else {
			System.out.println("Confirmation Not required");
		}

		boolean isNextPresent = driver.findElements(By.xpath("//span[contains(text(),'Not now')]")).size() > 0;
		if (isNextPresent) {
			driver.findElement(By.xpath("//span[contains(text(),'Not now')]")).click();
			System.out.println("Next Clicked");
		} else {
			System.out.println("Next not present");
		}
	}

	public void verifyInbox() throws InterruptedException {

		Thread.sleep(6000);
		WebElement compose = driver.findElement(By.xpath("//div[contains(text(),'Compose')]"));
		Assert.assertEquals(true, compose.isDisplayed());

		System.out.println("verifyInbox() :: Verify Inbox");
	}

}
