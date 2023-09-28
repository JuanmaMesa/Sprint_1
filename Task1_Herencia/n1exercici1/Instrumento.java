package n1exercici1;

public abstract class Instrumento {

	private String nombre;
	private double precio;
	private int id;
	private static int instrumento = 1;
	

	public Instrumento(String nombre, double  precio) {
		
		this.nombre = nombre;
		this.precio = precio;
		id = instrumento;
		instrumento++;
		
	}
	
	// Getters
	
	public String getNombre() {
		
		return nombre;
	}
	
	public double getPrecio() {
		
		return precio;
		
	}
	
	public abstract String tocar();
	
	
}
