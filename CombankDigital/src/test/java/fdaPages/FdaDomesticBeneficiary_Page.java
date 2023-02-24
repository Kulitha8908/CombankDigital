package fdaPages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages_Objects.FdaDomesticBeneficiary_Object;
import pages_Objects.fdaHomePage_Objects;

public class FdaDomesticBeneficiary_Page {

	public void FdaDomesticBeneficiary(WebDriver driver,ExtentReports extent)
	{
		fdaHomePage_Objects home = new fdaHomePage_Objects(driver);
		FdaDomesticBeneficiary_Object bene = new FdaDomesticBeneficiary_Object(driver);

		ExtentTest log = extent.createTest("FdaDomesticBeneficiary_Page");

		//click_ManageBenificiaries
		home.click_ManageBenificiaries();
		log.log(Status.PASS,"click_ManageBenificiaries");

		//Select_BeneficiaryType
		bene.Select_BeneficiaryType();
		log.log(Status.PASS,"Select_BeneficiaryType");

		//Select Beneficiary's Bank
		bene.Select_BeneficiarysBank("Sampath Bank");
		log.log(Status.PASS,"Select_BeneficiarysBank");

		//Beneficiary's Account No
		bene.type_BeneficiarysAccountNo("23456784567");
		log.log(Status.PASS,"type_BeneficiarysAccountNo");

		//Beneficiary's Name
		bene.type_BeneficiarysName("testBene");
		log.log(Status.PASS,"type_BeneficiarysName");

		//Beneficiary's Identification
		bene.type_BeneficiaryIdentification("test bene id");
		log.log(Status.PASS,"type_BeneficiaryIdentification");

		//Beneficiary Description
		bene.type_BeneficiaryDescription("testDescription");
		log.log(Status.PASS,"type_BeneficiaryDescription");

		//SubmitButton
		bene.click_SubmitButton();
		log.log(Status.PASS,"SubmitButton");

		//Enter OTP
		/*bene.enterOTP("default");
		log.log(Status.PASS,"Enter OTP");*/

		//Confirm
	/*	bene.clickConfirmButton();
		log.log(Status.PASS,"clickConfirmButton");*/

		/*//Click Home Button
		home.cliclHomepageButton();*/



	}

}

