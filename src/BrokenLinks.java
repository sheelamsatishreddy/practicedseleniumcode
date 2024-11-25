import java.awt.Button;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		ChromeOptions Option = new ChromeOptions();

		Option.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(Option);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		String url = driver.findElement(By.cssSelector("a")).getAttribute("href");

		List<WebElement> anchortags = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		System.out.println(anchortags.size());

		SoftAssert a = new SoftAssert();

		for (int i = 0; i < anchortags.size(); i++) {

			String urlone = anchortags.get(i).getAttribute("href");

			URL link = new URL(urlone);

			HttpURLConnection conn = (HttpURLConnection) link.openConnection();

			conn.setRequestMethod("HEAD");

			conn.connect();

			int respcode = conn.getResponseCode();

			// System.out.println(anchortags.get(i).getText());

			// System.out.print(respcode);

			a.assertTrue(respcode < 400,
					"The link with text " + anchortags.get(i).getText() + " is broken with code" + respcode);

		}

		a.assertAll();

	}

}
