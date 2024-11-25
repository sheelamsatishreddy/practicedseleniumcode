import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tournamentsroomlaunch {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		
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
		
		//driver.findElement(By.xpath(null))

		
	}

}
