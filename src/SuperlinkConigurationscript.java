import java.awt.Button;
import java.net.URL;
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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement;

public class SuperlinkConigurationscript {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();
		
		String qa2 = "https://angular-gms.ivycomptech.co.in/login";
		
		String E7 = "https://angular-prod-gms.ivycomptech.co.in/";

		String E7username = "Satish_E7";
		
		String E7password = "Test@123";
		
		String QA2username = "SatishQA2";
		
		String QA2password = "Test@1234"	;	
				
		driver.get(qa2);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(QA2username);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(QA2password);
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".btn-block")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[normalize-space()='Game Management']/preceding-sibling::Div")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Game schedule')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Superlinks Configuration')]")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Create Superlinks')]")).click();

		driver.findElement(By.xpath("//span[@class='popup-img mt-1']")).click();

		String[] Hours = { "0", "1", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
				"15", "16", "17", "18", "19", "20", "21", "22", "23" };

		String[] Minutes = { "06", "16", "26", "36", "46", "56" };

		String Seconds = "00";

		String[] HoursTo = { "0", "1", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
				"15", "16", "17", "18", "19", "20", "21", "22", "23" };

		String[] MinutesTo = { "11", "21", "31", "41", "51", "01" };

		int i;

		int j;

		int minuteslength = Minutes.length;

		Integer.toString(minuteslength);

		for (i = 0; i < Hours.length; i++) {

			for (j = 0; j < Minutes.length; j++) {

				driver.findElement(By.id("timeStmpFrmhh")).sendKeys(Hours[i]);

				driver.findElement(By.id("timeStmpFrmmm")).sendKeys(Minutes[j]);

				driver.findElement(By.id("timeStmpFrmss")).sendKeys(Seconds);

				//driver.findElement(By.id("timeStmpTohh")).sendKeys(HoursTo[i]);

				if (j == minuteslength - 1) {

					driver.findElement(By.id("timeStmpTohh")).sendKeys(HoursTo[i + 1]);

				} else {

					driver.findElement(By.id("timeStmpTohh")).sendKeys(HoursTo[i]);
					
					System.out.println(HoursTo[i]);
				
				}
				

				driver.findElement(By.id("timeStmpTomm")).sendKeys(MinutesTo[j]);

				driver.findElement(By.id("timeStmpToss")).sendKeys(Seconds);

				driver.findElement(By.xpath("//button[normalize-space()='ADD']")).click();

			}

			
		}
	}

}
