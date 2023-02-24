package utils;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import preRequist.setUp;
public class ExcleUtils {
	String projectPath;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	setUp su = new  setUp();
	
	public ExcleUtils()
	{
		
	}

	
	public void getRowcount()
	{
		try {
			projectPath = System.getProperty("user.dir");
			wb = new XSSFWorkbook(projectPath+"/testData/testdata.xlsx"); 
			sheet = wb.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();


		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
	public void getCellString()
	{
		try {
			projectPath = System.getProperty("user.dir");
			wb = new XSSFWorkbook(projectPath+"/testData/testdata.xlsx");
			sheet = wb.getSheet("Sheet1");
			String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(cellData);

		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		
	}
	@Test	
	//public void getCellNumber(int rowNum,int colNum)
	public void getCellNumber()
	{
		XSSFRichTextString cellData = null;
		try {
			XSSFWorkbook a = su.excelDataFilePath();
		    sheet= a.getSheet("Sheet1");
			 cellData = sheet.getRow(1).getCell(1).getRichStringCellValue();
			
			  
			System.out.println(cellData);

		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	
	}
}
