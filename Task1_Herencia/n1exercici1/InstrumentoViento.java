package n1exercici1;

public class InstrumentoViento extends Instrumento {
	
	InstrumentoViento(String nombre, double precio){
		
		super(nombre,precio);
		
	}
	
	public String tocar() {
		
		return " Esta sonando un instrumento de viento.";
	}
	

	
	
	
	
}
