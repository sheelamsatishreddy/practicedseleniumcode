import java.awt.Button;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class SwtichingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.cssSelector(".blinkingText")).click();

		Set<String> windowIds = driver.getWindowHandles();

		Iterator<String> it = windowIds.iterator();

		String parentID = it.next();

		System.out.println(parentID);

		String childID = it.next();

		System.out.println(childID);

		driver.switchTo().window(childID);

		String text = driver.findElement(By.cssSelector(".im-para.red")).getText();

		String[] newText = text.split("at");

		System.out.println(newText[1]);

		String[] newText1 = newText[1].split(" ");

		System.out.println(newText1[1]);

		driver.switchTo().window(parentID);

		driver.findElement(By.id("username")).sendKeys(newText1[1]);

	}
}
