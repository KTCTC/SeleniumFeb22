package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxClassIsEnabledIsDIsplayedIsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demo.guru99.com/test/radio.html"); 
		   
		  WebElement chOne = driver.findElement(By.xpath("//input[@value='checkbox1']"));
		  
		  System.out.println(chOne.isDisplayed());
		  System.out.println(chOne.isEnabled());
		  System.out.println(chOne.isSelected());
		  
		  chOne.click();
		  
		  System.out.println(chOne.isDisplayed());
		  System.out.println(chOne.isEnabled());
		  System.out.println(chOne.isSelected());
		   

	}

}
