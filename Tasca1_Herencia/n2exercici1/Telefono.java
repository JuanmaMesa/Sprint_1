package n2exercici1;

public class Telefono {
	
	private static final String marca = "Xiami";
	private String modelo;
	
	
	public Telefono(String modelo) {
		
		this.modelo = modelo;
		
	}
	
	
	
	public String llamar(String numeroTelefono) {
		
		return " Esta llamando al numero de telefono "+numeroTelefono;
		
	}
	
	public String toString() {
		
		return "El telefono es de la marca "+marca+" y modelo "+modelo;
		
	}
	
	
	

}
