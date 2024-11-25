import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class GettingWidthandHeight {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		
		String satish = "Reddy";
		
		name.sendKeys(satish);
		
		int height = name.getRect().height;
	
		int width = name.getRect().width;	
		
		System.out.println(height);
		System.out.println(width);
		System.out.println(name.getRect().getHeight());
		System.out.println(name.getRect().getWidth());
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		
		
	}

}
