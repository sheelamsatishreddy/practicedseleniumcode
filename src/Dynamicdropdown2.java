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
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Dynamicdropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("autocomplete")).sendKeys("ind");

		Thread.sleep(1000);

		List<WebElement> dropitems = driver.findElements(By.className("ui-menu-item-wrapper"));

		System.out.println(dropitems.size());

		Thread.sleep(1000);

		for (int i = 0; i < dropitems.size(); i++) {

			if (dropitems.get(i).getText().equalsIgnoreCase("India")) {

				// dropitems.get(i).click();

				for (int y = 0; y <= i; y++) {

					Thread.sleep(1000);

					driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

					Thread.sleep(1000);

				}

			}

		}

		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String country = "return document.getElementById('autocomplete').value;";
		
		String text =(String) js.executeScript(country);
		
		System.out.println(text);
		
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
	}
}
