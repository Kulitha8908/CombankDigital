package pages_Objects;

import static org.testng.Assert.assertEquals;

import java.awt.Desktop.Action;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Driver;
import java.sql.Time;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.testng.reporters.jq.TimesPanel;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.google.common.util.concurrent.ExecutionError;
import com.google.errorprone.annotations.Var;

import preRequist.setUp;

public class fdaHomePage_Objects {

	
	WebDriver driver = null;

	//WebElement Link_Payment_Transfer =  driver.findElement(By.xpath("//a[contains(.,'iconPayments / Transfers')]"));
	By  tab_PaymentandTransfer = By.xpath("//ul[@id='menu']/li[2]/div/div[2]/div/ul/li/a");
	By  Link_Payment_Transfer = By.xpath("//div/a[contains(text(),'Transfers / Payments')]");
	//By  Link_Payment_Transfer = By.xpath("//ul[@id='menu']/li[2]/div/a[contains(text(),'Transfers / Payments')]");
	
	
	
	By  dropdown_selectAndOption = By.xpath("//Span[contains(text(),'Select an option')]");
	By  log_HomePage = By.xpath("//img[@scr='img/logo.png?ver=e14bbb22aaf674eade914494180759a42dd975c7']");
	//By  tab_PaymentandTransfer = By.xpath("//a[contains(text(),'Payments and Transfers')])[2]");

	//CombankCardPayment 
	By  link_CombankCardPayment = By.xpath("//ul[@id='menu']/li[3]/div/a[contains(text(),'ComBank Card Payments')]");
	By  link_InterbankCreditCardPayment = By.xpath("//ul[@id='menu']/li[3]/div/div[2]/div/ul/li[2]/a");
	By  link_CashAdvanse = By.xpath("//div/div/ul/li/a[contains(text(),'Cash Advance')]");
	//FdaOwnCreditCardPayement
	By clickCombankCardpayment = By.xpath("//body/div[@id='outer']/div[@id='header']/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/a[1]");
	By clickOwncreditcardpayment = By.xpath("//body/div[@id='outer']/div[@id='header']/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]");

	//SelfManagement
	By link_SelfManagement = By.xpath("//ul/li/div/a[contains(text(),'Self Management')]");
	By link_ManageBenificiaries = By.xpath("//div[@class='bubble-menu two-column-right']/ul/li/a[contains(text(),'Manage Beneficiaries')]");

	//My Money
	By link_MyMoney = By.xpath("//li[@class='mymoney top-item']/div/a");
	By link_ListObjectives = By.xpath("//div/ul[3]/li/a[contains(text(),'List Objectives')]");
	
	
	
	//
	
	////////
	
	By verifyHomepage = By.xpath("//html[@id='ng-app']");
	
	By HomeavailableBalance = By.xpath("//li[1]/div/span[@class='available total']");
	SoftAssert softAssert = new SoftAssert();
	
	/*static Properties prop = new Properties();
	public static String projectPath = System.getProperty("user.dir"); */

	setUp su = new setUp();
	
	public fdaHomePage_Objects(WebDriver driver)
	{
		
		this.driver = driver;
		

	}
	
	

	//*********************Paymwnt/Transfer**********************
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


