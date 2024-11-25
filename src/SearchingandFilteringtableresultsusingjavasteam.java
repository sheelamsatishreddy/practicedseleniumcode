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
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
import org.testng.Assert;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;

public class SearchingandFilteringtableresultsusingjavasteam {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//table[@class='table table-bordered']/thead/tr/th[1]")).click();

		String item = "Rice";
		
		driver.findElement(By.id("search-field")).sendKeys(""+item+"");
		
		List<WebElement> result = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		
		System.out.println(result.get(0).getText());
		
		List<WebElement> Se = result.stream().filter(s->s.getText().equalsIgnoreCase(item)).collect(Collectors.toList());
		
		result.stream().filter(s->s.getText().equalsIgnoreCase(item)).forEach(s->System.out.println(s));
		
		
		if(Se.get(0).getText().equalsIgnoreCase(item)) {
			
			System.out.println("Search item and Result is same");
		}
		else {
			
			System.out.println("Not Same");
		}
		
		
	}

	}

