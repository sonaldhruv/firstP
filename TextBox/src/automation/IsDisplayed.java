package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Chrome.driver", "C:/Users/sonu/Downloads/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.airindia.in/Book-Flight.htm");
		
//		boolean Test =driver.findElement(By.id("bdMainSite")).isDisplayed();
		if (driver.findElement(By.id("bdMainSite")).isDisplayed())
		{	
		
			System.out.println("correct page");
					
				
//		c.println(Test);
		}
	}

}
