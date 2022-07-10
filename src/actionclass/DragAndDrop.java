package actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  // driver.get("https://demoqa.com/text-box");			 
		   driver.get("https://demo.guru99.com/test/drag_drop.html");
		   
		   WebElement source = driver.findElement(By.xpath("//*[@id='fourth']/a"));
		   WebElement destination = driver.findElement(By.xpath("//*[@id='amt7']/li"));
		   
		   Actions act = new Actions(driver);
		   
		   act.dragAndDrop(source, destination).build().perform();
		   
		   WebElement source2 = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		   WebElement destination2 = driver.findElement(By.xpath("//*[@id='bank']/li"));
		   
		   act.clickAndHold(source2).moveToElement(destination2).release().perform();
		  
		   
		  
	}

}
