package windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsInSelenium2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   
		 
		   
		   driver.manage().window().maximize();
		   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
		   driver.get("https://demoqa.com/browser-windows");		   
		   
		   driver.findElement(By.id("windowButton")).click(); 
		  
		  switchToRequiredWindowWithIndexNumber(driver, 1);		 
		  
		 String msg = driver.findElement(By.id("sampleHeading")).getText();

		 System.out.println(msg);
		 
		 driver.close();		 
		 
		 switchToRequiredWindowWithIndexNumber(driver, 0);	
		 
		driver.quit(); 
		  
	}
	
	public static void switchToRequiredWindowWithIndexNumber(WebDriver dri , int index)
	{
		 int i = 0;
		 Set<String> allHandles = dri.getWindowHandles();
		 for (String each:allHandles)
		 {
			 if (i==index)
			 {
				 dri.switchTo().window(each);
				 break;
			 }
			 i++;
			 
		 }
	}

}
