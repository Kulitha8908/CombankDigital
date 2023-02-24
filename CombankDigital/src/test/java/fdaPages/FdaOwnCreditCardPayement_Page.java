package fdaPages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages_Objects.FdaOwnCreditCardPayement_Objects;
import pages_Objects.fdaHomePage_Objects;

public class FdaOwnCreditCardPayement_Page {

	public void FdaOwnCreditCardPayement(WebDriver driver,ExtentReports extent) 
	{
		ExtentTest log = extent.createTest("FdaOwnCreditCardPayement");
		log.log(Status.PASS, "FdaOwnCreditCardPayement");
		
		fdaHomePage_Objects home = new fdaHomePage_Objects(driver);
		FdaOwnCreditCardPayement_Objects card = new FdaOwnCreditCardPayement_Objects(driver);
		
		home.FdaOwnCreditCardPayement();
		log.log(Status.PASS, "FdaOwnCreditCardPayement");
		
		card.selectFromAccount("8190047169");
		log.log(Status.PASS, "selectFromAccount");
		card.selectPublicsavingaccount();
		log.log(Status.PASS, "selectPublicsavingaccount");
		card.typeAmount("1");
		log.log(Status.PASS, "typeAmount");
		card.selectRadiobutton();
		log.log(Status.PASS, "selectRadiobutton");
		card.clickSubmitbutton();
		log.log(Status.PASS, "clickSubmitbutton");
		//card.enterOTP("default");
		//log.log(Status.PASS, "default");
		card.clickConfirm();
		log.log(Status.PASS, "clickConfirm");
		
		//home.cliclHomepageButton();
		
		
		
		
		
		
		
		
		
		
	
	}
	

}
