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
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;

public class Superlinkportalchanges2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver22.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		Timestamp currenttime = new Timestamp(System.currentTimeMillis());

		System.out.println(currenttime);

		String endtime = "2024-01-29 16:38:00";

		Timestamp endtimestamp = Timestamp.valueOf(endtime);

		driver.get("https://test.bingo.coral.co.uk/en/bingo/rooms");

		String Parentroom = "Prizedrop 90";

		String Child1 = "Prizedrop 80";

		String Child2 = "Prizedrop 75";

		int i = 1;

		while (endtimestamp.after(currenttime)) {

			try {

				WebElement Parentelement = driver.findElement(By.xpath("//div[normalize-space()='" + Parentroom
						+ "']/preceding-sibling::div//span[contains(@class,'superlinks')]"));

				
				 WebElement Childelement1 = driver.findElement(By.xpath(
				 "//div[normalize-space()='"+Child1+"']/preceding-sibling::div//span[contains(@class,'superlinks')]"));
				 

				WebElement Childelement2 = driver.findElement(By.xpath("//div[normalize-space()='" + Child2
						+ "']/preceding-sibling::div//span[contains(@class,'superlinks')]"));

				System.out.println("Portal Changes on Parent Room displayed: " + Parentelement.isDisplayed());

				System.out.println("Portal Changes on Child Room 1 displayed: " + Childelement1.isDisplayed());

				System.out.println("Portal Changes on Child Room 2 displayed: " + Childelement2.isDisplayed());
				
			/*	JavascriptExecutor js = (JavascriptExecutor) driver;
				
				js.executeScript("arguments[0].scrollIntoView(true);", Parentelement);

				TakesScreenshot scrShot = ((TakesScreenshot) driver);

				File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

				System.out.println(currenttime);

				File DestFile = new File("C:\\Satish\\Portalchangescheck1\\screnshot" + i);

				FileUtils.copyFile(SrcFile, DestFile);*/

				Thread.sleep(60000);

				currenttime = new Timestamp(System.currentTimeMillis());

			}

			catch (Exception e) {

				System.out.println("Portal changes not working at GMT time: " + currenttime);

				Thread.sleep(60000);

				currenttime = new Timestamp(System.currentTimeMillis());

			}

		}

	}
}
