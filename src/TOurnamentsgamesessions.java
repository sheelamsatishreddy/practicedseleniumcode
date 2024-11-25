import java.awt.Button;
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

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;

public class TOurnamentsgamesessions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		List<Integer> Hours = new ArrayList<Integer>();

		for (int i = 0; i <= 23; i++) {

			Hours.add(i);

		}

		System.out.println(Hours);

		List<Integer> minutes = new ArrayList<Integer>();

		for (int i = 0; i <= 55; i = i + 5) {

			
				minutes.add(i);

			
		}

		System.out.println(minutes);

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver22.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("http://angular-prod-gms.ivycomptech.co.in/login");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Satish_E7");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");

		driver.findElement(By.cssSelector(".btn-block")).click();

		driver.findElement(By.xpath("//p[normalize-space()='Game Management']/preceding-sibling::Div")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Game schedule')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Manage Sessions')]")).click();

		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/div[1]/app-gms-nav-menu[1]/app-games-management-menu-nav[1]/div[1]/div[1]/app-game-schedule-container[1]/div[1]/app-create-manage-sessions[1]/div[2]/app-search-content[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"))
				.sendKeys("tour");

		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Tournamentauto']")).click();

		ZonedDateTime currentDate = ZonedDateTime.now(ZoneOffset.UTC);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
		
		String formattedString = currentDate.format(formatter);

		System.out.println(formattedString);

		
		int session = 2;

		int EndTimeHours = 0;
		int EndTimeMin = 0;
		
		for (int Hour = 0; Hour < 23; Hour++) {

			
			
			
			
			for (int min = 0; min < 6; min++) {
				
				if(min==0) {
					
					WebElement selectdropdown = driver.findElement(By.xpath("//select[@class='form-control']"));

					Select dropdown = new Select(selectdropdown);

					Thread.sleep(3000);

					dropdown.selectByVisibleText("Tournaments");

					driver.findElement(By.xpath("//input[@name='create']")).click();

					driver.findElement(By.xpath("//tbody/tr['"+session+"']/td[5]/span[1]")).click();
			
					driver.findElement(By.xpath("//div[@id='start_time_div']//button[@type='button']")).click();
					
					//driver.findElement(By.xpath("//div[@class='btn-light ng-star-inserted'][normalize-space()='+formattedString+']")).click();
					//.sendKeys(formattedString);
					
					driver.findElement(By.xpath( "//div[@class='btn-light ng-star-inserted active']")).click();
					
					//Thread.sleep(1000);
					
					driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-gms-nav-menu[1]/app-games-management-menu-nav[1]/div[1]/div[1]/app-game-schedule-container[1]/div[1]/app-session-details[1]/app-session-details-edit[1]/div[2]/div[1]/div[1]/form[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/input[1]"))
					.sendKeys(""+EndTimeHours+"");
					
					//Thread.sleep(1000);
					
					driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-gms-nav-menu[1]/app-games-management-menu-nav[1]/div[1]/div[1]/app-game-schedule-container[1]/div[1]/app-session-details[1]/app-session-details-edit[1]/div[2]/div[1]/div[1]/form[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/input[2]"))
					.sendKeys(""+EndTimeMin+"");
					
					//Thread.sleep(1000);
					
					driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-gms-nav-menu[1]/app-games-management-menu-nav[1]/div[1]/div[1]/app-game-schedule-container[1]/div[1]/app-session-details[1]/app-session-details-edit[1]/div[2]/div[1]/div[1]/form[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/input[3]"))
					.sendKeys("0");
					
				}
				
				driver.findElement(
						By.xpath("//div[@class='input-group date-input date-time']//input[@placeholder='HH']")).sendKeys("" + Hours.get(Hour) + "");

				driver.findElement(
						By.xpath("//div[@class='input-group date-input date-time']//input[@placeholder='MM']"))
						.sendKeys(" "+ minutes.get(min) + "");

				driver.findElement(By.xpath(
						"/html[1]/body[1]/app-root[1]/div[1]/app-gms-nav-menu[1]/app-games-management-menu-nav[1]/div[1]/div[1]/app-game-schedule-container[1]/div[1]/app-session-details[1]/app-session-details-edit[1]/div[2]/div[1]/div[1]/form[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[1]/input[3]"))
						.sendKeys("00");

				driver.findElement(
						By.xpath("//div[@id='time_of_day']//button[@type='button'][normalize-space()='Add']")).click();
				
				
				
				 EndTimeHours = Hours.get(Hour);	
				 
				 EndTimeMin = minutes.get(min)+4;
				
				 

			}
			
			
			session = session + 1;
			
			System.out.println(EndTimeHours);
			
			
			//End date and time
			
			driver.findElement(By.xpath("//div[@id='end_time_div']//button[@type='button']")).click();
			
			driver.findElement(By.xpath("//div[@class='btn-light ng-star-inserted active']")).click();
			
			driver.findElement(By.xpath("//div[@id='end_time_div']//input[@placeholder='HH']")).sendKeys(""+EndTimeHours+"");
			
			driver.findElement(By.xpath("//div[@id='end_time_div']//input[@placeholder='MM']")).sendKeys(""+EndTimeMin+"");
			
			driver.findElement(By.xpath("//div[@id='end_time_div']//input[@placeholder='SS']")).sendKeys("0");
			
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.findElement(By.xpath("//input[@name='update']")).click();
			
			driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
			
			//30 to 60 mins code

			for (int secmin = 6; secmin < 11; secmin++) {
				
				if(secmin==6) {
					
					
					WebElement selectdropdown = driver.findElement(By.xpath("//select[@class='form-control']"));

					Select dropdown = new Select(selectdropdown);

					Thread.sleep(3000);

					dropdown.selectByVisibleText("Tournaments");

					driver.findElement(By.xpath("//input[@name='create']")).click();

					Thread.sleep(2000);
							
					//driver.findElement(By.xpath("//tbody/tr[3]/td[5]/span[1]")).click();
					
					
					driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-gms-nav-menu[1]/app-games-management-menu-nav[1]/div[1]/div[1]/app-game-schedule-container[1]/div[1]/app-session-details[1]/form[1]/table[1]/tbody[1]/tr[3]/td[5]/span[1]")).click();
					
					System.out.println(session);
					
					driver.findElement(By.xpath("//div[@id='start_time_div']//button[@type='button']")).click();
					
					
					driver.findElement(By.xpath( "//div[@class='btn-light ng-star-inserted active']")).click();
					
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-gms-nav-menu[1]/app-games-management-menu-nav[1]/div[1]/div[1]/app-game-schedule-container[1]/div[1]/app-session-details[1]/app-session-details-edit[1]/div[2]/div[1]/div[1]/form[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/input[1]"))
					.sendKeys(""+EndTimeHours+"");
					
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-gms-nav-menu[1]/app-games-management-menu-nav[1]/div[1]/div[1]/app-game-schedule-container[1]/div[1]/app-session-details[1]/app-session-details-edit[1]/div[2]/div[1]/div[1]/form[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/input[2]"))
					.sendKeys(""+EndTimeMin+"");
					
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-gms-nav-menu[1]/app-games-management-menu-nav[1]/div[1]/div[1]/app-game-schedule-container[1]/div[1]/app-session-details[1]/app-session-details-edit[1]/div[2]/div[1]/div[1]/form[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/input[3]"))
					.sendKeys("0");
					
				}
				
				driver.findElement(
						By.xpath("//div[@class='input-group date-input date-time']//input[@placeholder='HH']")).sendKeys("" + Hours.get(Hour) + "");

				driver.findElement(
						By.xpath("//div[@class='input-group date-input date-time']//input[@placeholder='MM']"))
						.sendKeys(" "+ minutes.get(secmin) + "");

				driver.findElement(By.xpath(
						"/html[1]/body[1]/app-root[1]/div[1]/app-gms-nav-menu[1]/app-games-management-menu-nav[1]/div[1]/div[1]/app-game-schedule-container[1]/div[1]/app-session-details[1]/app-session-details-edit[1]/div[2]/div[1]/div[1]/form[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[1]/input[3]"))
						.sendKeys("00");

				driver.findElement(
						By.xpath("//div[@id='time_of_day']//button[@type='button'][normalize-space()='Add']")).click();
				
				
				
				 EndTimeHours = Hours.get(Hour);	
				 
				 EndTimeMin = minutes.get(secmin)+4;
				
				 

			}
			
			
			
			session = session + 1;
			
			System.out.println(EndTimeHours);
			
			
			//End date and time
			
			driver.findElement(By.xpath("//div[@id='end_time_div']//button[@type='button']")).click();
			
			driver.findElement(By.xpath("//div[@class='btn-light ng-star-inserted active']")).click();
			
			driver.findElement(By.xpath("//div[@id='end_time_div']//input[@placeholder='HH']")).sendKeys(""+EndTimeHours+"");
			
			driver.findElement(By.xpath("//div[@id='end_time_div']//input[@placeholder='MM']")).sendKeys(""+EndTimeMin+"");
			
			driver.findElement(By.xpath("//div[@id='end_time_div']//input[@placeholder='SS']")).sendKeys("0");
			
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-gms-nav-menu[1]/app-games-management-menu-nav[1]/div[1]/div[1]/app-game-schedule-container[1]/div[1]/app-session-details[1]/app-session-details-edit[1]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")).click();
			
			driver.findElement(By.xpath("//input[@name='update']")).click();
			
			driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
			
			Hour=Hour+1;
			
			session = session+1;
		}
		
	

		
	}
}
