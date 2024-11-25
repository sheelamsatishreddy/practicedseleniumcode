import org.openqa.selenium.*;
import java.io.*;
import java.time.Duration;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PetWiki {
    public static String getLoadedData() {
    	
    	System.setProperty("webdriver.chrome.driver","")
    	
    	WebDriverManager.chromedriver().setup();
    	
    	WebDriver driver = new ChromeDriver();

        driver.findElement(By.id("load-button")).click();
        
        

        try{

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

            wait.until(ExpectedConditions.elementToBeClickable(By.id("load-button")));
            
            String content = driver.findElement(By.id("load-button")).getText();
            
            
            return content;
        }
        catch(Exception e){

             return null;
            
            
        }
        
        
       
    }
}