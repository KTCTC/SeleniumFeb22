package windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   
		 
		   
		   driver.manage().window().maximize();
		   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
		   driver.get("https://demoqa.com/browser-windows");
		   
		   String parentWindowid = driver.getWindowHandle();
		   System.out.println(parentWindowid);
		   
		   driver.findElement(By.id("windowButton")).click();
		   
		  Set<String> allHandles = driver.getWindowHandles();
		  
		  for (String each:allHandles)
		  {

           if (!each.equals(parentWindowid))
           {
        	   driver.switchTo().window(each);
           }
			  
		  }
		  
		 String msg = driver.findElement(By.id("sampleHeading")).getText();

		 System.out.println(msg);
		 
		 driver.close();
		 
		 driver.switchTo().window(parentWindowid);
		 
		
		 
		driver.quit(); 
		  
	}

}
