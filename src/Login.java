import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty(“webdriver.chrome.driver”, );
		
		//System.setProperty("webdriver.chrome.driver", "C:/Satish/Drivers/chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
		
		//driver.get("https://test.bingo.galabingo.com/en/bingo/schedule");
		
		int[] arr = new int[4];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		
		
		
		//System.out.println(a[0]);
		
		
		for (int i = 0; i<arr.length; i++)
		{
			
			if(arr[i]%2 == 0) {
			System.out.println(arr[i] + "is a multiple of two");
			}
			else {
				System.out.println(arr[i] + "is not a multiple of two");
			}
		}
	
		ArrayList<String> arr1 = new ArrayList<String>();
		
		arr1.add("Selenium");
		arr1.add("ABC");
		arr1.add("CAB");
		arr1.add("LAB");
		arr1.add("MAC");
		
		
		for (int i = 0; i<arr1.size(); i++) {
		
			System.out.println(arr1.get(i));
		
		}
		
		List<String> arr2 = new ArrayList<String>();
		
		arr2.add("Jar");
		arr2.add("Mug");
		arr2.add("Car");
		
		arr2.remove(1);
		
		for (int i = 0; i<arr2.size(); i++) {
			
			System.out.println(arr2.get(i));
		
		}

		
		String[] arr5 = new String[4];
		
		arr5[0] = "CarJaguar";
		
		System.out.println(arr5[0]);
	
		ArrayList<String> arr7 = new ArrayList<String>();
		
		arr7.add("Carambassdor");
		
		System.out.println(arr7.get(0));
		
		
	}
}

		

