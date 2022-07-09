package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesClass4 {

	public static void main(String[] args) {
		int z = 8;
		String str = "ABCD "+z+"pqrs";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demo.guru99.com/test/web-table-element.php");
		   
		
		  
		 
		String cc = driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr")).findElement(By.xpath("td[1]/a")).getText();
		System.out.println(cc);
        



	}

}
