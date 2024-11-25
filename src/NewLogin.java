import java.awt.Button;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class NewLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		driver.get("https://test.bingo.galabingo.com/en/bingo/schedule");

		Thread.sleep(1000);

		driver.findElement(By.linkText("LOG IN")).click();

		driver.findElement(By.id("userId")).sendKeys("galaroyal3");

		Thread.sleep(1000);

		driver.findElement(By.name("password")).sendKeys("123123");

		driver.findElement(By.xpath("//button[@class='login w-100 btn btn-primary']")).click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

		/*
		 * // Javascript executor
		 * ((JavascriptExecutor)driver).executeScript("window.scrollBy(600,900)");
		 * 
		 * WebElement element = driver.findElement(By.
		 * xpath("//div[@class='bingo-rooms']/descendant::div[normalize-space()='Superlink 90']/ancestor::div[contains(@class,'schedule-item__main')]/descendant::button[contains(@class,'play-btn')]"
		 * ));
		 * 
		 * System.out.println(element.getLocation());
		 * 
		 * 
		 * //driver.findElement(By.
		 * xpath("//div[@class='bingo-rooms']/descendant::div[normalize-space()='Superlink 90']/ancestor::div[contains(@class,'schedule-item__main')]/descendant::button[contains(@class,'play-btn')]"
		 * )).click();
		 * 
		 * 
		 */

	}

}
