package property;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyWritter {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\91992\\Feb22\\SeleniumFeb22\\febprop.properties");
		
		//FileOutputStream fos = new FileOutputStream(f);
		
		FileOutputStream fos = new FileOutputStream(f, true);
		
		Properties propObj = new Properties();
		
		propObj.setProperty("Phone", "PQ234");		
		
		propObj.store(fos, "updated key values");
		
		System.out.println("file written successfully");
		

	}

}
