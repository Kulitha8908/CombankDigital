package pages_Objects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;

import preRequist.setUp;

public class FdaInterbankFundTransfer_Objects {
	
	WebDriver driver;
	
	By 	dropDown_Selectanoption = By.xpath("//span[contains(text(),'Select an option')]");
	By	dropDown_IntraBankTransfer = By.xpath("//span[contains(text(),'Intrabank Transfers')]");
	By  dropDown_SelectAccount = By.xpath("//span[contains(text(),'Select account')]");
	By  dropDown_SelectAccountFromFromAccount = By.xpath("//ul[@class='list accounts medium']/li/div/span/a/span[1]");
	By  dropDown_SelectFlashAccount = By.xpath("//ul[@class='list accounts medium']/li");//gettext()
	By	textBox_BeneAccountNo = By.xpath("//div[@name='beneficiaryAccount']/input");
	By  testBox_Amount = By.xpath("//div[@name='amount']/input");
	By	textBox_SenderDescription = By.xpath("//div[@name='debtorComments']/input");
	By 	textBox_BeneDescription	= By.xpath("//textarea[@id='beneficiaryComments']");
	By  dropDown_clickPurposeofpayment = By.xpath("//span[contains(text(),'Select purpose of payment')]");
	By	dropDown_selectPurposeofpayment = By.xpath("//ul[@class='list none medium']/li");//gettext(
	By  checkBox_Agree = By.xpath("//fieldset[@id='step-buttons']/div/div/div/label");
	By  button_Submit = By.xpath("//input[@value='Submit']");
	
	public FdaInterbankFundTransfer_Objects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	setUp su = new setUp();
	
