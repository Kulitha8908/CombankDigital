package testSuit;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import fdaPages.FdaBillPayment;
import fdaPages.FdaDomesticBeneficiary_Page;
import fdaPages.FdaDomesticPayments_Page;
import fdaPages.FdaInterbankFundTransfer_Page;
import fdaPages.FdaIntrabankCreditCardPayment_Page;
import fdaPages.FdaListObjectives_Page;
import fdaPages.FdaOwnCreditCardPayement_Page;
import fdaPages.OwnAccpountFundTransfer_Page;
import fdaPages.loginPage;	
import pages_Objects.FdaListObjectives_Objects;
import pages_Objects.FdaOwnCreditCardPayement_Objects;
import preRequist.setUp;

public class BillPayment {

	ExtentReports  extents = null;
	@Test
	public void RunTest() throws Exception
	{	

		setUp su = new setUp();

		WebDriver driver=su.stratChromeDriver();
		extents=su.extentReport();
		
		
		SoftAssert softAssert = new SoftAssert();

		
		
		//test.log(Status.PASS, "password sucessful");
		//test.log(Status.PASS,"Login page");
		loginPage login =  new loginPage();
		OwnAccpountFundTransfer_Page own =  new OwnAccpountFundTransfer_Page();
		FdaBillPayment bill = new FdaBillPayment();
		FdaIntrabankCreditCardPayment_Page card = new FdaIntrabankCreditCardPayment_Page();
		FdaOwnCreditCardPayement_Page owncard = new FdaOwnCreditCardPayement_Page();
		FdaDomesticBeneficiary_Page domBene = new FdaDomesticBeneficiary_Page();
		FdaDomesticPayments_Page domPayment = new FdaDomesticPayments_Page();
		FdaListObjectives_Page list = new FdaListObjectives_Page();
		FdaInterbankFundTransfer_Page FT_Intra = new FdaInterbankFundTransfer_Page();

		login.NAvigatetoHomePage(extents, driver);
		
		
		//own.ownAccpountFundTransfer(extents, driver);
		//FT_Intra.FdaInterbankFundTransfer(extents, driver);
		bill.billPayment(extents, driver);
		//card.IntrabankCreditCardPayment(extents, driver);
		//owncard.FdaOwnCreditCardPayement(driver, extents);
		//domBene.FdaDomesticBeneficiary(driver, extents);
		//domPayment.FdaDomesticPayments(extents, driver);
		//list.FdaListObjectives(driver, extents);




	}


	@AfterTest
	public void teardownTest()
	{
		System.out.println("Test Completed Successfully");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.close();
	}
	@AfterSuite
	public void teardown()
	{
		extents.flush();

	}

}
