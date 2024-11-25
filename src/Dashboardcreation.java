import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dashboardcreation {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		String epiclink = "BIN-26082";
		
		String EpicLink = "'Epic Link' =";
		
		String dashboardname = "Selenium Dashboard";
		
		String DailyBugcount = "Daily Bug Count";
		
		String TotalBugcount = "Total Bug Count";

		driver.get("https://jira.corp.entaingroup.com/secure/Dashboard.jspa");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("satishreddy.sheelam@ivycomptech.com");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Sa@satish5555");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@id='find_link']")).click();
		
		driver.findElement(By.xpath("//a[@id='issues_new_search_link_lnk']")).click();
		
		//driver.findElement(By.xpath("//a[@data-id='basic']")).click();
		
		driver.findElement(By.xpath("//textarea[@id='advanced-search']")).sendKeys("Project = Bingo AND type = Bug AND "+EpicLink+ epiclink);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Save as']")).click();
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
		
		LocalDateTime now = LocalDateTime.now();  
		
		String filtername = "epiclink"+LocalDateTime.now();
		
		driver.findElement(By.xpath("//input[@id='filterName']")).sendKeys(filtername);
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		driver.findElement(By.xpath("//a[@id='home_link']")).click();
		
		driver.findElement(By.xpath("//a[@id='manage_dash_link_lnk']")).click();
		
		driver.findElement(By.xpath("//a[@id='create_page']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='edit-entity-dashboard-name']")).sendKeys(dashboardname);
		
		WebElement dropdownElementProject = driver.findElement(By.id("share_type_selector_viewers"));

        Select dropdown = new Select(dropdownElementProject);
    
        dropdown.selectByVisibleText("Project");
        
		WebElement dropdownElementTeam = driver.findElement(By.name("projectShare"));

        Select dropdown1 = new Select(dropdownElementTeam);
    
        dropdown1.selectByVisibleText("Bingo");
        
        driver.findElement(By.xpath("//button[@id='share_add_project_viewers']")).click();
        
        driver.findElement(By.xpath("//input[@name='add_submit']")).click();
        
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[normalize-space()='"+ dashboardname +"']")).click();

        driver.findElement(By.xpath("//a[@id='layout-changer']")).click();
        
        driver.findElement(By.xpath("//a[@id='layout-a']")).click();
        
        driver.findElement(By.xpath("//a[@id='add-gadget-0']")).click();
        
        driver.findElement(By.xpath("//a[@id='load-more-directory-items']")).click();
        
        
        
        
        
        driver.findElement(By.xpath("//input[@id='search']")).clear();
        
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Rich Filter Smart Counters");
        	
        driver.findElement(By.xpath("//h4[normalize-space()='Rich Filter Smart Counters']/parent::div/following-sibling::div/button")).click();	
        
        driver.findElement(By.xpath("//input[@id='search']")).clear();
        
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Rich Filter Smart Counters");
        	
        driver.findElement(By.xpath("//h4[normalize-space()='Rich Filter Smart Counters']/parent::div/following-sibling::div/button")).click();	
        
        driver.findElement(By.xpath("//input[@id='search']")).clear();
        
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Rich Filter Results");
        	
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//h4[normalize-space()='Rich Filter Results']/parent::div/following-sibling::div/button")).click();
        
        driver.findElement(By.xpath("//input[@id='search']")).clear();
        
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Rich Filter Controller");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//h4[normalize-space()='Rich Filter Controller']/parent::div/following-sibling::div/button")).click();
        
        driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
        
        Thread.sleep(1000);
        
        String mainWindowHandle = driver.getWindowHandle();
        
        
        driver.findElement(By.xpath("//h2[normalize-space()= 'Configure Rich Filter Controller Gadget']/parent::div/following-sibling::div//a[normalize-space()='Open rich filters list']")).click();
        
        Thread.sleep(1000);
        
        Set<String> windowsHandles = driver.getWindowHandles();
        
        Iterator<String> it = windowsHandles.iterator();
        
        String parentid = it.next();
        
        String childid = it.next();
        
        driver.switchTo().window(childid);
        
        driver.findElement(By.xpath("//button[normalize-space()='Create rich filter']")).click();
        
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(filtername);
        
        driver.findElement(By.xpath("//input[@id='s2id_autogen1']")).click();
        
        driver.findElement(By.xpath("//div[@id='select2-drop-mask']/following-sibling::div/div/input")).sendKeys(filtername);
        
        driver.findElement(By.xpath("//div[@class='select2-result-label']")).click();
        
       // driver.findElement(By.xpath("//div[@id='select2-drop-mask']/following-sibling::div/div/input")).sendKeys(Keys.ENTER);
        
        
        driver.findElement(By.xpath("//button[normalize-space()='Cancel']/preceding-sibling::button")).click();
        
        driver.findElement(By.xpath("//a[normalize-space()='Dynamic Filters']")).click();
        
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//input[@class='select2-focusser']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@class='select2-input']")).sendKeys("Status");
        
        driver.findElement(By.xpath("//div[normalize-space()='Test Automation Status']/parent::li/preceding-sibling::li/div[normalize-space()='Status']")).click();
        
        driver.findElement(By.xpath("//a[@title='Add']")).click();
        
        driver.findElement(By.xpath("//input[@class='select2-input']")).sendKeys("Assignee");
        
        driver.findElement(By.xpath("//div[normalize-space()='Assigned Team']/parent::li/following-sibling::li/div[normalize-space()='Assignee']")).click();
        
        driver.findElement(By.xpath("//a[@title='Add']")).click();
        
        driver.findElement(By.xpath("//li[@data-tab='smart']")).click();
        
        driver.findElement(By.xpath("//a[normalize-space()='Create a new smart filter.']")).click();
        
        driver.findElement(By.xpath("//input[@placeholder='Type smart filter name']")).sendKeys(TotalBugcount);
        
        driver.findElement(By.xpath("//label[@for='pref-labels-47']")).click();
        
        driver.findElement(By.xpath("//button[normalize-space()='Add smart filter']")).click();
        
        
        ArrayList<String> StatesTotal = new ArrayList<String>();
        
        StatesTotal.add("Total"); 
        
        StatesTotal.add("Open");
        
        StatesTotal.add("In Progress");
        
        StatesTotal.add("RFT");
        
        StatesTotal.add("Tested Ok");
        
        StatesTotal.add("Closed");
        
        ArrayList<String> Statesjql = new ArrayList<String>();
        
        Statesjql.add("project = BIN AND issuetype = Bug AND" + "\"Epic Link =\" " + epiclink); 
        
        Statesjql.add("project = BIN AND issuetype = Bug AND status = Open AND" + "\"Epic Link =\" " + epiclink);
        
        Statesjql.add("project = BIN AND issuetype = Bug AND status = \"In Progress\" AND" + "\"Epic Link =\" " + epiclink);
        
        Statesjql.add("project = BIN AND issuetype = Bug AND status = \"Ready for Testing\" AND" + "\"Epic Link =\" " + epiclink);
        
        Statesjql.add("project = BIN AND issuetype = Bug AND status = \"Tested OK\" AND" + "\"Epic Link =\" " + epiclink);
        
        Statesjql.add("project = BIN AND issuetype = Bug AND status = Closed AND" + "\"Epic Link =\" " + epiclink);
        
        

        for(int i=0; i<6; i++) {
        
	        driver.findElement(By.xpath("//input[@placeholder='Type label']")).sendKeys(StatesTotal.get(i));
	        
	        driver.findElement(By.xpath("//textarea[@placeholder='Type JQL']")).sendKeys(Statesjql.get(i));
	        
	        driver.findElement(By.xpath("//a[@title='Add']")).click();
	        
        }
        
        //creating second Smart filter
        
        driver.findElement(By.xpath("//li[@data-tab='smart']")).click();
        
        driver.findElement(By.xpath("//a[normalize-space()='Create a new smart filter.']")).click();
        
        driver.findElement(By.xpath("//input[@placeholder='Type smart filter name']")).sendKeys(DailyBugcount);
        
        driver.findElement(By.xpath("//label[@for='pref-labels-47']")).click();
        
        driver.findElement(By.xpath("//button[normalize-space()='Add smart filter']")).click();
        
        	ArrayList<String> DailyTotal = new ArrayList<String>();
        
			DailyTotal.add("New Bugs");
			        
			DailyTotal.add("Tested OK");
			        
			DailyTotal.add("RFT");
			        
			DailyTotal.add("Reopen");
			        
			DailyTotal.add("Closed");
        
			DailyTotal.add("closed"); 
			
			ArrayList<String> DailyTotaljql = new ArrayList<String>();
	        
			DailyTotaljql.add("project = BIN AND issuetype = Bug AND"+ "\"Epic Link =\" " + epiclink +" AND created >= startOfDay()");
        
			DailyTotaljql.add("project = BIN AND issuetype = Bug AND" + "\"Epic Link =\" " + epiclink +"AND status changed to \"Tested OK\" during (startOfDay(-5h), now())\r\n"
					+ "");
			        
			DailyTotaljql.add("project = BIN AND issuetype = Bug AND" + "\"Epic Link =\" " + epiclink+" AND status changed to \"Ready for Testing\" during (startOfDay(-5h), now())");
			        
			DailyTotaljql.add("project = BIN AND issuetype = Bug AND"+ "\"Epic Link =\" " + epiclink+" AND status changed from \"Ready For Testing\" to Open during (startOfDay(-5h), now())");
			        
			DailyTotaljql.add("project = BIN AND issuetype = Bug AND" + "\"Epic Link =\" " + epiclink+" AND status changed to Closed during (startOfDay(-5h), now())"); 
  
        
			//Swtich back to dashboard page
			
			driver.switchTo().window(mainWindowHandle);
			
			driver.navigate().refresh();
			
			//First Gadget data filling
			
			driver.findElement(By.xpath("//h2[normalize-space()= 'Configure Rich Filter Controller Gadget']/parent::div/following-sibling::div//input[@name='title']")).sendKeys("Filter");
	        
			driver.findElement(By.xpath("//div[@id='gadget-29408']//div[@id='react-select-4-placeholder']")).click();
			
			driver.findElement(By.xpath("//input[@id='react-select-4-input']")).sendKeys(epiclink);
			
			driver.findElement(By.xpath("//div[@id='gadget-29408']//footer//button[@type='submit']")).click();
			
			
			//Second Gadget data filling
			
			driver.findElement(By.xpath("//h2[normalize-space()= 'Configure Rich Filter Results Gadget']/parent::div/following-sibling::div//input[@name='title']")).sendKeys("Results");
	        
			driver.findElement(By.xpath("//div[@id='gadget-29407']//div[@id='react-select-5-placeholder']")).click();
			
			driver.findElement(By.xpath("//input[@id='react-select-5-input']")).sendKeys(epiclink);
			
			driver.findElement(By.xpath("//div[@id='gadget-29407']//footer//button[@type='submit']")).click();
			
			//Third Gadget data filling
			
			driver.findElement(By.xpath("//div[@id='gadget-29406']//div//input[@name='title']")).sendKeys("Total Bugs count");
	        
			driver.findElement(By.xpath("//div[@id='gadget-29406']//div[@id='react-select-9-placeholder']")).click();
			
			driver.findElement(By.xpath("//input[@id='react-select-9-input']")).sendKeys(epiclink);
			
			driver.findElement(By.xpath("//div[@id='gadget-29406']//input[@id='react-select-7-input']")).sendKeys(TotalBugcount);
			
			driver.findElement(By.xpath("//div[@id='gadget-29406']//footer//button[@type='submit']")).click();
			
			
			//Fourth Gadget data filling
			
			driver.findElement(By.xpath("//div[@id='gadget-29405']//div//input[@name='title']")).sendKeys("Daily Bugs count");
	        
			driver.findElement(By.xpath("//div[@id='gadget-29405']//div[@id='react-select-13-placeholder']")).click();
			
			driver.findElement(By.xpath("//input[@id='react-select-13-input']")).sendKeys(epiclink);
			
			driver.findElement(By.xpath("//input[@id='react-select-11-input']")).sendKeys(DailyBugcount);
			
			driver.findElement(By.xpath("//div[@id='gadget-29405']//footer//button[@type='submit']")).click();
			
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      /*  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Rich Filter Controller");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//h4[normalize-space()='Rich Filter Controller']/parent::div/following-sibling::div/button")).click();
        
       
        	
       // driver.findElement(By.xpath("//a[@id='add-gadget']")).click();
        
      //driver.findElement(By.xpath("//a[@id='load-more-directory-items']")).click();
        
        driver.findElement(By.xpath("//input[@id='search']")).clear();
        
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Rich Filter Results");
        	
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//h4[normalize-space()='Rich Filter Results']/parent::div/following-sibling::div/button")).click();	
        
        //driver.findElement(By.xpath("//button[@aria-label='Close']"));
        
       // driver.findElement(By.xpath("//a[@id='add-gadget']")).click();
        
        //driver.findElement(By.xpath("//a[@id='load-more-directory-items']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='search']")).clear();
        
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Rich Filter Smart Counters");
        	
        driver.findElement(By.xpath("//h4[normalize-space()='Rich Filter Smart Counters']/parent::div/following-sibling::div/button")).click();	
        
        driver.findElement(By.xpath("//button[@aria-label='Close']"));
        	
       
		*/
	}

}
