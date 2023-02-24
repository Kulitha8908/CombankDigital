package fdaPages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages_Objects.FdaCombankCardPayment_Objects;
import pages_Objects.fdaHomePage_Objects;

public class FdaIntrabankCreditCardPayment_Page {

	public void IntrabankCreditCardPayment(ExtentReports extend,WebDriver driver) 
	{
		ExtentTest test = extend.createTest("FdaIntrabankCreditCardPayment");
		fdaHomePage_Objects home = new fdaHomePage_Objects(driver);
		FdaCombankCardPayment_Objects card = new FdaCombankCardPayment_Objects(driver);
		
		
		home.click_CombankCardPayment();
		test.log(Status.PASS,"click CombankCardPayment");
		home.click_InterbankCreditCardPayment(test);
		test.log(Status.PASS,"click InterbankCreditCardPayment");
		card.select_FromAccount();
		test.log(Status.PASS,"select FromAccount");
		card.type_ThirdPartyCardNumber("4325720013519007");
		test.log(Status.PASS,"type ThirdPartyCardNumber");
		card.type_Amount("20");
		test.log(Status.PASS,"type Amount");
		card.click_CheckBoxAgree();
		test.log(Status.PASS,"click CheckBoxAgree");
		card.click_SubmitButton();
		test.log(Status.PASS,"click SubmitButton");
		//card.type_OTP("default");
		//test.log(Status.PASS,"type OTP");
		card.click_confirmButton();
		test.log(Status.PASS,"click confirmButton");
		//home.cliclHomepageButton();
		
	}
	
	
}
