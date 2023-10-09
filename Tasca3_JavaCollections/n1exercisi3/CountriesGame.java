package n1exercisi3;

import java.util.Map;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class CountriesGame {

	public static void main(String[] args) {
		

		String CountriesFile = "/home/juanma/eclipse-workspace/Sprint1/Tasca3_JavaCollections/n1exercisi3/countries.txt";
		
		menu(loadCountries(CountriesFile));
		
				
		}

	
	
	
	
	
		
	 public static void menu(HashMap<String, String> countries) {
	
		 boolean isfinish = false;
		
		 if(countries.isEmpty()) {
			 System.out.println("loading.... ups!!! an error has been detected!! Please try again later." );
		
		 }else {
		 while(!isfinish) {
			 System.out.println("=== Welcome to Countries Game ===");
			 System.out.println("---- Menu ----");
			int option = getnumber("Chose a number:\n1: Start Game\n2. Exit");
			
			switch(option) {
			
			case 1:
				game(countries);
				break;
			case 2:
				System.out.println("Goodbye, I hope see you soon!!");
				isfinish = true;
				break;
			default:
				System.out.println("Error, choose another number: 1-2");
				
			}
		 }
		}
	 }
	 
	 public static void game(HashMap<String, String> countries) {
		ArrayList<Map.Entry<String, String>>entryList = new ArrayList<>(countries.entrySet());
		 
		
		int indice = 0;
		int point = 0;
		
		String name = getname("What's your name.");
		
		while(indice < 10) {
			Collections.shuffle(entryList);
			
			for(Map.Entry<String, String> entry : entryList) {
				
				if(indice <= 10) {
					String country = entry.getKey();
					String capital = entry.getValue();
			
				
		
					System.out.println(country);
					String city = getname("What is the capital");
			
					if(capital.equalsIgnoreCase(city) ) {
						System.out.println("Correct!");
						point++;
					}else {
					System.out.println("upps, you are wrong!");
					}
					System.out.println("total points: "+point);
					indice++;
					}
				
			System.out.println("Finish!! well done\n"+"user:"+name+" Total points: "+point);
				}
	 		}
		}
	 
	 
	 

	 public static HashMap<String, String> loadCountries(String filename){
		 
		 System.out.println("EStoy en loadCountries");
		 HashMap<String,String>countries = new HashMap<>();
		 
		 try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line;
			
			while((line = br.readLine()) != null  ) {
				
				String[] parts = line.trim().split(" ");
				if(parts.length == 2) {
					String country = parts[0];
					String capital = parts[1];
					
					countries.put(country, capital);
					
				}
			}
			
			br.close();
		}catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException: File not found");
			
		}
		 catch (IOException e) {
			System.out.println("IOException: "+e.getMessage());
		}
		 return countries;
		 
	 }
		 

	
	public static String getname(String message) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		String name = input.nextLine();
		input.close();
		return name;	
	}

	public static int getnumber(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		int number = input.nextInt();
		input.close();
		return number;
	}
}
