package property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public static void main(String[] args) throws IOException {

     File f = new File("C:\\Users\\91992\\OneDrive\\Desktop\\febprop.properties");
     
     FileInputStream fis = new FileInputStream(f);
		
     Properties propObj = new Properties();
     
     propObj.load(fis);
     
    String url = propObj.getProperty("baseURL");
    System.out.println(url);
    
    System.out.println(propObj.getProperty("userName"));
    System.out.println(propObj.getProperty("password"));
  
		

	}

}
