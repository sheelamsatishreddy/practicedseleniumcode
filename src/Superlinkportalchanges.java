import java.awt.Button;
import java.io.File;
import java.io.IOException;
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
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;

public class Superlinkportalchanges {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver22.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		Timestamp currenttime = new Timestamp(System.currentTimeMillis());

		System.out.println(currenttime);

		String endtime = "2024-02-15 17:00:00";

		Timestamp endtimestamp = Timestamp.valueOf(endtime);

		driver.get("https://qa2.bingo.galabingo.com/en/bingo/schedule");

		String Parentroom = "Superlink 90 Parent";

		String Child1 = "Superlink 90 Child";

		String Child2 = "Superlink 80 Child";

		int i = 1;

		while (endtimestamp.after(currenttime)) {

			try {

				WebElement Parentelement = driver.findElement(By.xpath("//div[normalize-space()='" + Parentroom
						+ "']/preceding-sibling::div//span[contains(@class,'superlinks')]"));

				
				 WebElement Childelement1 = driver.findElement(By.xpath(
				 "//div[normalize-space()='"+ Child1 +"']/preceding-sibling::div//span[contains(@class,'"
				 + Child1 + "')]"));
				 

				WebElement Childelement2 = driver.findElement(By.xpath("//div[normalize-space()='" + Child1
						+ "']/preceding-sibling::div//span[contains(@class,'superlinks')]"));

				System.out.println("Portal Changes on Parent Room displayed: " + Parentelement.isDisplayed());

				System.out.println("Portal Changes on Child Room 1 displayed: " +
				Childelement1.isDisplayed());

				System.out.println("Portal Changes on Child Room 2 displayed: " + Childelement2.isDisplayed());

				Point point = Parentelement.getLocation();

				System.out.print(point.getX());

				int x = point.getX();

				int y = point.getY();

				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("window.scrollBy(" + x + "," + y + ")");

				TakesScreenshot scrShot = ((TakesScreenshot) driver);

				File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

				System.out.println(currenttime);

				File DestFile = new File("C:\\Satish\\Portalchangescheck\\screnshot" + i);

				i++;

				FileUtils.copyFile(SrcFile, DestFile);

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
