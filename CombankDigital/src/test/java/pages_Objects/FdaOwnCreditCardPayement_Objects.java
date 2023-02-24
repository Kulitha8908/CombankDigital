package pages_Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class FdaOwnCreditCardPayement_Objects {
	
	WebDriver driver = null;
	public FdaOwnCreditCardPayement_Objects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	By selectFromAccount = By.xpath("//span[contains(text(),'Select account')]");
	By selectPublicsavingaccount = By.xpath("//span[contains(text(),'Public Savings Account')]");
	By typeAmount = By.xpath("//body/div[@id='outer']/div[@id='wrapper']/div[@id='content']/div[@id='main']/form[1]/div[1]/fieldset[3]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]");
	By selectRadiobutton = By.xpath("//label[contains(text(),'I agree with the terms of use')]");
	By clickSubmitbutton = By.xpath("//body/div[@id='outer']/div[@id='wrapper']/div[@id='content']/div[@id='main']/form[1]/fieldset[1]/input[1]");
	By enterOTP = By.xpath("//input[@placeholder='OTP via SMS alert']");
	By clickConfirm = By.xpath("//input[@value='Confirm']");

//Select From Account Dropdown
	
	public void selectFromAccount(String fromAccount) 
	{try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		driver.findElement(selectFromAccount).click();
		
		List<WebElement> text = driver.findElements(selectFromAccount);
		
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
	
	// Select Public Saving Account Type
	public void selectPublicsavingaccount()
	{
		
		
		driver.findElement(selectPublicsavingaccount).click();
	}
	
	//Enter the Amount
	
	public void typeAmount (String text) 
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(typeAmount).sendKeys(text);
	}
	
	//Agree to Terms And Conditiuons
	
	public void selectRadiobutton() 
	{
		
		driver.findElement(selectRadiobutton).click();
	}
	
	//clickSubmitbutton
	
	public void clickSubmitbutton() 
	{
		
		driver.findElement(clickSubmitbutton).click();
	}
	
	//enterOTP
	public void enterOTP(String text) 
	{
		
		driver.findElement(enterOTP).sendKeys(text);
	}
	
	//clickConfirm
	public void clickConfirm() 
	{
		
		driver.findElement(clickConfirm).click();
	}
	

}
