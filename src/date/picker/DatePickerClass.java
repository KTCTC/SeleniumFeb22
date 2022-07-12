package date.picker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  // driver.get("https://demoqa.com/text-box");			 
		   driver.navigate().to("https://demoqa.com/date-picker");
		   driver.findElement(By.id("datePickerMonthYearInput")).click();
		   
		   Select selYear = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		   selYear.selectByVisibleText("2023");
		   
		   Select selMonth = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		   selMonth.selectByVisibleText("October");
		   
		   driver.findElement(By.xpath("//*[contains(@aria-label,'October') and contains(@class,'011')]")).click();
		   

	}

}
