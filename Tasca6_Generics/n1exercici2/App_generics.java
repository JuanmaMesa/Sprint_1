package n1exercici2;

public class App_generics {

	public static void main(String[] args) {
	
		float floatnumber =3.14f;
		
		GenericMethods generics = new GenericMethods();
		
		generics.printGenericArguments(floatnumber,new Persona().getClass(),27 );
		
		System.out.println("---Segunda prueba---");
		
		generics.printGenericArguments(true, new Persona().getClass(),floatnumber);
		
		
		
		
		
	}

}
