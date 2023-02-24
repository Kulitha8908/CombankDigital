package fdaPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages_Objects.FdaDomesticPayments_Objects;
import pages_Objects.fdaHomePage_Objects;

public class FdaDomesticPayments_Page {

	public void FdaDomesticPayments(ExtentReports extent,WebDriver driver) throws IOException 
	{
		ExtentTest test = extent.createTest("FdaDomesticPayments");
		fdaHomePage_Objects home = new fdaHomePage_Objects(driver);
		FdaDomesticPayments_Objects Domestic = new FdaDomesticPayments_Objects(driver);

		home.Payment_Transfer_tab(test);
		home.Payment_Transfer_Subtab(test);
		home.dropdownSelectAndOption(test);


		Domestic.Select_DomesticPayments();
		Domestic.select_FromAccount();
		Domestic.click_BeneficiaryBank("sampath bank");
		Domestic.type_AccountNo("12345678890");
		Domestic.type_BeneficiarysName("testName");
		Domestic.type_BeneficiarysIdentification("test");
		Domestic.type_Amount("50");
		Domestic.TypeSendersAccountDescription("test Sender");
		Domestic.type_BeneficiaryAccountDescription("test account desscription");
		Domestic.type_purposeOfPayment("Construction Services");
		Domestic.click_checkButton_Agree();
		Domestic.click_submitbutton();
		//Domestic.type_Otp("default");
		Domestic.click_ConfirmButton();
		//Domestic.click_ReturnButton();




	}
}
