package n1exercici1;

public class InstrumentoCuerda extends Instrumento{
	
	public InstrumentoCuerda(String nombre, double precio) {
		
		super(nombre,precio);
		
	}
	
	//@Override
	public String tocar() {
		
		return "Esta sonando un instrumento de cuerda.";
	}
	

	
	
	
}
