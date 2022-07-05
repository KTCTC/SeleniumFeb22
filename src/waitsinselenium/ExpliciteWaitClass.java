package waitsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWaitClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/alerts");
		   
		   WebElement altButton = driver.findElement(By.id("alertButton"));
		   
		   driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]")).click();
		   
		   WebDriverWait wt = new WebDriverWait(driver, 10);
		  ExpectedCondition<Boolean> ss = ExpectedConditions.invisibilityOf(altButton);
		   
		   wt.until(ss);
		   
		   
		   WebDriverWait wt1 = new WebDriverWait(driver, 10);
		   wt.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("tabButton"))));
		   
		   
		System.out.println("After exception");

	}

}
