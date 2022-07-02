package getCssValue.method;

import java.util.prefs.BackingStoreException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/"); 
		   
		  WebElement textElement = driver.findElement(By.xpath("//h2[contains(text(),'you connect and share with')]"));
		  
		 String fontSize = textElement.getCssValue("font-size");
		 System.out.println(fontSize);
		 
		String col = textElement.getCssValue("color");
		System.out.println(col);
		String bacColor = textElement.getCssValue("background-color");
		System.out.println(bacColor);
		String fontFamily = textElement.getCssValue("font-family");
		System.out.println(fontFamily);

	}

}
