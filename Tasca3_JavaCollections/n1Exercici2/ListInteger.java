package n1Exercici2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInteger {

	public static void main(String[] args) {
		// Create 2 list of Integer
		List<Integer> myList = new ArrayList<>();
		List<Integer>MyListInverse = new ArrayList<>();
		
		// adding in myList 5 numbers
		for(int indice =1; indice<6; indice++) {
			myList.add(indice);
			
		}
		
		// using Iterator to read 
		
		System.out.println("--- using Iterator ---");
		
		Iterator<Integer> myIterator = myList.iterator();
		
		while(myIterator.hasNext()) {
			
			Integer num = myIterator.next();
			System.out.println(num);
		}
		// adding inverse elements
		System.out.println(".....");
		ListIterator<Integer> myIterator1 = myList.listIterator(myList.size());// now iterator is at the end
		
		while(myIterator1.hasPrevious()) {
			
			Integer num = myIterator1.previous();
			MyListInverse.add(num);
			
		}
		
		// display the elements of the myListinverse
		for(Integer num : MyListInverse) {
			System.out.println(num);
			
		}
		
		
	}

}
