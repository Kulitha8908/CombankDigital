package pages_Objects;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FdaDomesticPayments_Objects {

	//Select Pyament Type 	
	By  dropDown_DomesticPayments = By.xpath("//li[@class='DOMESTIC_PAYMENT']/div/span/a/span[contains(text(),'Domestic Payments')]");

	//From Account No.
	By  dropDown_FromAccount = By.xpath("//span[contains(text(),'Select account')]");
	By  dropDown_SelectAccountFromAccount = By.xpath("//ul[@class='list accounts medium']/li[1]");
	//Select Beneficiary's Bank
	By  dropDown_SelectBeneficiarysBank = By.xpath("//span[contains(text(),'Select bank')]");
	By  dropDown_TypeBank_SelectBeneficiarysBank = By.xpath("//input[@placeholder='Filter your choices']");
	By  dropdown_ClickSelectedBank = By.xpath("//div[@placeholder-text='Select bank']/ul[2]/li[1]");
	//Beneficiary's Account No
	By text_BeneficiarysAccountNo = By.xpath("//div[@name='beneficiaryAccount']/input");
	//Beneficiary's Name
	By  textBox_BeneficiarysName = By.xpath("//div[@name='beneficiaryName1']/input");
	//Beneficiary's Identification
	By  textBox_BeneficiarysIdentification = By.xpath("//div[@name='beneficiaryIdentification']/input");
	//Amount LKR
	By textBox_AmountLKR = By.xpath("//div[@id='amount']/input");
	//Sender's Account Description
	By textBox_SendersAccountDescription = By.xpath("//div[@name='debtorComments']/input");
	//Beneficiary Account Description
	By textBox_BeneficiaryAccountDescription = By.xpath("//div[@name='beneficiaryComments']/textarea");
	//Purpose of Payment
	By dropDown_PurposeofPayment = By.xpath("//span[contains(text(),'Select purpose of payment')]");
	By dropDown_TypePurposefromPurposeofPayment = By.xpath("//input[@placeholder='Filter your choices']");
	By dropDown_SelectPurposefromPurposeofPayment = By.xpath("//li[@class='list-animation no-logo-url']/div/span/a/span");
	//checkButton_Agree
	By checkBUtton_Agree = By.xpath("//div[@name='agreeWithTermsForm']");
	//SubmitButton
	By submitButtion = By.xpath("//fieldset[@id='step-buttons']/input[@value='Submit']");
	//Otp 
	//By textBox_OTP = By.xpath("//div[@name='OTP_TOKEN']/input");
	//Confirm Button
	By button_Confirm = By.xpath("//input[@value='Confirm']");







	WebDriver driver = null;




	public	FdaDomesticPayments_Objects(WebDriver driver)
	{
		this.driver = driver;
	}

	//Select_DomesticPayments
	public void Select_DomesticPayments()
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		driver.findElement(dropDown_DomesticPayments).click();
	}


	//Select from Account
	public void select_FromAccount()
	{ 
		/*try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		driver.findElement(dropDown_FromAccount).click();	

		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		WebElement select = driver.findElement(dropDown_FromAccount);
		List<WebElement> options = select.findElements(dropDown_SelectAccountFromAccount);
		for (WebElement option : options)
		{
			if("8980023342".equals(option.getText()));
			//8009388563 
			System.out.println(option.getText());

			/*try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			option.click();
		}



	}

	//Select Beneficiary's Bank
	public void click_BeneficiaryBank(String text)
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		driver.findElement(dropDown_SelectBeneficiarysBank).click();

		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		driver.findElement(dropDown_TypeBank_SelectBeneficiarysBank).sendKeys(text);

		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		driver.findElement(dropdown_ClickSelectedBank).click();
	}

	//type_AccountNo
	public void type_AccountNo(String text)
	{
	/*	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		driver.findElement(text_BeneficiarysAccountNo).sendKeys(text);
	}

	//Beneficiary's Name
	public void type_BeneficiarysName(String text)
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		driver.findElement(textBox_BeneficiarysName).sendKeys(text);
	}

	//Beneficiary's Identification
	public void type_BeneficiarysIdentification(String text)
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.findElement(textBox_BeneficiarysIdentification).sendKeys(text);
	}

	//Type Amount
	public void type_Amount(String text)
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		driver.findElement(textBox_AmountLKR).sendKeys(text);
	}

	//Type Sender's Account Description
	public void TypeSendersAccountDescription(String text) 
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.findElement(textBox_SendersAccountDescription).sendKeys(text);
	}

	//Beneficiary Account Description
	public void type_BeneficiaryAccountDescription(String text)
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.findElement(textBox_BeneficiaryAccountDescription).sendKeys(text);
	}

	//Purpose of Payment
	public void type_purposeOfPayment(String text)
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		driver.findElement(dropDown_PurposeofPayment).click();

		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		driver.findElement(dropDown_TypePurposefromPurposeofPayment).sendKeys(text);
		
		driver.findElement(dropDown_SelectPurposefromPurposeofPayment).click();
	}

	//checkButton_Agree

	public void click_checkButton_Agree()
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.findElement(checkBUtton_Agree).click();
	}

	//clickSubmitButton
	public void click_submitbutton()
	{
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.findElement(submitButtion).click();
	}


	//Otp text box

	public void type_Otp(String text)
	{
		/*try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//driver.findElement(textBox_OTP).sendKeys(text);

	}

	//Confirm Button

	public void click_ConfirmButton() 
	{
		/*try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		driver.findElement(button_Confirm).click();
	}

//Return Button
	
	public void click_ReturnButton() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Return')]")).click();
		
	}
	




}


