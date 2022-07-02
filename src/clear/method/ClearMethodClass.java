package clear.method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethodClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/"); 
		   
		   WebElement emailBox = driver.findElement(By.id("email"));
		   emailBox.sendKeys("Welcome to KTCTC");
		   
		   List<WebElement> listofWebElement = driver.findElements(By.xpath("//form/div//input"));
		   emailBox.clear();
		   for (WebElement each:listofWebElement)
		   {
			   each.sendKeys("find Elements method");
		   }

	}

}
