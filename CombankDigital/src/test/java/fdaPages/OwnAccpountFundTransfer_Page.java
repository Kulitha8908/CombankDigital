package fdaPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ReportAggregatesListener;
import com.aventstack.extentreports.Status;

import pages_Objects.fdaHomePage_Objects;
import pages_Objects.fdaTransactionAndPaymentPage_Objects;
import preRequist.setUp;

public class OwnAccpountFundTransfer_Page {

	public void ownAccpountFundTransfer(ExtentReports extent, WebDriver driver) throws InterruptedException, Exception {
		SoftAssert softAssert = new SoftAssert();
		fdaHomePage_Objects homePage = new fdaHomePage_Objects(driver);
		fdaTransactionAndPaymentPage_Objects ownaccount = new fdaTransactionAndPaymentPage_Objects(driver);
		setUp su = new setUp();
		/*
		 * File src = new File(
		 * "C:/Users/Administrator/eclipse-workspace/CombankDigital_Live/testData/testdata.xlsx"
		 * ); FileInputStream fis = new FileInputStream(src); XSSFWorkbook wb = new
		 * XSSFWorkbook(fis); XSSFSheet sheet = wb.getSheet("FT-OwnAccount"); boolean
		 * amount = sheet.getRow(1).getCell(0).getBooleanCellValue();
		 */

		ExtentTest test = extent.createTest("OwnAccountFundtransfer", "Sample description");
		// homePage.verifyHomePageLogo();
		// test.log(Status.PASS, "verifyHomePageLogo");
		// test.addScreenCaptureFromPath(scr='img/logo.png?ver=e14bbb22aaf674eade914494180759a42dd975c7');

		//homePage.VerifyHomePage(test);
		
		homePage.Payment_Transfer_tab(test);
		//test.log(Status.PASS, "Click Payment Transfer tab");

		homePage.Payment_Transfer_Subtab(test);
		//test.log(Status.PASS, "Click Payment Transfer sub tab");
		homePage.dropdownSelectAndOption(test);
		//test.log(Status.PASS, "dropdownSelectAndOption");
		ownaccount.selectOwnAccFundTransfer(test);

		// ownaccount.selectFromAccount();
		ownaccount.selectFromAccount(test);

		// select to account
		ownaccount.selectToAccount();
		//test.log(Status.PASS, "selectToAccount");
		// Type Amount
		ownaccount.typeAmount("1",test);
		//test.log(Status.PASS, "typeAmount");

		///////////////////////

		// Type SendersAccountDescription
		ownaccount.type_SendersAccountDescription("Test Sender",test);
		//test.log(Status.PASS, "type_SendersAccountDescription");
		// Type BeneficiaryAccountDescription
		ownaccount.type_BeneficiaryAccountDescription("Test Bene",test);
		//test.log(Status.PASS, "type_BeneficiaryAccountDescription");
		// clickChekBox
		// ownaccount.clickChekBox();
		// test.log(Status.PASS, "clickChekBox");
		// click Submit Button
		ownaccount.clickSubmitButton(test);

		// click Confirm button
		ownaccount.clickConfirmButton(test);

		homePage.cliclHomepageButton();

		ownaccount.validateAmount(test);
		
		ownaccount.onlineActivity(test);

		//su.onlineActivity(test);
	}

}
