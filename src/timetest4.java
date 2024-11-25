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

public class timetest4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();
		
		driver.get("https://cms.test.env.works/sitecore/shell/Applications/Content%20Manager/default.aspx?fo=%7B6E04E7DA-12A4-49E4-A4B4-197E573180D1%7D");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("satishreddy.sheelam@ivycomptech.com");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Sa@satish5555");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.get("https://cms.test.env.works/sitecore/shell/Applications/Content%20Manager/default.aspx?fo=%7B6E04E7DA-12A4-49E4-A4B4-197E573180D1%7D");
		
		WebElement promotitle = driver.findElement(By.xpath("//div[normalize-space()='Promotion Title:']/parent::td//div[@class='scContentButtons']/following-sibling::div/input"));
		
		
		
		js.executeScript("arguments[0].scrollIntoView(true);", promotitle);
		
		Thread.sleep(1000);
		
		promotitle.click();
		
		promotitle.sendKeys("123");
		
		
		WebElement transactionhistory = driver.findElement(By.xpath("//div[normalize-space()='Transaction Description (this is what the player will see in their account history):']/parent::td//div[@class='scContentButtons']/following-sibling::div/input"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", transactionhistory);
		
		
		Thread.sleep(1000);
		
		transactionhistory.click();
		
		transactionhistory.sendKeys("123");
		
		WebElement TermsandConditions = driver.findElement(By.xpath("//div[normalize-space()='TermsAndConditionsText:']/parent::td"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", TermsandConditions);
		
		driver.findElement(By.xpath("//a[normalize-space()='Edit HTML']")).click();
		
		Thread.sleep(2000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe"));		
		
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//div[@class='scFlexContent']/textarea")).click();
		
		
		
		driver.findElement(By.xpath("//div[@class='scFlexContent']/textarea")).sendKeys("123");
		
		driver.findElement(By.xpath("//button[@id='OK']")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Save&Unlock']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Proposed']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Final']")).click();
		
		
		
		}
		
		
		
	}

