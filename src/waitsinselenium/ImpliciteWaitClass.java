package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteWaitClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   driver.get("https://www.facebook.com/");	
		   
		   driver.findElement(By.id("email")).sendKeys("Sample wait");   
		   
		   driver.findElement(By.id("pass")).sendKeys("wgwwerwr");
		   driver.findElement(By.name("login")).click();
		   
		   driver.close();
		   

	}

}
