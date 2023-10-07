package n1exercici2;

public class app_vehiculo {

	public static void main(String[] args) {
		
		System.out.println(Coche.frenar());
		
		
		Coche micocheSeat = new Coche(1100);
		Coche micocheSeat1 = new Coche(2000);
		
		

		System.out.println("----");
		System.out.println(micocheSeat.acelerar());
		System.out.println(micocheSeat.frenar());
		
		System.out.println("----");
		System.out.println("Marca: "+micocheSeat.getMarca());
		System.out.println("Modelo: "+micocheSeat.getModelo());
		System.out.println("Potencia. "+micocheSeat.getPotencia());
		
		
	
		
		System.out.println("----");
		micocheSeat.setModelo("Ibiza FR");
		
		System.out.println(micocheSeat);
		System.out.println(micocheSeat1);// afectado por el cambio de modelo de micocheSeat
		
	
		
		
		
		
		
		
	
	}

}
