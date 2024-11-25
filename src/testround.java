import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testround {
	
	@Test
	public static void main() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

	
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	
	
	driver.get("https://login.microsoftonline.com/60c43c0a-64ac-4050-bf3e-31e1cdfffdeb/oauth2/authorize?client_id=ba769c81-77b5-423f-bc1c-5e2b0e6e6758&redirect_uri=https%3A%2F%2Fsitecoreidentityservice.test.env.works%2Fsignin-oidc&response_type=id_token&scope=openid%20profile&response_mode=form_post&nonce=638462955847985993.ZjIzNjUyMGUtNGY4ZS00YmM2LThlMzItYTFhMDc4MWQ4NTVmM2I0M2VjNDQtOTdlMS00YTJmLTkxOWEtZTI2ZDg1Y2ExYzgw&state=CfDJ8B5ZSGem289PkLr2bSYXL1AkOaygjkIGXD5dMQrUGEBL-zPL3cJ6Fr0nthB8gywYSXa-vFAmAMotuDkxkRSSBmBfLnZgbEDI29ziWnSrviNS6R6Rgv7jYAO0fdso8Ss7-T0IWSsIOLWOO9CA4nLgQgxlbjvPMfJQJwKgjX1wWPRq&x-client-SKU=ID_NETSTANDARD2_0&x-client-ver=6.10.0.0&sso_reload=true");
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("satishreddy.sheelam@ivycomptech.com");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Sa@satish5555");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();

	Thread.sleep(45000);
	
	driver.get("https://cms.test.env.works/sitecore/shell/Applications/Content%20Manager/default.aspx?fo=%7B3D7ADD25-2394-43F7-83D9-3F6DA9E499AB%7D");
	
	Set<String> windowIds1 = driver.getWindowHandles();

	Iterator<String> it1 = windowIds1.iterator();
	
	String w1 = it1.next();
	
	String w2 = it1.next();
			
	driver.switchTo().window(w2);
	
	driver.findElement(By.xpath("//a[normalize-space()='Edit HTML']")).click();
	
	driver.switchTo().frame("jqueryModalDialogsFrame");
	
	driver.switchTo().frame(0);
	

	//driver.findElement(By.xpath("//div[@class='scFlexContent']/textarea")).click();

	driver.findElement(By.xpath("//textarea")).sendKeys("123");

	driver.findElement(By.xpath("//button[@id='OK']")).click();

	driver.switchTo().defaultContent();

	Thread.sleep(2000);

	driver.findElement(By.xpath("//span[normalize-space()='Save&Unlock']")).click();

	driver.findElement(By.xpath("//span[normalize-space()='Proposed']")).click();

	driver.findElement(By.xpath("//span[normalize-space()='Final']")).click();

}
}