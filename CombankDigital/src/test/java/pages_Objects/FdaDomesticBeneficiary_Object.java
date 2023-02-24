package pages_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FdaDomesticBeneficiary_Object {

	WebDriver driver = null;

	//Select Beneficiary Type
	By dropdown_BeneficiaryType = By.xpath("//span[contains(text(),'Select an option')]");
	By dropDownDomesticBeneficiaryFromDropDown = By.xpath("//span[contains(text(),'Domestic Beneficiary')][1]");

	//Select Beneficiary's Bank
	By dropdown_SelectBeneficiaryBank = By.xpath("//span[contains(text(),'Select bank')]");
	By TextBox_TypeBeneficiarysBank = By.xpath("//input[@placeholder='Filter your choices']");
	By dropDown_ClickBeneficiarysBank = By.xpath("//ul[@class='list none medium']/li/div/span/a");


	//Beneficiary's Account No.
	By textBox_TypeBeneficiarysAccountNo = By.xpath("//div[@name='beneficiaryAccount']/input");

	//Beneficiary's Name
	By textBox_BeneficiarysName = By.xpath("//div[@name='beneficiaryName1']/input");

	//Beneficiary's Identification
	By textBox_BeneficiarysIdentification = By.xpath("//div[@name='beneficiaryIdentification']/input");

	//Beneficiary Description
	By textBox_BeneficiaryDescription = By.xpath("//div[@name='beneficiaryDescription']/input");

	//SubmitButton
	By button_Submit = By.xpath("//fieldset[@id='step-buttons']/input[@value='Submit']");

	//OTP
	By textBox_OTP = By.xpath("//div[@name='OTP_TOKEN']/input");

	//Confirm
	By button_Confirm = By.xpath("//a[contains(text(),'Confirm')]");


	public FdaDomesticBeneficiary_Object(WebDriver driver) 
	{
		this.driver = driver;
	}

	//SelectBeneficiaryType
	public void Select_BeneficiaryType() 
	{

		/*try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/


		driver.findElement(dropdown_BeneficiaryType).click();

		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		driver.findElement(dropDownDomesticBeneficiaryFromDropDown).click();
	}

	//Select Beneficiary's Bank

	public void Select_BeneficiarysBank(String text)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(dropdown_SelectBeneficiaryBank).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(TextBox_TypeBeneficiarysBank).sendKeys(text);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(dropDown_ClickBeneficiarysBank).click();
	}

	//Beneficiary's Account No.

	public void type_BeneficiarysAccountNo(String text)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(textBox_TypeBeneficiarysAccountNo).sendKeys(text);
	}

	//Beneficiary's Name

	public void type_BeneficiarysName(String text)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(textBox_BeneficiarysName).sendKeys(text);
	}

	//Beneficiary's Identification

	public void type_BeneficiaryIdentification(String text)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(textBox_BeneficiarysIdentification).sendKeys(text);
	}

	//Beneficiary Description

	public void type_BeneficiaryDescription(String text)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(textBox_BeneficiaryDescription).sendKeys(text);
	}

	//SubmitButton

	public void click_SubmitButton()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(button_Submit).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
	}

	public void enterOTP(String text)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(textBox_OTP).sendKeys(text);
	}

	public void clickConfirmButton()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(button_Confirm).click();
	}

}
