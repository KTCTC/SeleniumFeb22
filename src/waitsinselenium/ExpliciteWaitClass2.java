package waitsinselenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitClass2 {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/radio-button");
		   
		WebElement noRadio = driver.findElement(By.id("noRadio"));
		   
		 
		 WebDriverWait wt = new WebDriverWait(driver, 5);
		 
		// wt.pollingEvery(200, TimeUnit.MILLISECONDS);
		 
		wt.pollingEvery(Duration.ofMillis(200));
		 
		 wt.until(ExpectedConditions.elementToBeSelected(noRadio));
		 
		   
		System.out.println("After exception");

	}

}
