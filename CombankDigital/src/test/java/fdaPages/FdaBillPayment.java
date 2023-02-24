package fdaPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages_Objects.fdaBillPayment_Objects;
import pages_Objects.fdaHomePage_Objects;
import pages_Objects.fdaTransactionAndPaymentPage_Objects;

public class FdaBillPayment {
	
	
	public void billPayment(ExtentReports extent,WebDriver driver) throws InterruptedException, IOException
	{
		ExtentTest test =  extent.createTest("BillPayment");
		fdaHomePage_Objects home = new fdaHomePage_Objects(driver);

		home.Payment_Transfer_tab(test);
		home.Payment_Transfer_Subtab(test);
		
		home.dropdownSelectAndOption(test);
		
		fdaBillPayment_Objects bill = new fdaBillPayment_Objects(driver);
		bill.selectBillPayment();
		bill.selectFromAccount("8190047169");
		bill.SelectBiller("Access Natural Water Pvt Ltd");
		bill.typeAmount("1");
		bill.typePolicyNumber("TestPolicyNumber");
		bill.click_checkBox();
		bill.Click_SubmitButton();
		
		//home.cliclHomepageButton();
		
	}

}
