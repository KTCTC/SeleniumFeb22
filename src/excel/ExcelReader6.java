package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader6 {

	public static void main(String[] args) throws IOException {

		File f = new File(System.getProperty("user.dir") + "\\KTCTC.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheet("Aug");

		int lastRow = sh.getLastRowNum();
		
		for (int i = 0; i <= lastRow; i++) {
			XSSFRow row = sh.getRow(i);

			XSSFCell cel = row.getCell(0);

			String key = getCellValueAccordingToCellType(cel);
			System.out.println(key);

		}


		for (int i = 0; i <= lastRow; i++) {
			XSSFRow row = sh.getRow(i);

			XSSFCell cel = row.getCell(1);

			String val = getCellValueAccordingToCellType(cel);
			System.out.println(val);

		}

	}
	
	public static String getCellValueAccordingToCellType(XSSFCell cel)
	{
		Object data= null;
		switch (cel.getCellType()) {
		case STRING:
			data = cel.getStringCellValue();
			break;
		case BOOLEAN:
			data = cel.getBooleanCellValue();
			break;
		case NUMERIC:
			data = cel.getNumericCellValue();
			break;
		case FORMULA:
			data = cel.getCellFormula();

			break;
		case BLANK:
			System.out.println("Cell is blank");

			break;
		default:
			System.out.println("Unknown cell type");
			break;
		}
		
		return data.toString();

		
	}
	

}
