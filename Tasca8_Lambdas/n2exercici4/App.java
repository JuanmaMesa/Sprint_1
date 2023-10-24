package n2exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;



public class App {

	public static void main(String[] args) {
		ArrayList<Object> objectsArray = new ArrayList<Object>(Arrays.asList(1,"Marta","Numero", 22,"Oscar", "Alma", "Berto"));
		ArrayList<String> stringsList = new ArrayList<String>();
		
		for(Object obj: objectsArray) {
			
			if(obj instanceof String) {
				
				stringsList.add((String)obj);
			}
		}
		
		List<String> orderAlphabetic = stringsList.stream()
				.sorted((s1, s2) -> Integer.compare(s1.charAt(0), s2.charAt(0)))
				.collect(Collectors.toList());
		
		System.out.println(orderAlphabetic);
		
		
		
		
		List<String> letterE = stringsList.stream()
				.sorted((s1, s2) ->{
					boolean e1 = s1.contains("e");
					boolean e2 = s2.contains("e");
					return Boolean.compare(e2,e1);
					})
				.collect(Collectors.toList());
		
		System.out.println(letterE);
		
		
		List<String> changeLetterA = stringsList.stream()
				.map( s -> s.replaceAll("a", "4"))
				.collect(Collectors.toList());
		
		System.out.println(changeLetterA);
		
		List<Object> onlyNumbers = objectsArray.stream()
				.filter( n  -> String.valueOf(n).matches("-?\\d+(\\.\\d+)?"))
				.collect(Collectors.toList());
		
		System.out.println(onlyNumbers);
		
		
		
	}

	
	
	
	

}
