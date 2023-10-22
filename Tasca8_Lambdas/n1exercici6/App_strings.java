package n1exercici6;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;

public class App_strings {

	public static void main(String[] args) {

		ArrayList<String> stringsArray = new ArrayList<>(Arrays.asList("Joana", "Mark", "Cascos", "Juan Manuel","Piruletas", "Luna"));
		
		 Comparator <String> lengthString = (s1, s2) -> Integer.compare(s1.length(), s2.length());
		 
		 Collections.sort(stringsArray,lengthString);
		 
		 stringsArray.forEach(s -> System.out.println(s));
		
		
			
		}
		
	

}
