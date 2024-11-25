import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusMailissuesdownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver1.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		driver.get("https://jira.corp.entaingroup.com/secure/Dashboard.jspa");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("satishreddy.sheelam@ivycomptech.com");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Sa@satish7777");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		
		
		driver.findElement(By.xpath("//span[text()='Project']")).click();
		
		driver.findElement(By.xpath("//label[@title='Bingo (BIN)']")).click();
		
		driver.findElement(By.className(".aui-icon.aui-icon-small.aui-iconfont-file-xls")).click();
		

		
	}

}
