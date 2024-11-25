
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class iter {
	
	
	    public static void main(String[] args) {
	        // Create a list of fruits
	        ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        
	        Integer
	        
	        ArrayList<Integer> nums = new ArrayList<>();
	        nums.add(1);
	        nums.add(2);
	        nums.add(3);
	        
	        Collections.sort(fruits);

	        // Use an iterator to go through the list
	        Iterator<String> iterator = fruits.iterator();

	        // Access each fruit one by one
	        while (iterator.hasNext()) {
	            String fruit = iterator.next(); // Get the next fruit
	            System.out.println(fruit); // Print the fruit
	        }
	    }
	}
	

