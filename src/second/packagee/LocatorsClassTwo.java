package second.packagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		/*
		 * By emailLocator = By.id("email");
		 * 
		 * WebElement emailTextBox = driver.findElement(emailLocator);
		 * 
		 * emailTextBox.sendKeys("Welcome to KTCTC");
		 */
		
		
		driver.findElement(By.id("email")).sendKeys("Sample Email"); // new object of webelement is created by findElement method
		
		driver.findElement(By.id("email")).sendKeys("Sample Email 1");// new object of webelement is created by findElement method
		
		

		
		WebElement passTextBox = driver.findElement(By.name("pass")); // only one object is created by findelement method and its reference is used 2 time
		
		passTextBox.sendKeys("Sample@123");
		passTextBox.sendKeys("second time");
		
		
		
		driver.findElement(By.name("login")).click();
		
	
	
		

	}

}
