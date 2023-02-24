package preRequist;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.testng.internal.Utils;
import org.testng.reporters.jq.TimesPanel;
import org.openqa.selenium.io.FileHandler;

import java.time.Duration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class setUp {
	ExtentReports extent = new ExtentReports();
	WebDriver driver = null;
	//SoftAssert softAssert = new SoftAssert();
	static Properties prop = new Properties();
	public static String projectPath = System.getProperty("user.dir"); 

	
	public ExtentReports extentReport()
	{
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentReports.html");
		extent.attachReporter(htmlreporter);
		//ExtentTest ts = extents.createTest(TCname,Descriptin);
		
		driver.manage().window().maximize();
	
		return extent;
	}
	
	public SoftAssert softAssert() 
	{
		SoftAssert softAssert = new SoftAssert();
		
		return softAssert;
		
	}
	
	@SuppressWarnings("deprecation")
	public WebDriver stratChromeDriver()
	{
		if(this.driver != null) {
			return driver;
		} else {
			
			String ProjectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", ProjectPath+"/drivers/chromedriver/chromedriver.exe");
			this.driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(240,TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(TimeSpan.FromSeconds(500));
			return driver;
		}
		
	}
	
	public WebElement waitForElement(By locator, Duration timeout) 
	{
		WebElement element = new WebDriverWait(driver, timeout).until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
		
	}
	
	//*************wite data to Assert property file****************//
	public void setData(String type,String value)
	{
	
	try {
		//String a  = driver.findElement(HomeavailableBalance).getText();
		OutputStream output = new FileOutputStream(projectPath+"/src/test/java/Assert/Assert.properties");
		
		prop.setProperty(type,value);
		
		
		prop.store(output, "Assert Property file location");
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	//////////*************Excel file project path***************////////////////
	public XSSFWorkbook excelDataFilePath()
	{
		XSSFWorkbook wb = null;
		projectPath = System.getProperty("user.dir");
		try {
			 wb = new XSSFWorkbook(projectPath+"/testData/testdata.xlsx");
			
		} catch (IOException exp) {
			// TODO Auto-generated catch block
			exp.printStackTrace();
								
		}
		return wb;
		
		
	
	}
	
	//************ capture screenshot  ***************//
	
	public String captureScreenShot(WebDriver driver,By ob,String fileName)
	{
		File src = ((TakesScreenshot)driver.findElement(ob)).getScreenshotAs(OutputType.FILE);
		//String screenShotPath = System.getProperty("user.dir")+"/Screenshots/"+fileName+""+".png";
		String screenShotPath = System.getProperty("user.dir")+"/target/surefire-reports"+fileName+""+".png";
		
		try {
			FileHandler.copy(src, new File(screenShotPath));
			System.out.println("Screenshot captured");
		} catch (IOException e) {
			System.out.println("Unable to capture screenshot"+e.getMessage());
			e.printStackTrace();
		}
		
	
		
		return screenShotPath;
		
	}
	
	public String captureScreenShot2(WebDriver driver,By ob,String fileName)
	{
		File src = ((TakesScreenshot)driver.findElements(ob)).getScreenshotAs(OutputType.FILE);
		//String screenShotPath = System.getProperty("user.dir")+"/Screenshots/"+fileName+""+".png";
		String screenShotPath = System.getProperty("user.dir")+"/target/surefire-reports"+fileName+""+".png";
		
		try {
			FileHandler.copy(src, new File(screenShotPath));
			System.out.println("Screenshot captured");
		} catch (IOException e) {
			System.out.println("Unable to capture screenshot"+e.getMessage());
			e.printStackTrace();
		}
		
	
		
		return screenShotPath;
		
	}
	
	public void onlineActivity(ExtentTest test) throws IOException
	{
		driver.findElement(By.xpath("//div/a[contains(text(),'Self Management')]")).click();
		driver.findElement(By.xpath("//li[2]/a[contains(text(),'Online Activity')]")).click();
		 
		//By  tab_PaymentandTransfer = By.xpath("//ul[@id='menu']/li[2]/div/div[2]/div/ul/li/a");
		//By  Link_Payment_Transfer = By.xpath("//div/a[contains(text(),'Self Management')]");
		
		
		By a = By.xpath("//html[@id='ng-app']");	
		test.pass("Fromaccount", MediaEntityBuilder.createScreenCaptureFromPath(captureScreenShot(driver, a, "Fromaccount.png")).build());
	}
	
	public void teardown()
	{
		
		extent.flush();
		
	}





	
}
