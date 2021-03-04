package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextBoxWidth {

	public static void main(String[] args) {
		 
		 
		 System.setProperty("Webdriver.Chrome.driver", "C:/Users/sonu/Downloads/chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.airindia.in/Book-Flight.htm");
         
		int Width = driver.findElement(By.id("ContentPlaceHolder1_UserLanguage1_drpCountry")).getSize().getWidth();
		System.out.println(Width);
		
		
		if(Width>9) {
		
			driver.findElement(By.id("ContentPlaceHolder1_UserLanguage1_drpCountry")).sendKeys("south Africa");
		}
		
		else {
			
			System.out.println("unvalid name");
		}
		
		}
		
	}
