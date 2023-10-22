package n1exercici7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class App_Reverse {

	public static void main(String[] args) {

		ArrayList<String> stringsArray = new ArrayList<>(Arrays.asList("Joana", "Mark", "Cascos", "Juan Manuel","Piruletas", "Luna"));
	
		Collections.sort(stringsArray, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
		 
		 stringsArray.forEach(s -> System.out.println(s));
		
		
			
		}
		
	
	
}
