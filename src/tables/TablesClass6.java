package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesClass6 {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demo.guru99.com/test/web-table-element.php");	
		   float cntPrice = getCurrentPriceOfRequiredComapny(driver, "Bank");
		   System.out.println(cntPrice);
		

	}
	
	public static float getCurrentPriceOfRequiredComapny(WebDriver driv,String companyName)
	{
	String name = driv.findElement(By.xpath("//*[@class='dataTable']/tbody/tr/td/a[contains(text(),'"+companyName+"')]/parent::td/following-sibling::td[3]")).getText();
	
	 float price = Float.parseFloat(name);
	 return price;
	
	
	}

}
