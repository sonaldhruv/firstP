package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
	public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.Chrome.driver", "C:/Users/sonu/Downloads/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://en.wikipedia.org/wiki/2020_national_electoral_calendar");
				
//		driver.findElement(By.xpath("//a[contains(text(),'Elections')]")).click();
//		
//		driver.get("https://agiledevopswest.techwell.com/?utm_source=softwaretestingstuff&utm_medium=referral&utm_campaign=mk-adw20-softwaretestingstuff-fes");
//		
//		driver.findElement(By.xpath("//a[@href=\'/speakers\']")).click();
//		
//		
		
		driver.manage().window().maximize();
		
//	 

		
	List<WebElement> Links = driver.findElements(By.tagName("nav"));
			
		
		for(int i=0;i<Links.size();i++);
		{
			int i = 0;
			System.out.println(Links.get(i).getText());
		}
	}

}



