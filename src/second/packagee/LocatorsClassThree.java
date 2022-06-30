package second.packagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocatorsClassThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();	
		
		driver.get("https://www.facebook.com/");			
		
		driver.findElement(By.id("email")).sendKeys("Sample Email"); 			
		
		
		WebElement passTextBox = driver.findElement(By.name("pass")); 
		
		passTextBox.sendKeys("Sample@123");		
		
		driver.findElement(By.name("login")).click();
		
	
	driver.close();
		

	}

}
