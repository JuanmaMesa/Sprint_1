package n1exercici1;

public class InstrumentoCuerda extends Instrumento{
	
	private int numeroCuerdas;
	
	static {
		System.out.println("La clase InstrumentoCuerdo se ha cargado.");
		
	}
	
	
	// Bloque de inicialización de instancia
	{
	// inicializamos el número de cuerdas segun el tipo de instrumento
		
		if(super.getNombre().equalsIgnoreCase("Guitarra")){
			
			numeroCuerdas = 4;
		}
		else if(super.getNombre().equalsIgnoreCase("violín")) {
			
			numeroCuerdas = 6;
		}
		else {
			numeroCuerdas = 0;
		}
	}
	
	public InstrumentoCuerda(String nombre, double precio) {
		
		super(nombre,precio);
		
	}
	
	
	public int getNumeroCuerdas() {
		
		return numeroCuerdas;
	}
	
	//@Override
	public String tocar() {
		
		return " Esta sonando un instrumento de cuerda.";
	}
	

	
	
	
}
