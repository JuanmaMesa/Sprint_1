package n1Exercici1;
import java.util.*;

public class App_month {

	public static void main(String[] args) {
		
		// we create Arraylist of month object
		
		ArrayList<Month> monthsList = new ArrayList<Month>();
		
		// add 11 month within August month
		monthsList.add(new Month("January"));
		monthsList.add(new Month("February"));
		monthsList.add(new Month("March"));
		monthsList.add(new Month("April"));
		monthsList.add(new Month("May"));
		monthsList.add(new Month("June"));
		monthsList.add(new Month("July"));
		monthsList.add(new Month("September"));
		monthsList.add(new Month("October"));
		monthsList.add(new Month("November"));
		monthsList.add(new Month("November"));//duplicate
		monthsList.add(new Month("December"));
		
		
		for(Month m: monthsList) {
			
			System.out.println(m.getName());
		}
		
		// we insert the month August in position 8(index 7)
		monthsList.add(7,new Month("August"));
		
		
		// display the Arrayist to demostrate correct order
		System.out.println("-------");
		for(Month m: monthsList) {
			System.out.println(m.getName());
		}
	
	// We convert the arraylist into a Hashset to remove duplicates
		
		Set<Month> monthSet = new HashSet<>(monthsList);
		
		System.out.println("--- display monthSet ---");
		
		
		// Iterate over the HashSet using a for loop
		for(Month m:monthSet) {
			
			System.out.println(m.getName());
		}
		
		// Iterate over the HashSet using the Iterator
		
		System.out.println("__Iterate with Iterator__");
		
		Iterator<Month>my_iterator = monthSet.iterator();
		
		while(my_iterator.hasNext()) {
			Month month = my_iterator.next();
			System.out.println(month.getName());
			
			
			
		}
		
	
	}

}
