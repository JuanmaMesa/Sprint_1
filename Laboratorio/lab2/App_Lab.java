package lab2;

public class App_Lab {

	public static void main(String[] args) {

		Lab pruebaSonido = new Lab();
		
		//printhing(() -> System.out.print("Meown"));

		Funcion printable = (s) -> System.out.print("Yes "+s);
		printhing(printable);
			
		
		
		
		//printhing(pruebaSonido);
		//pruebaSonido.print();
	}
	
	static void printhing(Funcion thing) {
		thing.print("!");
		
	}

}
