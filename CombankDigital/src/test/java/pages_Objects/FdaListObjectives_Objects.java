package pages_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FdaListObjectives_Objects {

	WebDriver driver = null;


	//CreateNewObjective
	By link_CreateNewObjective = By.xpath("//span/a[contains(text(),'Create New Objective')]");

	//Objective Type
	By dropDown_Selectanoption = By.xpath("//span[contains(text(),'Select an option')]");
	By dropDown_SelectTakeaTour = By.xpath("//span[contains(text(),'Take a Trip')]");

	//Next button
	By button_Next = By.xpath("//input[@value='Next']");

	//Target Amount in LKR
	By textBox_TypeTargetAmountinLKR = By.xpath("//div[@name='targetAmount']/input");

	//I agree with the terms of use
	//By checkbox_ClickAgree = By.xpath("//div[@name='agreeWithTermsForm']/input[@name='agreeWithTerms']");
	By checkbox_ClickAgree = By.xpath("//div/label[contains(text(),'I agree with the terms of use')]");
	
	//Submit button
	By button_Submit= By.xpath("//input[@value='Submit']");



	public FdaListObjectives_Objects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//CreateNewObjective
	public void Click_CreateNewObjective()
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		driver.findElement(link_CreateNewObjective).click();
		
	}
	
	//Objective Type
	public void select_ObjectiveType()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(dropDown_Selectanoption).click();
		
	/*	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		driver.findElement(dropDown_SelectTakeaTour).click();
	}
	
	//Next button
	public void click_Nextbutton()
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		driver.findElement(button_Next).click();
	}
	
	//Target Amount in LKR
	public void type_TargetAmount(String text)
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		driver.findElement(textBox_TypeTargetAmountinLKR).sendKeys(text);
	}
	
	//I agree with the terms of use
	public void click_Agree() 
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(checkbox_ClickAgree).click();
		driver.findElement(checkbox_ClickAgree).click();
	}
	
	//Submit button
	public void button_Submit()
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		driver.findElement(button_Submit).click();

	}
	
	




}
