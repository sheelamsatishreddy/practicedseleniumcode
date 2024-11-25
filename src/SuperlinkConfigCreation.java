import java.awt.Button;https://jira.corp.entaingroup.com/secure/Dashboard.jspahttps://jira.corp.entaingroup.com/secure/Dashboard.jspa
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SuperlinkConfigCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver1.exe");

		WebDriver driver = new ChromeDriver();

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		driver.get("http://angular-gms.ivycomptech.co.in/login");
		  
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("SatishQA2");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
		
		driver.findElement(By.cssSelector(".btn-block")).click();
		
		driver.findElement(By.xpath("//p[normalize-space()='Game Management']/preceding-sibling::Div")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Game schedule')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Superlinks Configuration')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();		
			
	}

}
