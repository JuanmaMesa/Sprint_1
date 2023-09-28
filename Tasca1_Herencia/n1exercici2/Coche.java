package n1exercici2;

public class Coche {

	private static final String marca = "Seat";
	private static String modelo;
	private final int potencia = 125 ;
	
	
	// constructor
	public Coche( String modelo) {
		
		this.modelo = modelo;
		
	}
	
	public Coche(String marca, String modelo, int potencia) {
		
		this.modelo = modelo;
	}
	
	public static String frenar() {
		
		return"El vehiculo "+modelo +" esta frenano.";
	}
	
	
	public String acelerar() {
		
		return"El vehiculo "+modelo +" esta acelerando.";
	}
	
	//override
	public String toString() {
		
		return "vehiculo--> "+"Marca: "+marca+", Modelo: "+modelo+ ", Potencia: "+potencia+" CC";
		
	}
	
}
