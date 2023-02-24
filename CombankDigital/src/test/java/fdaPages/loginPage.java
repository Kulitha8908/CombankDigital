package fdaPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import net.bytebuddy.asm.Advice.This;
import pages_Objects.fdaHomePage_Objects;
import pages_Objects.fdaLoginPageObjects;

import preRequist.setUp;
import utils.test;


public class loginPage extends test {

	
	
	public loginPage() throws Exception {
		
		// TODO Auto-generated constructor stub
	}

	//Login Page
	@SuppressWarnings("deprecation")
	@Parameters({})
	public void NAvigatetoHomePage(ExtentReports extend,WebDriver driver) throws Exception
	{
		String uName;
		fdaLoginPageObjects loginPage = new fdaLoginPageObjects(driver);
		ExtentTest test = extend.createTest("Navigate to FDA Home Page", "Sample description");
		
		File src = new File("C:/Users/Administrator/eclipse-workspace/CombankDigital_Live/testData/testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		 uName = sheet.getRow(1).getCell(0).getStringCellValue();
		 String pWard = sheet.getRow(1).getCell(1).getStringCellValue();
		 
		fdaHomePage_Objects homePage = new fdaHomePage_Objects(driver);
		 
		driver.get("https://www.combankdigital.com/#/login");
		
		//Type Username
		loginPage.loginPage_usernameTestbox(uName,test);
		
		//Click CoutinueButton 
		loginPage.loginPage_continueButton();
		//Type PasswordButton 
		
		loginPage.loginPage_passwordTextbox(pWard,test);
		//loginPage.loginPage_OtpTestBox("default");
		//loginPage.loginPage_passwordTextbox("default");
		//test.log(Status.PASS, "password sucessful");
		loginPage.loginPage_loginButton(test);
	//	test.log(Status.PASS, "Click login button");
		homePage.VerifyHomePage(test);
		
		
		//loginPage.availableBalance();
		
		
		//test.log(Status.INFO, "This step shows usage of log(status, details)");
       
       // test.info("This step shows usage of info(details)");
        
        //test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
       // test.addScreenCaptureFromPath("screenshot.png");
	}
}
