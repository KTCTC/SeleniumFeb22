package first.packagee;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91992\\OneDrive\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		
		ChromeDriver chromeDri1 = new ChromeDriver();
		
		EdgeDriver edgeDri = new EdgeDriver();
		
		ChromeDriver chromeDri2 = new ChromeDriver();
		
		chromeDri1.get("https://www.facebook.com/");
		
		edgeDri.get("https://demoqa.com/text-box");
		
		chromeDri2.get("https://www.javatpoint.com/");
		
		
		chromeDri1.close();
		edgeDri.close();
		chromeDri2.close();
		
		
		
		
		

	}

}
