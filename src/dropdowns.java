import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//driver.navigate().to("https://www.facebook.com");
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("select[name='ctl00$mainContent$DropDownListCurrency'] option:nth-child(4)")).click();
		
		driver.findElement(By.cssSelector("select[name='ctl00$mainContent$DropDownListCurrency'] option:nth-child(4)")).click();
		
		/*Select dropdown = new Select(staticdropdown);
				
        dropdown.selectByIndex(3);
        
        Thread.sleep(3000);
        
        dropdown.selectByVisibleText("INR");
        
        Thread.sleep(3000);
        
        dropdown.selectByValue("AED");
        
        
        driver.findElement(By.id("divpaxinfo")).click();

        int i = 1;
        
        Thread.sleep(1000);
        
        while(i<5){
        driver.findElement(By.id("hrefIncAdt")).click();
        i++;
        }*/
	}


}

		

