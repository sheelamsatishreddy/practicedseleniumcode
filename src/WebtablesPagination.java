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

public class WebtablesPagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver22.exe");

		WebDriver driver = new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//table[@class='table table-bordered']/thead/tr/th[1]")).click();
		
		List<WebElement> items = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]")); 
		
		/*List<String>OriginalList =  items.stream().map(item->item.getText()).collect(Collectors.toList());
		
		List<String> SortedList = OriginalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(OriginalList.equals(SortedList));
		
		OriginalList.forEach(item->System.out.println(item));
		
		System.out.println("-------------------------------------------------------------");
		
		SortedList.forEach(item->System.out.println(item));
		
		List<String> price = items.stream().filter(s->s.getText().contains("Brinjal")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));*/
		
		List<String> price;
		
		do {
			
			items = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
			
			price = items.stream().filter(s->s.getText().contains("Wheat")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		if(price.size()<1) {
			
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
	
		}
		}while(price.size()<1);
	
		price.forEach(a->System.out.println(a));
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		
		String pricevalue =  s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return pricevalue;
	}

}
