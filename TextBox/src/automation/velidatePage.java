package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class velidatePage {
 
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Chrome.driver", "C:/Users/sonu/Downloads/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.airindia.in/Book-Flight.htm");
		
	    String ActualTitle =("Book Flight");
		 
	    String pageTitle = driver.getTitle();
	    
	  if(ActualTitle.equals(pageTitle))
	
	  {
		  System.out.println("i am on correct page");
	  }
		
	}
}
