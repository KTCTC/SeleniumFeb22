package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementAndClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  // driver.get("https://demoqa.com/text-box");			 
		   driver.get("https://demoqa.com/buttons");
		   
		   Actions act = new Actions(driver);
		   
		   act.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Book Store Application')]"))).perform();
		   
		   act.click(driver.findElement(By.xpath("//*[contains(text(),'Interactions')]"))).perform();
		   
		  
	}

}
