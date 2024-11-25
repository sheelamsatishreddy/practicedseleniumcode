import java.awt.Button;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Handlingdateelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		driver.get("https://www.path2usa.com/travel-companion/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement datefield = driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));
		
		Point point = datefield.getLocation();
		
		System.out.print(point.getX());
		
		int x = point.getX();
		
		int y = point.getY();
		
		 js.executeScript("window.scrollBy("+ x + ","+ y +")");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='dayContainer']/span"));
		
		int count = dates.size();
		
		int day = 17;
		
		for(int i=0; i<count; i++) {
			
			if (day ==  Integer.parseInt(dates.get(i).getText())) {
				
				dates.get(i).click();
				
				break;
				
			};
			
			
			
		} } }
			



