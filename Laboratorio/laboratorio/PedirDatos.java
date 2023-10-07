package laboratorio;
import java.util.*;
public class PedirDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String>countries = new HashMap();
		
		
		
		menu();
		
			
			
			
			
		}
		
	 public static void menu() {
	
		 boolean isfinish = true;
		 System.out.println("=== Welcome ===");
		 
		 while(isfinish) {
			 
			int option = getnumber("Chose a number:");
			
			switch(option) {
			
			case 1:
				break;
			case 2:
				System.out.println("bye");
				break;
			default:
				System.out.println("Error, choose another number: 1-2");
				
			}
			 
		 }
		
	}
	 
	 public static void game() {
		countries.put("Albania", "A");
		countries.put("Belgrado","b");
		int point = 0;
		
		for(Map.Entry<String, String> entry : countries.entrySet()) {
			String country = entry.getKey();
			String capital = entry.getValue();
			
			System.out.println(country);
			String city = getname("What is the capital");
			if(capital.equalsIgnoreCase(city) ) {
				System.out.println("Correct");
				point++;
			}else {
				System.out.println("upps, you are wront!");
			}
			System.out.println("total points: "+point);
			
		}
	 }
	
	public static String getname(String message) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		String name = input.nextLine();
		return name;	
	}

	public static int getnumber(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		int number = input.nextInt();
		return number;
	}
}
