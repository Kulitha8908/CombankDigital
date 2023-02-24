package pages_Objects;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;

import org.jsoup.select.Evaluator.IsEmpty;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import preRequist.setUp;

public class fdaLoginPageObjects {

	WebDriver driver = null;

	By Textbox_userName = By.xpath("//input[@placeholder='Username']");
	By Button_Continue = By.xpath("//input[@value='Continue']");
	By Textbox_otp = By.xpath("//input[@placeholder='OTP']");
	By Textbox_passWord = By.xpath("//div[@name='PASSWORD']/input[@placeholder='Password']");
	By Button_login = By.xpath("//input[@value='Login']");

	// By form_loging = By.xpath("//form[@name='loginForm']");
	By form_loging = By.xpath("//div[@role='dialog']");

	By Link_Payment_Transfer = By.xpath("//div/a[contains(text(),'Transfers / Payments')]");

	// *********************ASSERT******************************************

	By availableBalance = By.xpath("//li[1]/div/span[@class='available total']");

	public fdaLoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	setUp su = new setUp();

	public void loginPage_usernameTestbox(String username, ExtentTest test) throws IOException {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			assertEquals(Textbox_userName, Textbox_userName);
			driver.findElement(Textbox_userName).sendKeys(username);
			test.pass("Username entered");
			test.pass("", MediaEntityBuilder
					.createScreenCaptureFromPath(su.captureScreenShot(driver, Textbox_userName, "username")).build());

		} catch (AssertionError e) {
			test.fail("Username not entered");
			test.fail("", MediaEntityBuilder
					.createScreenCaptureFromPath(su.captureScreenShot(driver, Textbox_userName, "username")).build());
		}

	}

	public void loginPage_OtpTestBox(String OTP) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Textbox_otp));

		element.sendKeys(OTP);
	}

	public void loginPage_continueButton() {
		driver.findElement(Button_Continue).click();
	}

	public void loginPage_passwordTextbox(String text, ExtentTest test) throws IOException {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class);

		try {
			assertEquals(Textbox_passWord, Textbox_passWord);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Textbox_passWord));
			element.sendKeys(text);
			test.pass("Password entered");
			test.pass("",
					MediaEntityBuilder
							.createScreenCaptureFromPath(su.captureScreenShot(driver, Textbox_passWord, "password.png"))
							.build());

		} catch (AssertionError e) {
			test.fail("Password not entered");
			test.fail("",
					MediaEntityBuilder
							.createScreenCaptureFromPath(su.captureScreenShot(driver, Textbox_passWord, "password.png"))
							.build());
		}

	}

	public void loginPage_loginButton(ExtentTest test) throws IOException {

		try {
			assertEquals(Button_login, Button_login);
			driver.findElement(Button_login).click();
			test.pass("Click login button");
			test.pass("", MediaEntityBuilder
					.createScreenCaptureFromPath(su.captureScreenShot(driver, Button_login, "abc.png")).build());
		} catch (AssertionError e) {
			test.fail("Login button  not clicked ");

		}

		

	}



}
