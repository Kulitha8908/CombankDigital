package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import fdaPages.loginPage;

public class test {
	
	public test() throws Exception
	{
	
	}
	String uName;
	
	@Test
	public void  testData() throws Exception
	{
		
		
		File src = new File("C:/Users/Administrator/eclipse-workspace/CombankDigital_Live/testData/testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		 uName = sheet.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(uName);
		
		
		wb.close();
		
		
	}
	
	
	

}
