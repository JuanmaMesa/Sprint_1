package n1exercici2;

public class app_vehiculo {

	public static void main(String[] args) {
		
		// metodo statico
		// saldra null el modelo, porque no pertenece a ningun objeto
		System.out.println(Coche.frenar());
		
		// la primera y el último parametro son finals;
		Coche micoche = new Coche("Open", "GP", 1200);
		System.out.println(micoche);
		
		Coche micocheSeat = new Coche("Ibiza");
		System.out.println(micocheSeat);
		
		System.out.println(micocheSeat.acelerar());
		System.out.println(micocheSeat.frenar());
	
	}

}
