package n1exercici1;
import java.util.*;

public class App_month {

	public static void main(String[] args) {
		
		
		ArrayList<Month> monthsList = new ArrayList<Month>();
		
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
		
		// position 8(index 7)
		monthsList.add(7,new Month("August"));
		
	
		System.out.println("-------");
		for(Month m: monthsList) {
			System.out.println(m.getName());
		}
	
	
		
		Set<Month> monthSet = new HashSet<>(monthsList);
		
		System.out.println("--- display monthSet ---");
		
	
		for(Month m:monthSet) {
			
			System.out.println(m.getName());
		}
	
		
		System.out.println("__Iterate with Iterator__");
		
		Iterator<Month>my_iterator = monthSet.iterator();
		
		while(my_iterator.hasNext()) {
			Month month = my_iterator.next();
			System.out.println(month.getName());
			
			
			
		}
		
	
	}

}
