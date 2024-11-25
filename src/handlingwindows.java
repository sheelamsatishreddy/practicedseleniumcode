import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.Iterator;
import java.util.Set;

public class handlingwindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("https://courses.rahulshettyacademy.com/courses/");

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String Parentid = it.next();
		
		String Childid = it.next();
		
		driver.switchTo().window(Childid);
		
		String Text = driver.findElement(By.cssSelector("div[title='Learn Postman for API Automation Testing with Javascript']")).getText();
		
		driver.switchTo().window(Parentid);
		
		driver.findElement(By.xpath("//label/following-sibling::input[@name='name']")).sendKeys(""+Text+"");
		
		
	}

}
