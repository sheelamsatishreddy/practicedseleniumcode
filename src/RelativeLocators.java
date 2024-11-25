import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//above
		//below
		//toLeftOf
		//toRightOf
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement Nameinput = driver.findElement(By.xpath("//div[@class='form-group']/input[@name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(Nameinput)).getText());
		
		WebElement Name = driver.findElement(By.xpath("//label[text()='Name']"));
		
		Thread.sleep(1000);
		
		driver.findElement(with(By.tagName("input")).below(Name)).sendKeys("AAA");
		
		WebElement Checkbox1 = driver.findElement(By.id("exampleCheck1"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(Checkbox1)).getText());
		
		WebElement Checkboxtext = driver.findElement(By.cssSelector("label[for=exampleCheck1]"));
		
		driver.findElement(with(By.tagName("input")).toLeftOf(Checkboxtext)).click();
		
		
		
		
		
		
		
	

		
			}

}
