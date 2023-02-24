package Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import fdaPages.loginPage;
import pages_Objects.fdaBillPayment_Objects;
import pages_Objects.fdaLoginPageObjects;

public class PropertiesFile {
/*	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentReports.html");
	
	
	
	ExtentTest log  = extent.createTest("TEST Asset");*/
	
	static SoftAssert softAssert = new SoftAssert();
	
	public static void name(String[] args) 
	{
		
		getproperties(); 
	}
	@Test
	public static void getproperties() 
	{
		
		
		try {
			Properties prop = new Properties();
			String projectPath = System.getProperty("user.dir");
			InputStream input = new FileInputStream(projectPath+"/src/test/java/Assert/Assert.properties");
			prop.load(input);
			String AvailableBanlanceHome = prop.getProperty("AvailableBanlanceHome").replaceAll("\\D+", "");
			String AvailableAmount = prop.getProperty("AvailableAmount").replaceAll("\\D+", "");
			String newAmount = prop.getProperty("newAmount").replaceAll("\\D+", "");
			
			Integer n = Integer.parseInt(AvailableAmount);
			Integer d = Integer.parseInt(AvailableBanlanceHome);
			Integer e = Integer.parseInt(newAmount);
							
			//int number = Integer.parseInt(AvailableBanlanceHome);
			
			Integer tot1 = n/100;
			Integer tot2 = d/100;
			//Integer tot3 = 200;+
			Integer tot3 = tot1-e;
			
			System.out.println(n/100);
			System.out.println(d/100);
			System.out.println(e);                                                                      
			System.out.println(tot1-200);
			
			//softAssert.assertEquals(tot2, tot3,"FAIL");
			softAssert.assertEquals(tot3, tot2,"FAIL");
			
			
			System.out.println("test23");
		//	softAssert.assertNotEquals(tot2, tot3, "fail");
			
			//Assert.assertEquals(tot2, tot3);
			
			softAssert.assertAll();
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		 
	}

	
	

}
