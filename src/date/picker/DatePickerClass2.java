package date.picker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  // driver.get("https://demoqa.com/text-box");			 
		   driver.navigate().to("https://demoqa.com/date-picker");
		  
		  selectDateInCalender(driver, "2024", "January", "23");

	}
	
	public static void selectDateInCalender(WebDriver driver, String year_yyyy, String month_name, String date_dd)
	{
		 driver.findElement(By.id("datePickerMonthYearInput")).click();
		   
		   Select selYear = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		   selYear.selectByVisibleText(year_yyyy);
		   
		   Select selMonth = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		   selMonth.selectByVisibleText(month_name);
		   
		   driver.findElement(By.xpath("//*[contains(@aria-label,'"+month_name+"') and contains(@class,'0"+date_dd+"')]")).click();
	}
	
	

}
