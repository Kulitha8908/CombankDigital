package pages_Objects;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FdaCombankCardPayment_Objects {


	By  dropDown_FromAccount = By.xpath("//span[contains(text(),'Select account')]");
	By  dropDown_SelectAccountFromAccount = By.xpath("//ul[@class='list accounts medium']/li[1]");
	By  textBox_ThirdPartyCardNumber = By.xpath("//div[@name='beneficiaryAccount']/input[@type='text'] ");                                        
	By  testBox_Amount = By.xpath("//div[@id='amount']/input[@type='text']");
	//By  checkBox_Agree = By.xpath("//div[@name='agreeWithTermsForm']/input[@id='terms-checkbox']");
	By  checkBox_Agree = By.xpath("//fieldset[@id='step-buttons']/div/div/div/label");

	By  button_Submit = By.xpath("//input[@value='Submit']");
	By  textBox_Otp = By.xpath("//div[@name='OTP_TOKEN']/input[@placeholder='OTP']");
	By  button_Confirm = By.xpath("//fieldset[@class='buttons']/input[@value='Confirm']");


	WebDriver driver = null;


	public FdaCombankCardPayment_Objects(WebDriver driver)
	{
		this.driver=driver; 
	}

	//Select from Account
	public void select_FromAccount()
	{ 


		driver.findElement(dropDown_FromAccount).click();	



		WebElement select = driver.findElement(dropDown_FromAccount);
		List<WebElement> options = select.findElements(dropDown_SelectAccountFromAccount);
		for (WebElement option : options)
		{
			if("8980023342".equals(option.getText()));
			//8009388563 
			System.out.println(option.getText());


			option.click();
		}

	}

	//Third Party Card Number

	public void type_ThirdPartyCardNumber(String text) 
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		driver.findElement(textBox_ThirdPartyCardNumber).sendKeys(text);
	}

	//Amount

	public void type_Amount(String text) 
	{
			

		driver.findElement(testBox_Amount).sendKeys(text);
	}

	//I agree with the terms of use
	public void click_CheckBoxAgree() 
	{
		

		driver.findElement(checkBox_Agree).click();
	}

	//Click submit button

	public void click_SubmitButton() 
	{
		

		driver.findElement(button_Submit).click();
	}

	public void type_OTP(String text) {
		

		driver.findElement(textBox_Otp).sendKeys(text);
	}

	public void click_confirmButton()
	{
		

		driver.findElement(button_Confirm).click();
	}

}

