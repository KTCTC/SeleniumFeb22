package radio.button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonClassIsDisplayedIsEnabledIsSelected2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/radio-button"); 		   
		   
		   driver.findElement(By.xpath("//*[@id='yesRadio']/following-sibling::label")).click();
		   
		   WebElement noRadioButton = driver.findElement(By.id("noRadio"));
		   
		   System.out.println(noRadioButton.isEnabled());
		   System.out.println(noRadioButton.isSelected());
		   System.out.println(noRadioButton.isDisplayed());
		   
		  

	}
	
	public static void checkOrUncheckFirstCheckBox(WebDriver driver,boolean flag)
	{
		
		boolean ff = driver.findElement(By.xpath("sfwef")).isSelected();
		
	}

}
