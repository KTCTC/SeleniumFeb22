package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeybordActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  // driver.get("https://demoqa.com/text-box");			 
		   driver.get("https://www.facebook.com/");
		   
		  WebElement emailbox = driver.findElement(By.id("email"));
		  
		  Actions act = new Actions(driver);
		  
		  act.click(emailbox).keyDown(Keys.SHIFT).sendKeys("welcome to ktctc").keyUp(Keys.SHIFT).perform();
		  
		  
		  
		  

	}

}
