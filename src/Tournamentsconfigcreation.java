import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TimeZone;

import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tournamentsconfigcreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

		// Labels names = Galabingo, Foxybingo, Coral, Ladbrokes;

		String label = "Galabingo";

		//String Roomname = "Jaytournament";
		
		String Roomname = "Bingo Tournaments";
		
		ArrayList<String> PatternOne = new ArrayList<String>();

		PatternOne.add("Any Line");

		PatternOne.add("Any Two Lines");

		PatternOne.add("Full House");

		PatternOne.add("Roll on 1");

		PatternOne.add("Roll on 2");

		PatternOne.add("Roll on 3");

		PatternOne.add("Roll on 4");

		PatternOne.add("Roll on 5");

		ArrayList<String> PatternTwo = new ArrayList<String>();

		PatternTwo.add("First line");

		PatternTwo.add("Second Line");

		PatternTwo.add("Third Line");

		PatternTwo.add("Full House");

		PatternTwo.add("Roll on 1");

		PatternTwo.add("Roll on 2");

		PatternTwo.add("Roll on 3");

		PatternTwo.add("Roll on 4");

		PatternTwo.add("Roll on 5");

		//String FreeBingoTourneyCode = "JAYY";
		
		String FreeBingoTourneyCode = "HUNDREDTICKETS";
		
		
		String FreeBingoTourneyTicketCode = "100";
		
		//QA2
		driver.get("https://S.C.crmdevenduser:W!ndows@234@in1vef1vir240.ivycomptech.co.in:8443/siteminderagent/nocert/1706203002/smgetcred.scc?TYPE=16777217&REALM=-SM-BackOffice2--DEV%20[12%3a16%3a42%3a139642271701248]&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-sl24r0UOWoFhodiYLsiqLk52TkWKC%2f4XLizXbF5UdHjL7cPbFZw2bqBu9GXgizPY&TARGET=-SM-https%3a%2f%2fbackoffice--dev%2eivycomptech%2eco%2ein%2f");

		//E7
		//driver.get("https://S.C.crmdevenduser:W!ndows@234@in1vef1vir240.ivycomptech.co.in:8443/siteminderagent/nocert/1699459000/smgetcred.scc?TYPE=16777217&REALM=-SM-BackOffice2--DEV%20[10%3a56%3a40%3a140011638887359]&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-sl24r0UOWoFhodiYLsiqLk52TkWKC%2f4XLizXbF5UdHjL7cPbFZw2bqBu9GXgizPY&TARGET=-SM-http%3a%2f%2fbackoffice--e7%2eivycomptech%2eco%2ein%2f");
				
		//QA2		
		driver.findElement(By.cssSelector("a[hr927044ef='https://backoffice-dev.ivycomptech.co.in/#/dashboard']")).click();
		
		//driver.findElement(By.cssSelector("a[href='https://backoffice-e7.ivycomptech.co.in/#/dashboard']")).click();

		driver.findElement(By.xpath("//li[normalize-space()='New Campaign']")).click();

		driver.findElement(By.xpath("//p[contains(text(),'Free Bingo Tournament')]")).click();

		driver.findElement(By.id("Campaign Name")).sendKeys("NewCampaign");

		driver.findElement(By.xpath("//div[@id='mat-select-value-5']")).click();

		driver.findElement(By.xpath("//span[@class='mat-option-text']")).click();

		driver.findElement(By.xpath("//div[@id='mat-select-value-7']")).click();

		driver.findElement(By.xpath("//div[@id='Campaign Category-panel']//span[@class='mat-option-text']")).click();

		driver.findElement(By.id("Frontends")).sendKeys(label);

		if (label == "Galabingo") {

			driver.findElement(By.id("mat-option-38")).click();

		} else if (label == "Foxybingo") {

			driver.findElement(By.id("mat-option-37")).click();
		} else if (label == "Coral") {

			driver.findElement(By.id("mat-option-35")).click();

		} else if (label == "Ladbrokes") {

			driver.findElement(By.id("mat-option-40")).click();

		}

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Playerinclusion = driver.findElement(By.xpath("//p[normalize-space()='Player Inclusion']"));

		int x = Playerinclusion.getLocation().getX();

		int y = Playerinclusion.getLocation().getY();

		js.executeScript("arguments[0].scrollIntoView(true);", Playerinclusion);

		driver.findElement(By.xpath("//p[normalize-space()='Player Inclusion']")).click();

		WebElement EligibilityCriteria = driver
				.findElement(By.xpath("//p[normalize-space()='Criteria To Be Included']"));

		js.executeScript("arguments[0].scrollIntoView(true);", EligibilityCriteria);

		EligibilityCriteria.click();

		Thread.sleep(10000);

		driver.findElement(By.xpath("//mat-list[@id='games-list']//span[@class='mat-checkbox-label']")).click();

		WebElement selectroom = driver.findElement(By.xpath("//mat-list[@id='games-list']//span[normalize-space()='"
				+ Roomname + "']/preceding-sibling::mat-checkbox"));

		js.executeScript("arguments[0].scrollIntoView(true);", selectroom);

		Thread.sleep(2000);

		selectroom.click();

		WebElement CampaignTimezone = driver.findElement(By.xpath("//span[normalize-space()='Scheduling']"));

		js.executeScript("arguments[0].scrollIntoView(true);", CampaignTimezone);

		driver.findElement(By.xpath("//div[@id='timeZone']")).click();

		driver.findElement(By.xpath("//span[normalize-space()='GMT (GMT STANDARD TIME)']")).click();

		Date currentTime = new Date();

		final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm a");

		// Give it to me in GMT time.
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date startdate = DateUtils.addMinutes(currentTime, 5);

		// addDays(currentTime, 1);

		driver.findElement(By.xpath("//input[@id='Start Date']")).sendKeys(String.valueOf(sdf.format(startdate)));

		Date enddate = DateUtils.addHours(startdate, 8);

		driver.findElement(By.xpath("//input[@id='End Date']")).sendKeys(String.valueOf(sdf.format(enddate)));

		WebElement SaveandNext = driver.findElement(By.xpath("//button//span[normalize-space()='Save & Next']"));

		js.executeScript("arguments[0].scrollIntoView(true);", SaveandNext);

		SaveandNext.click();

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='USD']")).click();

		driver.findElement(By.xpath("//span[normalize-space()='GBP']")).click();

		WebElement Patterns = driver.findElement(By.xpath("//mat-label[normalize-space()='Select Criteria']"));

		js.executeScript("arguments[0].scrollIntoView(true);", Patterns);

		Thread.sleep(1000);

		for (int Pattern = 0; Pattern < PatternOne.size(); Pattern++) {

			driver.findElement(By.xpath(
					"/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/app-campaign-main-page[1]/div[1]/div[2]/div[2]/app-setup-main[1]/app-leaderboard-setup-page[1]/app-card-section[1]/div[1]/mat-card[1]/mat-card-content[1]/div[1]/div[2]/app-leaderboard-meeting-criteria[1]/div[1]/app-accordian[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/app-bingo-awarding-criteria[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]"))
					.click();

			driver.findElement(By.xpath("//span[normalize-space()='Normal']")).click();

			driver.findElement(By.xpath(
					"/html[1]/body[1]/app-root[1]/app-layout[1]/div[1]/app-campaign-main-page[1]/div[1]/div[2]/div[2]/app-setup-main[1]/app-leaderboard-setup-page[1]/app-card-section[1]/div[1]/mat-card[1]/mat-card-content[1]/div[1]/div[2]/app-leaderboard-meeting-criteria[1]/div[1]/app-accordian[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/app-bingo-awarding-criteria[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]"))
					.click();
			
			WebElement Patternsnames = driver.findElement(By.xpath("//span[normalize-space()='" + PatternOne.get(Pattern) + "']"));
			
			js.executeScript("arguments[0].scrollIntoView(true);", Patternsnames);
			
			driver.findElement(By.xpath("//span[normalize-space()='" + PatternOne.get(Pattern) + "']")).click();

			driver.findElement(By
					.xpath("//mat-label[normalize-space()='* LB Points']/parent::label/parent::span/parent::div/input"))
					.sendKeys("" + Pattern + 1 + "");

			driver.findElement(By.xpath("//span[normalize-space()='Add Points']")).click();

		}

		driver.findElement(By.xpath(
				"//span[@class='required-star ng-star-inserted']/parent::mat-label/parent::label/parent::span/parent::div/input"))
				.sendKeys(FreeBingoTourneyCode);
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='add-btn-row']/following-sibling::div[@class='row']/div[2]//input"))
				.sendKeys(FreeBingoTourneyTicketCode);

		int duration = 15;

		int eachinstance = 60 / 15;

		ArrayList<Integer> Hours = new ArrayList<Integer>();

		ArrayList<Integer> Mins = new ArrayList<Integer>();

		for (int Timer = 0; Timer < 28; Timer++) {

			final SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));

			ArrayList<String> LeaderboardFrequency = new ArrayList<String>();

			Timestamp ts1 = Timestamp.valueOf(sdf2.format(startdate));

			Date Makearray = DateUtils.addMinutes(ts1, duration * Timer);

			Hours.add(Makearray.getHours());

			Mins.add(Makearray.getMinutes());

			driver.findElement(By.cssSelector("svg[class='mat-datepicker-toggle-default-icon ng-star-inserted']"))
					.click();

			driver.findElement(By.xpath("//input[@formcontrolname='hour']")).sendKeys(Keys.BACK_SPACE);

			driver.findElement(By.xpath("//input[@formcontrolname='hour']")).sendKeys(Keys.BACK_SPACE);

			driver.findElement(By.xpath("//input[@formcontrolname='hour']")).sendKeys("" + Hours.get(Timer) + "");

			driver.findElement(By.xpath("//input[@formcontrolname='minute']")).sendKeys(Keys.BACK_SPACE);

			driver.findElement(By.xpath("//input[@formcontrolname='minute']")).sendKeys(Keys.BACK_SPACE);

			driver.findElement(By.xpath("//input[@formcontrolname='minute']")).sendKeys("" + Mins.get(Timer) + "");

			driver.findElement(By.xpath("//span[@class='mat-button-wrapper']/mat-icon[normalize-space()='done']"))
					.click();

			driver.findElement(By.xpath("//button/span[normalize-space()='Add']")).click();

			startdate = new Date();

			startdate = DateUtils.addMinutes(currentTime, 5);

		}

		int durationofeachinstance = duration - 1;

		driver.findElement(By.xpath("//mat-select[@formcontrolname='durationType']")).click();

		driver.findElement(By.xpath("//span[normalize-space()='Minutes']")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='slotDuration']")).sendKeys(""+durationofeachinstance+"");

		driver.findElement(By.xpath("//input[@formcontrolname='optinExpiryTime']")).sendKeys("1");
		
		for(int clear = 0; clear<7; clear++) {
				
			driver.findElement(By.xpath("//input[@formcontrolname='endValue']")).sendKeys(Keys.BACK_SPACE);

		}
		driver.findElement(By.xpath("//input[@formcontrolname='endValue']")).sendKeys("3");

		driver.findElement(By.xpath("//mat-select[@formcontrolname='type']")).click();

		driver.findElement(By.xpath("//span[normalize-space()='Cash']")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='value']")).sendKeys("77");

		WebElement Savepage2 = driver.findElement(By.xpath("//span[normalize-space()='Save & Next']"));

		js.executeScript("arguments[0].scrollIntoView(true);", Savepage2);
		
		Savepage2.click();
		
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//a[@target='_blank']")).click();
		
		Set<String> windowIds = driver.getWindowHandles();

		Iterator<String> it = windowIds.iterator();

		String parentID = it.next();

		//System.out.println(parentID);

		String childID = it.next();
		
		driver.switchTo().window(childID);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("satishreddy.sheelam@ivycomptech.com");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Sa@satish5555");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		Thread.sleep(40000);
		
		//String Sitecore = it.next();

		//System.out.println(childID);
		
		driver.switchTo().window(parentID);
		
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		
		Set<String> windowIds1 = driver.getWindowHandles();

		Iterator<String> it1 = windowIds1.iterator();
		
		String w1 = it1.next();
		
		String w2 = it1.next();
		
		String w3 = it1.next();
				
		driver.switchTo().window(w3);
		
		WebElement promotitle = driver.findElement(By.xpath("//div[normalize-space()='Promotion Title:']/parent::td//div[@class='scContentButtons']/following-sibling::div/input"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", promotitle);
		
		Thread.sleep(1000);
		
		promotitle.click();
		
		promotitle.sendKeys("123");
		
		WebElement transactionhistory = driver.findElement(By.xpath("//div[normalize-space()='Transaction Description (this is what the player will see in their account history):']/parent::td//div[@class='scContentButtons']/following-sibling::div/input"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", transactionhistory);
		
		Thread.sleep(1000);
		
		transactionhistory.click();
		
		transactionhistory.sendKeys("123");
		
		WebElement TermsandConditions = driver.findElement(By.xpath("//div[normalize-space()='TermsAndConditionsText:']/parent::td"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", TermsandConditions);
		
		driver.findElement(By.xpath("//a[normalize-space()='Edit HTML']")).click();
		
		Thread.sleep(2000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe"));		
		
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//div[@class='scFlexContent']/textarea")).click();
		
		
		
		driver.findElement(By.xpath("//div[@class='scFlexContent']/textarea")).sendKeys("123");
		
		driver.findElement(By.xpath("//button[@id='OK']")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Save&Unlock']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Proposed']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Final']")).click();
		
		driver.switchTo().window(parentID);
		
		driver.findElement(By.xpath("//span[normalize-space()='Submit for Approval']/parent::span/span")).click();
	
	}
}
