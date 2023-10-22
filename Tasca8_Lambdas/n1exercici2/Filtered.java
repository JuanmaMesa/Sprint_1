package n1exercici2;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Filtered {

	public static void main(String[] args) {

		
		
		
		
	}
	
	public static List<String> filteredLetter(ArrayList<String> strings){
		
		return strings.stream()
			.filter(letter  -> letter.contains("o"))
			.collect(Collectors.toList());
			
		
		
		
	}

}
