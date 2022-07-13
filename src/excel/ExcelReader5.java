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

public class ExcelReader5 {

	public static void main(String[] args) throws IOException {

		File f = new File(System.getProperty("user.dir") + "\\KTCTC.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh = wb.getSheet("Aug");

		int lastRow = sh.getLastRowNum();
		
		for (int i = 0; i <= lastRow; i++) {
			XSSFRow row = sh.getRow(i);

			XSSFCell cel = row.getCell(0);

			CellType typ = cel.getCellType();

			switch (typ) {
			case STRING:
				System.out.println(cel.getStringCellValue());
				break;
			case BOOLEAN:
				System.out.println(cel.getBooleanCellValue());
				break;
			case NUMERIC:
				System.out.println(cel.getNumericCellValue());
				break;
			case FORMULA:
				System.out.println(cel.getCellFormula());

				break;
			case BLANK:
				System.out.println("Cell is blank");

				break;
			default:
				System.out.println("Unknown cell type");
				break;
			}

		}


		for (int i = 0; i <= lastRow; i++) {
			XSSFRow row = sh.getRow(i);

			XSSFCell cel = row.getCell(1);

			CellType typ = cel.getCellType();

			switch (typ) {
			case STRING:
				System.out.println(cel.getStringCellValue());
				break;
			case BOOLEAN:
				System.out.println(cel.getBooleanCellValue());
				break;
			case NUMERIC:
				System.out.println(cel.getNumericCellValue());
				break;
			case FORMULA:
				System.out.println(cel.getCellFormula());

				break;
			case BLANK:
				System.out.println("Cell is blank");

				break;
			default:
				System.out.println("Unknown cell type");
				break;
			}

		}

	}
	
	

		
	
	

}