	public void VerifyHomePage(ExtentTest test) throws IOException {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			
			assertEquals(verifyHomepage, verifyHomepage);
			test.pass("Successfully login to Homepage",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, verifyHomepage, "Homepage.png")).build());
			  
			
		}catch (AssertionError e) {
			// TODO: handle exception
			e.getMessage();
		}
		
	}
	
	public void Payment_Transfer_tab(ExtentTest test) throws IOException
	{
		
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
		assertEquals(Link_Payment_Transfer, Link_Payment_Transfer);
		WebElement mouse= driver.findElement(Link_Payment_Transfer);
		new Actions(driver).moveToElement(mouse).perform();
		test.pass("Click Payment_Transfer",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, Link_Payment_Transfer, "PaymentTransfer.png")).build());	
		mouse.click();
		
		}catch (AssertionError e) {
		test.fail("Fail to Click Payment_Transfer",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, Link_Payment_Transfer, "PaymentTransfer.png")).build());	
		}
	}

	@SuppressWarnings("deprecation")
	public void Payment_Transfer_Subtab(ExtentTest test) throws IOException
	{
		
		
		try {
			
			assertEquals(tab_PaymentandTransfer, tab_PaymentandTransfer);
			driver.findElement(tab_PaymentandTransfer).click();
			//test.pass("Click Payment and transfer tab",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, tab_PaymentandTransfer, "PaymentandTransfer.png")).build());
			
			
		} catch (AssertionError e) {
			
			test.fail("Fail to Click Payment and transfer tab", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, tab_PaymentandTransfer, "tab_PaymentandTransfer.png")).build());
			e.getCause();
		}
		
	}


	//********************link_CombankCardPayment*************************
	public void click_CombankCardPayment()
	{
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		driver.findElement(link_CombankCardPayment).click();

	}

	public void click_InterbankCreditCardPayment(ExtentTest test)
	{
		try {
			assertEquals(link_InterbankCreditCardPayment, link_InterbankCreditCardPayment);
			driver.findElement(link_InterbankCreditCardPayment).click();
			test.pass("Click interbank transfer", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, link_InterbankCreditCardPayment, "InterbankCreditCardPayment.png")).build());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		
	}
	//*******************************************************************




	//**************dropdownSelectAndOption********************
	public void dropdownSelectAndOption(ExtentTest test) throws IOException 
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			assertEquals(dropdown_selectAndOption, dropdown_selectAndOption);
			driver.findElement(dropdown_selectAndOption).click();
			test.pass("click select objects", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, dropdown_selectAndOption, "selectAndOption.png")).build());
			
			
		} catch (AssertionError e) {
			 test.pass("Failed click select objects", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, dropdown_selectAndOption, "dropdown_selectAndOption.png")).build());
		}
		driver.findElement(dropdown_selectAndOption).click();

	}


	public void cliclHomepageButton() {

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//span[@class='home-image']")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String a  = driver.findElement(HomeavailableBalance).getText();
		setUp su = new setUp();
		su.setData("updatedAmount", a);
		
		/*try {
			String a  = driver.findElement(HomeavailableBalance).getText();
			OutputStream output = new FileOutputStream(projectPath+"/src/test/java/Assert/Assert.properties");
			
			prop.setProperty("newAmountHome",a);
			
			
			prop.store(output, null);
			} catch (Exception exp) {
				// TODO Auto-generated catch block
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}*/
	}

	////////********FdaOwnCreditCardPayement*************/////////////

	public void FdaOwnCreditCardPayement() 
	{
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(clickCombankCardpayment).click();
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.findElement(clickOwncreditcardpayment).click();

	}

	///////********ManageBenificiaries**********///////////////

	public void click_ManageBenificiaries() 
	{
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		driver.findElement(link_SelfManagement).click();
		
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		driver.findElement(link_ManageBenificiaries).click();
	}
	
	////////**************My Money***********//////////////////
	
	public void click_ListObjectives () 
	{
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(link_MyMoney).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(link_ListObjectives).click();
	}	

	public void onlineActivity(ExtentTest test) throws IOException
	{
		driver.findElement(By.xpath("//div/a[contains(text(),'Self Management')]")).click();
		driver.findElement(By.xpath("//li[2]/a[contains(text(),'Online Activity')]")).click();
		 
		//By  tab_PaymentandTransfer = By.xpath("//ul[@id='menu']/li[2]/div/div[2]/div/ul/li/a");
		//By  Link_Payment_Transfer = By.xpath("//div/a[contains(text(),'Self Management')]");
		
		
		By a = By.xpath("//html[@id='ng-app']");	
		test.pass("Fromaccount", MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, a, "Fromaccount.png")).build());
	}
}
