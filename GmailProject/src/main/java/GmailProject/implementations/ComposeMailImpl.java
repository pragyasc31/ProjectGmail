package GmailProject.implementations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import GmailProject.steps.Page;

public class ComposeMailImpl extends Page {

	public void clickComposebutton() {
		driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();

	}

	public void verifyMailPopup() throws InterruptedException {
		Thread.sleep(3000);
		
		  WebElement recipient =  driver.findElement(By.xpath("//textarea[contains(@name, 'to')]"));
		  Assert.assertEquals(true, recipient.isDisplayed());
		 
		//driver.findElement(By.xpath("//div[contains(text(),'Recipients')]"));
	}

	public void enterEmail(String email) {

		driver.findElement(By.xpath("//textarea[contains(@name, 'to')]")).clear();
		driver.findElement(By.xpath("//textarea[contains(@name, 'to')]")).click();

		driver.findElement(By.xpath("//textarea[contains(@name, 'to')]")).sendKeys(email);

		driver.findElement(By.xpath("//textarea[contains(@name, 'to')]")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//textarea[contains(@name, 'to')]")).sendKeys(Keys.TAB);
	}

	public void enterMailSubject(String subject) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@name,'subjectbox')]")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'subjectbox')]")).click();

		driver.findElement(By.xpath("//input[contains(@name,'subjectbox')]")).sendKeys(subject);

	}

	public void enterMailBody(String body) {
		driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).clear();
		driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).click();

		driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).sendKeys(body);

	}

	public void clickSend() {
		driver.findElement(By.xpath("(//div[contains(@aria-label,'Send')])[2]")).click();
	}

	public void navigateToSentTab() throws InterruptedException {
		
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Message
		// sent')]")));
		Thread.sleep(2000);
		
		WebElement mailSent = driver.findElement(By.xpath("//*[contains(text(),'Message sent')]"));
		Assert.assertEquals(true, mailSent.isDisplayed());
		System.out.println("Mail Sent :: " + mailSent);
		Thread.sleep(3000);
		
		WebElement sentTab =  driver.findElement(By.xpath("//a[contains(text(),'Sent')]"));
		Assert.assertEquals(true, sentTab.isDisplayed());
		 
		driver.findElement(By.xpath("//a[contains(text(),'Sent')]")).click();
	}

	public void verifyMailSent() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[contains(text(),'To:')][2]")).click();
		Thread.sleep(3000);
		String expectedSubject = "Test Sub";
		String Subject = driver.findElement(By.xpath("(//table//div//h2)[1]")).getText();
		if (Subject.equals(expectedSubject)) {
			System.out.println("verifyMailSent() :: Test Passed");
		} else
			System.out.println("verifyMailSent() :: Test Failed");
	}

}
