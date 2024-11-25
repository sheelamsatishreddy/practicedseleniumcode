import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

enum Status{
	
	Pending, In_Delivery, Delivered
	
}


public class enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s);
		
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(s)))
		
	}

}
