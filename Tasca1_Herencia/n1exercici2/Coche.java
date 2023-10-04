package n1exercici2;

public class Coche {

	
	// atrubutos propios de la clase
	private static final String MARCA = "Seat";// Constante
	private static String modelo; // atributo estatico
	
	
	private final int potencia;

	
	// constructor
	public Coche(int potencia) {
		
		 this.potencia = potencia;
		 modelo = "Ibiza";

	}
	
	// Setters
	
	public void setModelo(String nuevoModelo) {
		
		modelo = nuevoModelo;
	}
	
	// Getters
	
	public static String getMarca() {
		
		return MARCA;
	}
	
	public static String getModelo() {
		
		return modelo;
	}
	
	public int getPotencia() {
		
		return potencia;
	}
	
	
	
	public static String frenar() {
		
		return"El vehiculo esta frenando.";
	}
	
	
	public String acelerar() {
		
		return"El vehiculo esta acelerando.";
	}
	
	//override
	public String toString() {
		
		return "vehiculo-->  "+"Marca: "+MARCA+", Modelo: "+modelo+ ", Potencia: "+potencia+" CC";
		
	}
	
}
