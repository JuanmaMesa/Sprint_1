package n1exercici1;

public class App_musica {
	

	public static void main(String[] args) {
		
		
		
		// creamos un array y guardamos 6 objetos
		Instrumento listaInstrumentos[] = new Instrumento [6];
		
		listaInstrumentos[0] = new InstrumentoViento("Flauta",150);
		listaInstrumentos[1] = new InstrumentoPercusion("Bateria",850);
		listaInstrumentos[2] = new InstrumentoViento("Tuba",150);
		listaInstrumentos[3] = new InstrumentoPercusion("Pandereta",850);
		listaInstrumentos[4] = new InstrumentoCuerda("Violín",780);
		listaInstrumentos[5] = new InstrumentoCuerda("Guitarra",780);
		
		
		// visualizacion de la lista
		
		for(Instrumento i: listaInstrumentos) {
			
			System.out.println(i.getNombre()+": "+i.tocar());
			
			
			if(i  instanceof InstrumentoCuerda) {
				InstrumentoCuerda cuerda = (InstrumentoCuerda)i;// realizamos un castin para poder acceder
				System.out.println("Número de cuerdas: "+cuerda.getNumeroCuerdas());
			}
			
			System.out.println();
		}
		
		

	}

}
