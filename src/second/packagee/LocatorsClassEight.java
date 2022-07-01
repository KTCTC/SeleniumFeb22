package second.packagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocatorsClassEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/webtables");			
		
	String firstName = driver.findElement(By.xpath("//div[contains(text(),'cierra@example.com')]/preceding-sibling::div[3]")).getText();
	System.out.println(firstName);
        String dept = driver.findElement(By.xpath("//div[contains(text(),'cierra@example.com')]/following-sibling::div[2]")).getText();
        System.out.println(dept);
    
	}

}
