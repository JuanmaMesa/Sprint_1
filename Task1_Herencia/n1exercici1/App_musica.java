package n1exercici1;

public class App_musica {

	public static void main(String[] args) {
		
		// instanciamos 3 objetos instrumento
		InstrumentoViento viento = new InstrumentoViento("Flauta",150);
		InstrumentoCuerda cuerda = new InstrumentoCuerda("Guitarra",780);
		InstrumentoPercusion percusion = new InstrumentoPercusion("Bateria",850);
		
		
		// visualizacion 
		
		System.out.println(+viento.getId()+" Instrumento "+viento.getNombre()+": "+viento.tocar());
		System.out.println(+cuerda.getId()+" Instrumento "+cuerda.getNombre()+": "+cuerda.tocar());
		System.out.println(+percusion.getId()+" Instrumento "+percusion.getNombre()+": "+percusion.tocar());
		
		
	

	}

}
