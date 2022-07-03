package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/select-menu"); 
		   
		   driver.findElement(By.xpath("//*[@id='withOptGroup']//input")).sendKeys("Group 2, option 2");
		   
		   driver.findElement(By.xpath("//*[@id='withOptGroup']//input")).sendKeys(Keys.ENTER);
		  
		  
		 
		

	}

}
