import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jirascript {

	public static void main(String[] args) throws InterruptedException {
		// Set the path to your ChromeDriver
		// System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");

		WebDriverManager.chromedriver().setup();

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to Jira login page
		driver.get("https://jira.corp.entaingroup.com/issues/?jql=");
		
		// Wait for Jira dashboard to load
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		//driver.findElement(By.linkText("log in")).click();
		
		Thread.sleep(1000);

		// Maximize the window
		driver.manage().window().maximize();

	
		String username = "satishreddy.sheelam@ivycomptech.com";
		
		String password = "Sa@satish4444";
		
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys(password);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		
		// Log in to Jira (replace 'username' and 'password' with your credentials)
		/*WebElement usernameField = driver.findElement(By.id("username"));
	
		
		usernameField.sendKeys(username);
		
		WebElement passwordField = driver.findElement(By.id("password"));
		
		passwordField.sendKeys(password);
		
		WebElement loginButton = driver.findElement(By.id("login"));
		
		loginButton.click();
*/
		

		// Navigate to the Jira search page where you can search for stories
		//driver.get("https://jira.corp.entaingroup.com/secure/Dashboard.jspa");

		// Construct your JQL query to search for stories with a specific label
		String jqlQuery = "project = BIN AND issuetype = Story AND labels = Apr9threleaseQA";

		// Enter the JQL query in the search box and submit
		WebElement searchBox = driver.findElement(By.id("advanced-search"));
		
		searchBox.sendKeys(jqlQuery);
		
		searchBox.sendKeys(Keys.ENTER);

		// Wait for the search results to load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Find all links to stories in the search results
		List<WebElement> storyLinks = driver.findElements(By.xpath("//a[@class='issue-link']"));

		// Loop through each story and extract linked bugs
		for (WebElement storyLink : storyLinks) {
			// Get the URL of the story
			String storyUrl = storyLink.getAttribute("href");

			// Navigate to the story page
			driver.get(storyUrl);

			// Find and print linked bugs
			List<WebElement> linkedBugs = driver.findElements(By.xpath("//div[@class='linked-item-summary']"));
			System.out.println("Bugs linked to story: " + storyLink.getText());
			for (WebElement bug : linkedBugs) {
				System.out.println(bug.getText());
			}
		}

		// Close the browser
		//driver.quit();
	}

}
