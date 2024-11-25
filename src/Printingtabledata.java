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

public class Printingtabledata {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));

		System.out.println("There are " + rows.size() + " rows present in table");

		List<WebElement> columns = driver.findElements(By.cssSelector("table[name = 'courses'] tbody tr th"));

		System.out.println("There are " + columns.size() + " columns present in table");

		List<WebElement> secondRowdata = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));

		for (int i = 0; i < secondRowdata.size(); i++) {

			System.out.println(secondRowdata.get(i).getText());

		}

	}

}
