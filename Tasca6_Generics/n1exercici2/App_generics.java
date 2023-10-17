package n1exercici2;

public class App_generics {

	public static void main(String[] args) {
	
		GenericMethods generics = new GenericMethods();
		
		generics.printGenericArguments(new Persona().getClass(),"Marcos",27 );
		
		
		
		
	}

}
