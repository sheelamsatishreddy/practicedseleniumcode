import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		/*WebElement a = driver.findElement(By.xpath("//a[@class='selected']  //span[@class='text-label']"));
		
		Thread.sleep(3000);
		
		System.out.println(a.getTagName());

		System.out.println(a.getText());
		
		System.out.println(a.getDomProperty(null));*/
		
		WebElement a = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		
		
		a.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@value='ATQ']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//Div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(2000);
		
		List<WebElement> Options =  driver.findElements(By.cssSelector("ul[id='ui-id-1'] li"));
		
		
		//Int Option = Options.size();
		
		for(WebElement option :Options) {
			
			if(option.getText().equalsIgnoreCase("India")) {
		
				option.click();
			
			
				break;
		}
		
		
	}
		
		Thread.sleep(1000);
		
		WebElement checkbox = driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']"));
		
		System.out.println("Checkbox staus is "+checkbox.isSelected());
		
		checkbox.click();
		
		System.out.println("Checkbox staus is "+checkbox.isSelected());
		
	
	}


}
