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

public class QA2Superlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		driver.get("https://qa2.bingo.coral.co.uk/en/bingo/rooms");
		  
		
		LocalTime D = LocalTime.now();
		

		LocalTime CurrentTime = D.withNano(0);
		
		LocalTime End = LocalTime.parse("22:54:00");
		
		
		
		List<WebElement> Superlink = driver.findElements(By.cssSelector(".theme-bingo-superlinks"));

		
		while (CurrentTime != End){		
			
			if(Superlink.size()==3) {
				
				Thread.sleep(60000);
				
				CurrentTime = LocalTime.now();
				
				CurrentTime=CurrentTime.withNano(0);
				
				System.out.println("This is Current time "+ CurrentTime);
				
				//System.out.println("This is End time "+ End);
				
				System.out.println("Portal Changes are applied to 3 rooms");
			}
			else {
				
				System.out.println("This is Current time "+ CurrentTime);
				
				System.out.println("This is End time "+ End);
				System.out.println("Portal Changes are removed");
				Thread.sleep(1000);
			}
		
		}
	}

}
