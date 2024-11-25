import java.awt.Button;
import java.io.File;
import java.sql.Timestamp;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;

public class timetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	/* System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver22.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://test.bingo.galabingo.com/en/bingo/schedule");
		
		  //Timestamp currenttime = new Timestamp(System.currentTimeMillis());
	     
	      
	   /*   String endtime ="2024-01-21 21:45:15";  
	      Timestamp endtimestamp= Timestamp.valueOf(endtime);  
	      
	     
	        System.out.println("value of Timestamp : "+endtimestamp);    
		
		if(endtimestamp.after(currenttime)) {
			
			System.out.println("Hello");
		*/
		 
		//  WebElement Parentelement = driver.findElement(By.xpath("//div[normalize-space()='100k Client test']/preceding-sibling::div//span[contains(@class,'superlinks')]"));

			/*
			 * WebElement Childelement1 = driver.findElement(By.xpath(
			 * "//div[normalize-space()='90 ball Socket']/preceding-sibling::div//span[contains(@class,'"
			 * + Child1 + "')]"));
			 */

		/*	WebElement Childelement2 = driver.findElement(By.xpath("//div[normalize-space()='Prizedrop 90']/preceding-sibling::div//span[contains(@class,'prize-drop')]"));

		//	System.out.println("Portal Changes on Parent Room displayed: " + Parentelement.isDisplayed());

			// System.out.println("Portal Changes on Child Room 1 displayed: " +
			// Child1.isDisplayed());

		System.out.println("Portal Changes on Child Room 2 displayed: " + Childelement2.isDisplayed());

		//	Point point = Childelement2.getLocation();

			//System.out.println(point.getX());
			
		//	System.out.println(point.getY());

		//	int x = point.getX();

			//int y = point.getY();
			
		//	y=y-300;
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'nearest'})), Childelement2");
			
			//js.executeScript("window.scrollBy(" + x + "," + y + ")");

		//	TakesScreenshot scrShot = ((TakesScreenshot) driver);

			//File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		//	System.out.println(currenttime);
//
		//	File DestFile = new File("C:\\Satish\\Portalchangescheck\\screnshot" + i);

		//	i++;

		//	FileUtils.copyFile(SrcFile, DestFile);
*/
		  
final Date currentTime = new Date();
		

		final SimpleDateFormat sdf =
		        new SimpleDateFormat("MM/dd/yyyy hh:mm a");

		// Give it to me in GMT time.
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date startdate = DateUtils.addMinutes(currentTime, 5);
		
		//System.out.println("GMT time: " + sdf.format(currentTime)); 
		
		
		}
		
		
		
	}

