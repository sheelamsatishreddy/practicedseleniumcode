import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class Actions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://amazon.com");
		
		
		driver.findElement(By.id("nav-link-accountList"));
		
		org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(driver);
		
		action.1508
		
		
		
		
		
	
		
		
			}


}

		

