import java.awt.Button;
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

public class SuperlinkClientFunctionality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		driver.get("https://angular-prod-gms.ivycomptech.co.in/login");
		  
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Satish_E7");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
		
		driver.findElement(By.cssSelector(".btn-block")).click();
		
		driver.findElement(By.xpath("//p[normalize-space()='Game Management']/preceding-sibling::Div")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Game schedule')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Superlinks Configuration')]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Create Superlinks')]")).click();
		
		
		driver.findElement(By.xpath("//span[@class='popup-img mt-1']")).click();
		
		String[] Hours = {"08","09","10","10","11","12","12","13","14","14","15","16","17","18","19","19","20","20","21","21"};
		
		String[] Minutes = {"57","32","02","47","17","22","52","52","27","57","57","57","57","57","27","57","27","57","27","57"};
		
		String Seconds = "00";
		
        String[] HoursTo = {"09","09","10","10","11","12","12","13","14","15","16","17","18","19","19","20","20","21","21","22"};
		
		String[] MinutesTo = {"01","36","06","51","21","26","56","56","31","01","01","01","01","01","31","01","31","01","31","01"};
		
		
		int i;
		
		for(i=1; i<=20; i++) {
		
		driver.findElement(By.id("timeStmpFrmhh")).sendKeys(Hours[i]);
		
		driver.findElement(By.id("timeStmpFrmmm")).sendKeys(Minutes[i]);
		
		driver.findElement(By.id("timeStmpFrmss")).sendKeys(Seconds);
		
		driver.findElement(By.id("timeStmpTohh")).sendKeys(HoursTo[i]);
		
		driver.findElement(By.id("timeStmpTomm")).sendKeys(MinutesTo[i]);
		
		driver.findElement(By.id("timeStmpToss")).sendKeys(Seconds);
		
		driver.findElement(By.xpath("//button[normalize-space()='ADD']")).click();
		
			}
	}

}
