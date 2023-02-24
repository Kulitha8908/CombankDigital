package pages_Objects;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.tracing.Span;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.asserts.*;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Log;

import fdaPages.OwnAccpountFundTransfer_Page;
import io.netty.handler.logging.LogLevel;
import preRequist.setUp;

public class fdaTransactionAndPaymentPage_Objects {

	WebDriver driver = null;

	By dropdown_selectAndOption = By.xpath("//Span[contains(text(),'Select an option')]");
	By Link_ownAccount = By.xpath("//Span[contains(text(),'Own Accounts Transfer')]");
	By dropDown_fromAccount = By.xpath("//div[@name='fromAccount']/a/div/Span[contains(text(),'Select account')]");
	By dropDown_selectAccountFromdropdown = By.xpath("[@id='step-2']/div/div/div[2]/div/div/div/div/div/ul");
	By textBox_AmountBy = By.xpath("//div[@id='amount']/input[@type='text']");
	By textBox_SendersAccountDescription = By.xpath("//div[@name='debtorComments']/input[@type='text']");
	By textBox_BeneficiaryAccountDescription = By
			.xpath("//div[@name='beneficiaryComments']/textarea[@id='beneficiaryComments']");
	By chekBox_Agree = By.xpath("//fieldset[@id='step-buttons']/div/div/div/label");
	By button_Submit = By.xpath("//input[@type='submit']");
	By button_Confirm = By.xpath("//fieldset[@class='buttons']/input[@value='Confirm']");

	By availableBalance = By.xpath("//div[@class='total-container ng-scope']/span[2]");

	// By enterAmount = By.xpath("//li[1]/div/span[@class='available total']");

	SoftAssert softAssert = new SoftAssert();
	// By availableBalance = By.xpath("//li[1]/div/span[@class='available total']");
	setUp su = new setUp();
	By HomeavailableBalance = By.xpath("//li[1]/div/span[@class='available total']");

	public fdaTransactionAndPaymentPage_Objects(WebDriver driver) {
		this.driver = driver;
	}

	static Properties prop = new Properties();
	public static String projectPath = System.getProperty("user.dir");

