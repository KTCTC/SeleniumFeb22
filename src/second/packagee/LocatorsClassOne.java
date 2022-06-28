package second.packagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		By emailLocator = By.id("email");
		
		WebElement emailTextBox = driver.findElement(emailLocator);
		
		emailTextBox.sendKeys("Welcome to KTCTC");
		
		
		By passLocator = By.name("pass");
		
		WebElement passTextBox = driver.findElement(passLocator);
		
		passTextBox.sendKeys("Sample@123");
		
		By loginButtonLocator = By.name("login");
		
		WebElement loginButton = driver.findElement(loginButtonLocator);
		
		loginButton.click();
		

	}

}
