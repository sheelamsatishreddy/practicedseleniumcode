import java.awt.Button;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class streamsjava {

	public static void main(String[] args) throws InterruptedException {
		
		streamFilter();
	}
		// TODO Auto-generated method stub
		
		public static void streamFilter() {
			
			ArrayList<String> names = new ArrayList<String>();
			
			names.add("Sam");
			
			names.add("Adam");
			
			names.add("Arun");
			
			names.add("Bob");
			
			names.add("Varun");
			
			Long Count = names.stream().filter(A->A.startsWith("A")).count();
			
			System.out.println(Count);

	}

}
