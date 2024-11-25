import java.awt.Button;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class TournamentsGame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		driver.get("https://test.bingo.galabingo.com/en/bingo/schedule");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[normalize-space()='TOURNAMENTS']")).click();
	

		String RoomName = "Portaltournament";
		
		List<WebElement> getTournaments = driver.findElements(null)
		
		driver.findElement(By.xpath("//div[@class='bingo-tournament-container']//btn[noramalize-space()='OPT IN FREE']")).click();

		driver.findElement(By.id("userId")).sendKeys("Raghavendra0884");

		Thread.sleep(1000);

		driver.findElement(By.name("password")).sendKeys("Ra@123456");

		Thread.sleep(1000);
		
		driver.findElement(By.id("//button[normalize-space()='Play Here']")).click();
		
		
		
}
	
}
