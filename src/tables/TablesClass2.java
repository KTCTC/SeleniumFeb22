package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demo.guru99.com/test/web-table-element.php");
		   
		 List<WebElement> cName = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]/a"));
		  List<WebElement> cntPrice = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[4]"));
		 
		
        
		 for (WebElement each:cName)
		 {
			 System.out.println(each.getText());
		 }
		 
		 for (WebElement each: cntPrice)
		 {
			 System.out.println(each.getText());
		 }



	}

}
