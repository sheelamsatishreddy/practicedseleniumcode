import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practicing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
//		driver.get("https://omayo.blogspot.com/");
		driver.navigate().to("https://omayo.blogspot.com/");
		String siteTitle = driver.getTitle();
		System.out.println("This is the site titile " + siteTitle);
		Assert.assertEquals(siteTitle, driver.getTitle());
		WebElement selectDropdown = driver.findElement(By.id("multiselect1"));
		Select select = new Select(selectDropdown);
//		select.selectByValue("volvox");
//		Thread.sleep(5);
		select.selectByIndex(1);
		WebElement dropdown = driver.findElement(By.id("drop1"));
		Select selectone = new Select(dropdown);
		selectone.selectByVisibleText("doc 1");
		List<WebElement> options = selectone.getOptions();
		for (WebElement option : options)
			System.out.println(option.getText());
		//driver.findElement(By.linkText("Selenium143")).click();
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
//		driver.findElement(By.xpath("(//table//td[3])[1]")).click();
//		Set<String> handles = driver.getWindowHandles();
//		
//		Iterator<String> iterator = handles.iterator();
//		
//		String parent = iterator.next();
//		String child = iterator.next();
//		System.out.println(parent);
//		System.out.println(child);
//		System.out.println(handles.size());
		
		// driver.findElement(By.xpath("//input[@name=\"fname\"]")).getAttribute("value");
		// System.out.println(textboxtext);
//		driver.switchTo().window(handles.iterator().next());
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getTitle());
//		driver.switchTo().window(parent);
//		driver.switchTo().window(child);
//		System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
		//WebElement mainframe = driver.findElement(By.id("navbar-iframe"));
		//driver.switchTo().frame(mainframe);
//		WebElement frame = driver.findElement(By.id("iframe1"));
//		driver.switchTo().frame(frame);
//		driver.findElement(By.xpath("//a[@href='https://t.me/qafoxoriginal']//img")).click();
//		
//		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//		
//		try {
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Facebook']"))).click();
//		}
//		catch(Exception e) {
//			
//			e.printStackTrace();
//		}
		driver.findElement(By.id("alert1")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
	
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("prompt")).click();
		
		Alert alertone = driver.switchTo().alert();
		
		alertone.sendKeys("Satish");
	
//		
//		WebElement upload = driver.findElement(By.id("uploadfile"));
//		
//		upload.sendKeys("C:/Users/satishreddy.sheelam/TruncIC1.sql");
//	
		
		
	}

}
