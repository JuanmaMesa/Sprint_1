package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App_lambda {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList("John","mouse","number","paper","Orlando","Sunday"));
		
		List<String> filteredNames = filterStrings(names);
		
		filteredNames.forEach(s -> System.out.println(s));
				
	}

	
	public static List<String> filterStrings(ArrayList<String>strings){
		
		return strings.stream()
				.filter((s) -> s.toLowerCase().contains("o")  && s.length() >= 5)
				.collect(Collectors.toList());
			
					
	}
}
