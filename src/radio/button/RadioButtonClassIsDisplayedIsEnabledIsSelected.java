package radio.button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonClassIsDisplayedIsEnabledIsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demo.guru99.com/test/radio.html");   		   
		   
		   WebElement radioButton = driver.findElement(By.xpath("//input[@value='Option 3']"));
		   
		   System.out.println(radioButton.isDisplayed());
			  System.out.println(radioButton.isEnabled());
			  System.out.println(radioButton.isSelected());
			  
			  radioButton.click();
			  
			  System.out.println(radioButton.isDisplayed());
			  System.out.println(radioButton.isEnabled());
			  System.out.println(radioButton.isSelected());

	}

}
