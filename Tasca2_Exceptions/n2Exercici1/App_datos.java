package n2Exercici1;
import java.util.Scanner;

import java.util.Scanner;

public class App_datos {

	public static void main(String[] args) {
		
		
	
		
		
	}

	public static void menuPrincipal() {
		
		int opcion;
		
		do {
		System.out.println("Elige una opción");
		System.out.println("1. Introduce tus datos.\n2. Fin de programa");
		
		opcion = dameNumero("Introduce un numero.");
		
		switch(opcion) {
		
		case 1:
		
		}
		
		}
		while(opcion !=0);
	}
	
	
	//public static introduceDatos() {
		
		
		
	public static int dameNumero(String mensaje) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(mensaje);
		int numero = input.nextInt();
		return numero;
	}
	

}
