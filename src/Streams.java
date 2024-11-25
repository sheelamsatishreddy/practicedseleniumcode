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
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;

public class Streams {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver22.exe");

		//WebDriver driver = new ChromeDriver();

	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.manage().window().maximize();

		//driver.get("https://test.bingo.galabingo.com/en/bingo/schedule");

		List<String> names = new ArrayList<String>();

		names.add("Satish");
		names.add("Santosh");
		names.add("Srikanth");
		names.add("Sam");
		names.add("Jhon");
		names.add("Akshay");
		
		names.stream().filter(s->s.contains("S")).forEach(s->System.out.println(s));
		
		System.out.println("-------------------------------------------");
		
		names.stream().filter(s->s.contentEquals("Satish")).forEach(s->System.out.println(s));
		
		System.out.println("-------------------------------------------");
		
		names.stream().filter(s->s.contentEquals("Sam")).forEach(s->System.out.println(s));
		
		System.out.println("-------------------------------------------");
		
		names.stream().filter(s->s.endsWith("h")).forEach(s->System.out.println(s));
		
		System.out.println("-------------------------------------------");
		
		names.stream().filter(s->s.equals("Satish")).forEach(s->System.out.println(s));
		
		//names.stream().map(s->s.concat("Satish","Santhosh")).foreach
		
		System.out.println("-------------------------------------------");
		
		names.stream().filter(s->s.startsWith("S")).sorted().forEach(s->System.out.println(s));

	}

}
