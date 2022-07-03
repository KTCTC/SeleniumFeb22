package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/select-menu"); 
		   WebElement dropDown = driver.findElement(By.id("oldSelectMenu"));// provide element which will locate to select tag of dropdown
		   Select sel = new Select(dropDown);
		   
		   sel.selectByIndex(1);
		   
		   sel.selectByValue("4");
		   
		   sel.selectByVisibleText("Indigo");
		   
		   sel.deselectByVisibleText("Indigo");// we can not use deselect with single value drop down
		   

	}

}
