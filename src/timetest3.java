import java.awt.Button;
import java.io.File;
import java.sql.Timestamp;
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

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;

public class timetest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

int duration = 15;
		
		int eachinstance = 60/15;
		
		Date startdate = new Date();
		
		for(int Timer=0; Timer<20; Timer++) {
			
			startdate =  new Date();
			
			final SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			
			sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));
			
			ArrayList<String>LeaderboardFrequency = new ArrayList<String>();
			
			//String frequency = sdf2.format(startdate);
			
			//String newdate = sdf2.format(startdate);
			
			System.out.println(sdf2.format(startdate));
			
			
			Timestamp ts1 = new Timestamp(startdate.getTime()); 
			
			//System.out.println(sdf2.format(ts1));
			
			//Timestamp ts1 = Timestamp.valueOf(sdf2.format(startdate));
			
			//System.out.println(DateUtils.addMinutes(ts1, duration*Timer));
			
			Date check = DateUtils.addMinutes(ts1, duration*Timer);
		
			System.out.println(check.getHours());
			
			System.out.println(check.getMinutes());
			
		}	
		
		}
		
		
		
	}

