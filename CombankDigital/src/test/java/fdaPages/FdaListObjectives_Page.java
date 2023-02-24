package fdaPages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages_Objects.FdaListObjectives_Objects;
import pages_Objects.fdaHomePage_Objects;

public class FdaListObjectives_Page {

	public void FdaListObjectives(WebDriver driver,ExtentReports extent)
	{
		fdaHomePage_Objects home = new fdaHomePage_Objects(driver);
		FdaListObjectives_Objects list = new FdaListObjectives_Objects(driver);
		ExtentTest log = extent.createTest("FdaListObjectives");
		
		//click_ListObjectives
		home.click_ListObjectives();
		log.log(Status.PASS,"click_ListObjectives");
		
		//Click_CreateNewObjective
		list.Click_CreateNewObjective();
		log.log(Status.PASS,"click_ListObjectives");
		
		//Objective Type
		list.select_ObjectiveType();
		log.log(Status.PASS,"select_ObjectiveType");

		//Next button
		list.click_Nextbutton();
		log.log(Status.PASS,"click_Nextbutton");

		//Target Amount in LKR
		list.type_TargetAmount("50");
		log.log(Status.PASS,"Target Amount in LKR");

		//I agree with the terms of use
		list.click_Agree();
		log.log(Status.PASS,"I agree with the terms of use");
		
		//Submit button
		list.button_Submit();
		log.log(Status.PASS,"Submit button");

	/*	//clickHomepageButton
		home.cliclHomepageButton();
		log.log(Status.PASS,"cliclHomepageButton"); */
		
		
	}
	
	
}
