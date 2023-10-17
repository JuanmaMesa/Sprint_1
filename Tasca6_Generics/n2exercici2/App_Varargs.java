package n2exercici2;
import n1exercici2.Persona;
public class App_Varargs {

	public static void main(String[] args) {
		GenericMethods prueba = new GenericMethods();
		
		prueba.printGenericArguments("Marcos",32,"Barcelona");
		
		System.out.println("--- Segunda prueba ---");
		
		prueba.printGenericArguments(new Persona(),true,"Pilar",42,3.5);

	}

}