	//select_SeletANOption
	public void select_SeletANOption(ExtentTest test) throws IOException {
		
		try {
			
			assertEquals(dropDown_Selectanoption, dropDown_Selectanoption);
			driver.findElement(dropDown_Selectanoption).click();
			test.pass("select Optoin",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, dropDown_Selectanoption, "seletanoption.png")).build());
			
		} catch (AssertionError e) {
			test.fail("select Optoin is not available",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, dropDown_Selectanoption, "seletanoption.png")).build());
			
		}
		
	}
	
	public void selectIntraBankTransfer(ExtentTest test) throws IOException
	{
		try {
			assertEquals(dropDown_IntraBankTransfer, dropDown_IntraBankTransfer);
			driver.findElement(dropDown_IntraBankTransfer).click();
			test.pass("selet IntraBankTransfer",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, dropDown_IntraBankTransfer, "IntraBankTransfer.png")).build());
			
			
		} catch (AssertionError e) {
			test.fail("IntraBankTransfer is not available",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, dropDown_IntraBankTransfer, "IntraBankTransfer.png")).build());
			
		}
		
	}
	
	public void selectFromAccount(String fromAccount,ExtentTest test) throws IOException {
		
		try {
			assertEquals(dropDown_SelectAccount, dropDown_SelectAccount);
			driver.findElement(dropDown_SelectAccount).click();
			test.pass("selectAcount",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, dropDown_SelectAccount, "selectAccount.png")).build());
			assertEquals(dropDown_SelectAccountFromFromAccount, dropDown_SelectAccountFromFromAccount);
			
			List<WebElement> text = driver.findElements(dropDown_SelectAccountFromFromAccount);
			
			for(int i=0;i<text.size();i++)
			{
				WebElement element = text.get(i);
				String count = element.getText();
				
				if(count.contentEquals(fromAccount))
				{
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					element.click();
					//test.pass("FromAccount",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, count, "selectAccount.png")).build());
					break;
				}
				
				
			}
			
			/*List<WebElement> text = driver.findElements(dropDown_SelectAccountFromFromAccount);
				  assertEquals(text, fromAccount);
				  driver.findElement(dropDown_SelectAccountFromFromAccount).click();
				  test.pass("SelectAccount "+text,MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, dropDown_SelectAccountFromFromAccount, "fromAccount.png")).build());*/
			  }
			 catch (AssertionError e) {
				e.getStackTrace();
			}
		
	}
	
	public void typeBeneAccount(String Account,ExtentTest test) throws IOException 
	{
		try {
			assertEquals(textBox_BeneAccountNo, textBox_BeneAccountNo);
			driver.findElement(textBox_BeneAccountNo).sendKeys(Account);
			test.pass("Type Bene AccountNo",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, textBox_BeneAccountNo, "BeneAccountNo.png")).build());
			
			
			
		} catch (AssertionError e) {
			test.fail("Bene AccountNo field not available",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, textBox_BeneAccountNo, "BeneAccountNo.png")).build());
			
		}
	}
	
	public void typeBeneAmount(String Amount,ExtentTest test) throws IOException
	{
		try {
			assertEquals(testBox_Amount, testBox_Amount);
			driver.findElement(testBox_Amount).sendKeys(Amount);
			test.pass("TypeAmount",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, testBox_Amount, "Amount.png")).build());
		
			
		} catch (AssertionError e) {
			test.fail("Ampount is notavailable ",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, testBox_Amount, "Amount.png")).build());
			
		}
	}
	
	public void typeSenderDescription(ExtentTest test,String text) throws IOException 
	{
		try {
			assertEquals(textBox_SenderDescription, textBox_SenderDescription);
			driver.findElement(textBox_SenderDescription).sendKeys(text);
			test.pass("Type sender description",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, textBox_SenderDescription, "SenderDescription.png")).build());
			
			
			
		} catch (AssertionError e) {
			test.fail("sender is not available",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, textBox_SenderDescription, "SenderDescription.png")).build());
			
		}
		
	}
	
	
	public void typeBeneDescription(ExtentTest test,String text) throws IOException 
	{
		try {
			assertEquals(textBox_BeneDescription, textBox_BeneDescription);
			driver.findElement(textBox_BeneDescription).sendKeys(text);
			test.pass("Type Bene description",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, textBox_BeneDescription, "BeneDescription.png")).build());
			
			
			
		} catch (AssertionError e) {
			test.fail("Bene is not available",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, textBox_BeneDescription, "BeneDescription.png")).build());
			
		}
		
	}
	
	public void selectPurposeCode(ExtentTest test,String purposeCode) throws IOException
	{
		try {
			assertEquals(dropDown_clickPurposeofpayment, dropDown_clickPurposeofpayment);
			driver.findElement(dropDown_clickPurposeofpayment).click();
				try {
					assertEquals(dropDown_selectPurposeofpayment, dropDown_selectPurposeofpayment);
					List<WebElement> pursCode = driver.findElements(dropDown_selectPurposeofpayment);
					for(int i=0;i<pursCode.size();i++)
					{
						WebElement code = pursCode.get(i);
						String count = code.getText();
						if(count.contentEquals(purposeCode))
						{
							code.click();
							//test.pass("Type PurposeCode",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, purposeCode, "clickPurposeofpayment.png")).build());
							break;						
							
						}
					}
					
					
				} catch (AssertionError e) {
					test.fail("PurposeCode field notavailable",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, dropDown_selectPurposeofpayment, "clickPurposeofpayment.png")).build());
				}
			} catch (AssertionError e) {
			// TODO: handle exception
		}
		
	}
	
	public void click_AgreeButton(ExtentTest test) throws IOException 
	{
		try {
			assertEquals(checkBox_Agree, checkBox_Agree);
			driver.findElement(checkBox_Agree).click();
			test.pass("Click Agree Button",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, checkBox_Agree, "Agree.png")).build());
			
		} catch (AssertionError e) {
			test.fail("Agree Button is not available",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, checkBox_Agree, "Agree.png")).build());
			
		}
	}
	
	
	public void clickSubmitButton(ExtentTest test) throws IOException 
	{
		try {
			assertEquals(button_Submit, button_Submit);
			driver.findElement(button_Submit).click();
			test.pass("Click submit button",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, button_Submit, "buttonSubmit.png")).build());
			
			
		} catch (AssertionError e) {
			test.fail("submit button is not available",MediaEntityBuilder.createScreenCaptureFromPath(su.captureScreenShot(driver, button_Submit, "buttonSubmit.png")).build());
			
		}
	}
	

	
	
	

}
