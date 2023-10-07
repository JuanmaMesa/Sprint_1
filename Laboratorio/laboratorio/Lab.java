package laboratorio;

public class Lab {
	

		public static void main(String[] args) {
			
			HashMap <String,String> Countries = new HashMap<>();
			
			Countries.put("Andorra", "Andorra_la_Vella");
			Countries.put("Albania", "Tirana");
			Countries.put("Armenia", "Erevan");
			Countries.put("Austria", "Vienna");
			
			
			//String direccionLectura = "src\\main\\java\\T3\\n1ex3\\countries.txt";
	        //String direccionEscritura = "src\\main\\java\\T3\\n1ex3\\clasificacion.txt";
			
			
			System.out.println(Countries);
			
			
			int correct = 0;
			for(Map.Entry<String, String> entrada:Countries.entrySet()) {
				
				String city = entrada.getKey();
				String capital = entrada.getValue();
				

				System.out.println("City: "+city+"\n what is the captital?");
				String userRespost = getname("");
				
				if(userRespost.equalsIgnoreCase(capital)) {
					System.out.println("Correct");
					correct++;
				}else {
					System.out.println("Oops, you are wront");
				}
				System.out.println("Your score is...."+correct+"points");
			}
			
			
				
				
			}
			
			
				
			public static void menuPrincipal() {
				
				boolean isfinish = true;
				
				System.out.println("=== Welcome to Principal Menu ===");
				
				while(isfinish) {
					
					System.out.println("1. play "+
										"\n2. Exit");
					
					
					int election = getnumber("Chose a number.");
					
					switch(election) {
					
					case 1:
						System.out.println();
						break;
					
					case 2:
						System.out.println("The program is been closing");
						isfinish = false;
						break;
					default:
						System.out.println("Error, choose anothe numbrer.");
					
					}
					
				}
				
			}
			
			public static void play() {
				
				String name = getname("name?");
					
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
