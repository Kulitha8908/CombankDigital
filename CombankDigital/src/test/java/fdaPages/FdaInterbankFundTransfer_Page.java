package fdaPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages_Objects.FdaInterbankFundTransfer_Objects;
import pages_Objects.fdaHomePage_Objects;

public class FdaInterbankFundTransfer_Page {
	 
	@Test
	public void FdaInterbankFundTransfer(ExtentReports test,WebDriver driver) throws IOException
	{
		
		fdaHomePage_Objects home = new fdaHomePage_Objects( driver);
		FdaInterbankFundTransfer_Objects intra = new FdaInterbankFundTransfer_Objects(driver);
		ExtentTest tx = test.createTest("IntraBank Transaction");
		
		
		/*File src = new File("C:/Users/Administrator/eclipse-workspace/CombankDigital_Live/testData/testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRichTextString fromAccount = sheet.getRow(2).getCell(0).getRichStringCellValue();*/
		
		home.Payment_Transfer_tab(tx);
		home.Payment_Transfer_Subtab(tx);
		intra.select_SeletANOption(tx);
		intra.selectIntraBankTransfer(tx);
		intra.selectFromAccount("8190047169", tx);
		intra.typeBeneAccount("8100111936", tx);
		intra.typeBeneAmount("10", tx);
		intra.typeSenderDescription(tx, "testSender");
		intra.typeBeneDescription(tx, "testBene");
		intra.selectPurposeCode(tx, "Miscellaneous Payments");
		intra.click_AgreeButton(tx);
		intra.clickSubmitButton(tx);
		
		
		
		
	}
}
