package n2exercici1;

public class Smartphone extends Telefono implements Reloj,Camara {
	
	public Smartphone(String modelo) {
		
		super(modelo);
		
	}
	
	
	public String fotografiar() {
		
		return "Se esta haciendo una foto.";
	}
	
	public String alarma() {
		
		return "La alarma esta sonando.";
	}
	
	

}
