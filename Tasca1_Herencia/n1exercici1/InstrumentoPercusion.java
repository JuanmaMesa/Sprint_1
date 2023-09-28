package n1exercici1;

public class InstrumentoPercusion extends Instrumento {
	
	public InstrumentoPercusion(String nombre, double precio) {
		
		super(nombre,precio);
		
	}
	
	//@Override
	public String tocar() {
		
		return "Esta sonando un instrumento de Percusión.";
	}
	
	
	

}