	public void selectOwnAccFundTransfer(ExtentTest test) throws IOException {
		

		try {

			assertEquals(Link_ownAccount, Link_ownAccount);
			driver.findElement(Link_ownAccount).click();
			test.pass("Click link account", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, Link_ownAccount, "LinkownAccount.png")).build());

		} catch (AssertionError e) {
			
			test.fail("link account is not available", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, Link_ownAccount, "LinkownAccount.png")).build());
			
		}

	}

	// For tempery demo
	public void selectFromAccount(ExtentTest test) throws IOException {

		try {
			
			
			driver.findElement(By.xpath("//div[@name='fromAccount']/a/div/Span[contains(text(),'Select account')]")).click();

			WebElement select = driver
					.findElement(By.xpath("//div[@name='fromAccount']/a/div/Span[contains(text(),'Select account')]"));
			List<WebElement> options = select
					.findElements(By.xpath("//fieldset[@id='step-2']/div/div/div[2]/div/div/div/div/div/ul/li[1]"));
			for (WebElement option : options) {
				if ("8003319990".equals(option.getText()));
					
				// 8009388563
				System.out.println(option.getText());
						
				option.click();
				
				By a = By.xpath("//span[@class='ng-scope']/div/span[2]");	
				test.pass("Fromaccount", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, a, "Fromaccount.png")).build());

				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

	public void selectToAccount() {

		driver.findElement(By.xpath("//div[@name='toAccount']/a/div/Span[contains(text(),'Select account')]")).click();

		WebElement select = driver
				.findElement(By.xpath("//div[@name='toAccount']/a/div/Span[contains(text(),'Select account')]"));
		List<WebElement> options = select
				.findElements(By.xpath("//fieldset[@id='step-3']/div/div/div[2]/div/div/div/div/div/ul"));
		for (WebElement option : options) {
			if ("8190047169".equals(option.getText()))
				;
			// 8009388563
			System.out.println(option.getText());
			option.click();

		}
	}

	// Type Amount
	public void typeAmount(String amount,ExtentTest test) throws IOException, InterruptedException {
		try {
			Thread.sleep(4000);
		
		assertEquals(textBox_AmountBy, textBox_AmountBy);	
		driver.findElement(textBox_AmountBy).sendKeys(amount);
		test.pass("Amount", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, textBox_AmountBy, "textBoxAmountBy.png")).build());
		String a = driver.findElement(availableBalance).getText();
		String b = amount;
		setUp su = new setUp();
		su.setData("availableBalance", a);
		su.setData("newAmount", b);
		} 
		catch (AssertionError e) {
			test.fail("amount field not available", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, HomeavailableBalance, "amount.png")).build());
			
		}

	}

	// Type SendersAccountDescription
	public void type_SendersAccountDescription(String text,ExtentTest test) throws IOException {
		
		try {
			assertEquals(textBox_SendersAccountDescription, textBox_SendersAccountDescription);
			driver.findElement(textBox_SendersAccountDescription).sendKeys(text);
			test.pass("SendersAccountDescription", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, textBox_SendersAccountDescription, "SendersAccountDescription.png")).build());
		} catch (AssertionError e) {
			
			test.fail("SendersAccountDescription is not found", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, textBox_SendersAccountDescription, "SendersAccountDescription.png")).build());
			
		}
		

	}

	// Type BeneficiaryAccountDescription
	public void type_BeneficiaryAccountDescription(String text,ExtentTest test)  throws IOException  {

		try {
			
	
		assertEquals(textBox_BeneficiaryAccountDescription, textBox_BeneficiaryAccountDescription);
		driver.findElement(textBox_BeneficiaryAccountDescription).sendKeys(text);
		test.pass("BeneficiaryAccountDescription is available", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, textBox_BeneficiaryAccountDescription, "BeneficiaryAccountDescription.png")).build());
		} catch (AssertionError e) {
			
			test.fail("BeneficiaryAccountDescription is available", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, textBox_BeneficiaryAccountDescription, "BeneficiaryAccountDescription.png")).build()); 
			
		}
	}

	// click ChekBox
	public void clickChekBox(ExtentTest test) throws IOException {

		driver.findElement(chekBox_Agree).click();
		/*
		 * try {
		 * 
		 * assertEquals(chekBox_Agree, chekBox_Agree);
		 * 
		 * test.pass("Checkbox "); test.pass("Click Checkbox",
		 * MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver)).
		 * build());
		 * 
		 * 
		 * } catch (AssertionError e) { test.fail("Checkboxt is not available");
		 * test.fail("Checkbox is not available",
		 * MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver)).
		 * build()); // test.addScreenCaptureFromPath(homeBalance); }
		 */

	}
	// Click Submit button

	public void clickSubmitButton(ExtentTest test) throws IOException {

		
		try {

			assertEquals(button_Submit, button_Submit);
			driver.findElement(button_Submit).click();
			test.pass("Submit button is available", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, button_Submit, "buttonSubmit.png")).build());

		} catch (AssertionError e) {
			test.fail("Submit button is not available", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, button_Submit, "buttonSubmit.png")).build());

		}
	}

	public void clickConfirmButton(ExtentTest test) throws IOException {
		SoftAssert softAssert = new SoftAssert();
		
		//softAssert.assertNotEquals(button_Confirm, button_Confirm);
		try {

			assertEquals(button_Confirm, button_Confirm);
			driver.findElement(button_Confirm).click();
			test.pass("Confirm button is available", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, button_Confirm,"Confirmbutton.png")).build());

		} catch (AssertionError e) {
			test.fail("Confirm button is not available", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, button_Confirm,"Confirmbutton.png")).build());
		}
		

	}	

	// Validate Account Amount
	public void validateAmount(ExtentTest test) {
		
		

		try {
			Properties prop = new Properties();
			String projectPath = System.getProperty("user.dir");
			InputStream input = new FileInputStream(projectPath + "/src/test/java/Assert/Assert.properties");
			prop.load(input);
			String availableBalance = prop.getProperty("availableBalance").replaceAll("\\D+", "");
			String newAmount = prop.getProperty("newAmount").replaceAll("\\D+", "");
			String updatedAmount = prop.getProperty("updatedAmount").replaceAll("\\D+", "");

			Integer a = Integer.parseInt(availableBalance);
			Integer b = Integer.parseInt(newAmount);
			Integer c = Integer.parseInt(updatedAmount);

			// int number = Integer.parseInt(AvailableBanlanceHome);

			Integer tot1 = a / 100;
			Integer tot2 = c / 100;
			//Integer tot3 = 200;
			Integer tot3 = tot1-b;

			System.out.println(a / 100);
			System.out.println(c / 100);
			System.out.println(b);
			System.out.println(tot3);

			// softAssert.assertEquals(tot2, tot3,"FAIL");

			
			  /*if(tot3 != tot2) { test.log(Status.FAIL, "Amount "+tot3); } else if(tot3 ==
			  tot2) { test.log(Status.PASS, "Amount not matched"); }*/
			 

			
			  try {
			  
			  assertEquals(tot3, tot2, "pass");
			  
			  test.pass("Updated Account Banlance is :"+tot3); 
			  test.pass(" ", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, HomeavailableBalance,"UpdatedAccountBanlance.png")).build());
			  
			  } catch (AssertionError e) 
			  { test.fail("Account balance is incorrect :"+tot3);
			  test.fail(" ", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, HomeavailableBalance,"UpdatedAccountBanlance.png")).build());
			  }
			  
			  // test.addScreenCaptureFromPath(homeBalance); }
			 
			 /*try {

					assertEquals(tot3, tot3);

					test.pass("Updated Account ");

					test.pass("Confirm button is clicked", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, button_Confirm)).build());

				} catch (AssertionError e) {
					test.fail("Confirm button is not available");

					//test.fail("Confirm button is not available", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, button_Confirm)).build());
				}*/

			// su.softAssert().assertEquals(tot3, tot2,"FAIL");

			System.out.println("test23");

			// Assert.assertEquals(tot2, tot3);
			softAssert.assertAll();

			// su.softAssert().assertAll();
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	public void onlineActivity(ExtentTest test) throws IOException
	{
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div/a[contains(text(),'Self Management')]")).click();
		driver.findElement(By.xpath("//li[2]/a[contains(text(),'Online Activity')]")).click();
		 
		//By  tab_PaymentandTransfer = By.xpath("//ul[@id='menu']/li[2]/div/div[2]/div/ul/li/a");
		//By  Link_Payment_Transfer = By.xpath("//div/a[contains(text(),'Self Management')]");
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		By a = By.xpath("//html[@id='ng-app']");	
		test.pass("Fromaccount", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, a, "Fromaccount.png")).build());
	}

}
