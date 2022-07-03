package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultiClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/select-menu"); 
		  
		   
		   WebElement dropDown = driver.findElement(By.id("cars"));// provide element which will locate to select tag of dropdown
		   Select sel = new Select(dropDown);
		   
		  boolean flag = sel.isMultiple();
		  System.out.println(flag);
		   
		sel.selectByVisibleText("Volvo");		   
		sel.selectByVisibleText("Saab");
		sel.selectByVisibleText("Audi");
		sel.deselectByVisibleText("Volvo");
		sel.deselectAll();
		
		

	}

}
