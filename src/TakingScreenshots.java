import java.awt.Button;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;


public class TakingScreenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		ChromeOptions Option = new ChromeOptions();

		Option.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(Option);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		driver.get("https://untrusted-root.badssl.com/");
		
		TakesScreenshot scrShot =((TakesScreenshot) driver);
		
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		Timestamp currenttime = new Timestamp(System.currentTimeMillis());
		
		System.out.println(currenttime);
		
		File DestFile=new File("C:\\Satish\\Portalchangescheck\\screnshot"+i);
		
		FileUtils.copyFile(SrcFile, DestFile);
		
		
		
		
	}

}
