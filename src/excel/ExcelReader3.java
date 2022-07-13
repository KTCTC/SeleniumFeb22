package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader3 {

	public static void main(String[] args) throws IOException {

    File f = new File(System.getProperty("user.dir")+"\\KTCTC.xlsx");
    
    FileInputStream fis = new FileInputStream(f);
    
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    
   XSSFSheet sh = wb.getSheet("Aug");
    
	
	 // XSSFRow row = sh.getRow(1);
	  
	 // XSSFCell cel = row.getCell(1);
	  
	 int lastRow = sh.getLastRowNum();
	 System.out.println(lastRow);
	 int lastrNum = sh.getPhysicalNumberOfRows();
	 System.out.println(lastrNum);
	 
	  
	for (int i=0;i<=lastRow;i++)
	{
		System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
	}
	
	for (int i=0;i<=lastRow;i++)
	{
		XSSFRow row = sh.getRow(i);
		  
		  XSSFCell cel = row.getCell(1);
		
		System.out.println(cel.getStringCellValue());
	}
	 
		

	}

}
