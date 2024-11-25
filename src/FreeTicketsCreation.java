import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeTicketsCreation {
	
	public void main() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://backoffice.partygaming.com.e7new.com/home.action");
		
		//Enter user and password
		
		driver.findElement(By.name("j_username")).sendKeys("guest");
		
		driver.findElement(By.name("j_password")).sendKeys("123123");
		
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.xpath("//a[@class='nav-icon-ADT']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Bonus']")).click();
		
		driver.findElement(By.id("rbonus_AcquisitionRetentioncreateFreeBingoTicketCode")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ruleDescId")).sendKeys("FreeTickets");
		
		
	}

}
