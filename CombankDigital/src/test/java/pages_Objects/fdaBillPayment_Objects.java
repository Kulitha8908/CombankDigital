package pages_Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fdaBillPayment_Objects {

	WebDriver driver = null;
	
	By dropDown_SelectBillPayment = By.xpath("//span[contains(text(),'Bill Payments')]");
	//By dropDown_SelectAccount = By.xpath("//a/div/span[contains(text(),'Select account')]");
	By dropDown_SelectAccount = By.xpath("//div[@name='fromAccount']/a/div[1]");
	
	By dropDown_SelectAccountFromDropdown = By.xpath("//div[@placeholder-text='Select account']/ul/li/div/span/a/span[1]");
	//By dropDown_SelectAccountFromDropdown = By.xpath("//span[@class='ng-binding'][contains(.,'AIA  Insurance')]");
	
	By dropDown_SelectBiller = By.xpath("//a/div/span[contains(text(),'Select biller')]");
	By dropDown_SelectBillerFromDropDown = By.xpath("//ul[@class='list parties medium']/li/div/span/a/span[1]");
	By textBox_Amount = By.xpath("//div[@name='amount']/input[@type='text']");
	By testBox_PolicyNumber = By.xpath("//div[@name='billerField']/input[@type='text']");
	
	By  Checkbox_agree = By.xpath("//fieldset[@id='step-buttons']/div/div/div/label");
	//fieldset[@id='step-buttons']/div/div/div/input[@name='agreeWithTerms']/label
	//div[@name='amountForm']/div/div[2]/div[@id='amount']/input[@class='field   textarea-non-bold']
	
	By  Button_Submit = By.xpath("//fieldset[@id='step-buttons']/input[@value='Submit']");
	
	
	public  fdaBillPayment_Objects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void selectBillPayment()
	{
		
		
		
		driver.findElement(dropDown_SelectBillPayment).click();
	}
	
	public void selectFromAccount(String fromAccount)
	   {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(dropDown_SelectAccount).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> text = driver.findElements(dropDown_SelectAccountFromDropdown);
		
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
		
	}
	public void SelectBiller(String biller)
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
			
			driver.findElement(dropDown_SelectBiller).click();
			
			/*try {
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}*/
				
			List<WebElement> text = driver.findElements(dropDown_SelectBillerFromDropDown);
			
			for(int i=0;i<text.size();i++)
			{
				WebElement element = text.get(i);
				String count = element.getText();
				
				if(count.contentEquals(biller))
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
			
			
			
		}
	
	public void typeAmount(String text)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(textBox_Amount).sendKeys(text);
	}
	
	public void typePolicyNumber (String text) 
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		driver.findElement(testBox_PolicyNumber).sendKeys(text);
		
	}
	
	public void click_checkBox()
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		driver.findElement(Checkbox_agree).click();
	}
	
	public void Click_SubmitButton()
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		driver.findElement(Button_Submit).click();
	}
}
	
	
	

