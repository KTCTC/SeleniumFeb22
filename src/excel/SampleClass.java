package excel;

import java.util.ArrayList;

public class SampleClass {

	public static void main(String[] args) {
		
		
		ExcelHelper exH = new ExcelHelper("KTCTC.xlsx", "Aug");
		ArrayList<String> keys = exH.getKeysList();
		System.out.println(keys);
		
		ArrayList<String> values = exH.getValueList();
       System.out.println(values);
	}

}
