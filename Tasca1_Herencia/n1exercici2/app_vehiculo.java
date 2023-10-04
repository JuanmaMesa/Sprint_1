package n1exercici2;

public class app_vehiculo {

	public static void main(String[] args) {
		

		
		// invocar el metodo estatico frenar() des de la clase
		System.out.println(Coche.frenar());
		
		
		// creeacion de estancias de coche
		Coche micocheSeat = new Coche(1100);
		Coche micocheSeat1 = new Coche(2000);
		
		// invocación de los metodos frenar y acelerar desde el objeto

		System.out.println("----");
		System.out.println(micocheSeat.acelerar());
		System.out.println(micocheSeat.frenar());
		
		// accedemos a los atributos estaticos y no estaticos
		System.out.println("----");
		System.out.println("Marca: "+micocheSeat.getMarca());
		System.out.println("Modelo: "+micocheSeat.getModelo());
		System.out.println("Potencia. "+micocheSeat.getPotencia());
		
		
		// cambiamos el atributo modelo estatico
		
		System.out.println("----");
		micocheSeat.setModelo("Ibiza FR");
		
		System.out.println(micocheSeat);
		System.out.println(micocheSeat1);// afectado por el cambio de modelo de micocheSeat
		
	
		
		
		
		
		
		
	
	}

}
