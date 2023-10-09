package n1exercici2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculoDni {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dime tu digitos del Dni");
		try {
		int numDni = input.nextInt();
		System.out.println("tu letra del DNI es: "+numDni+"-"+calcularLetra(numDni));
		
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException: Error! No has puesto tus digitos.");
		}

	}
	public static char calcularLetra(int num) {
		num = (num %23);
		final String letter = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letterDni = letter.charAt(num);
		return letterDni;
	}


}
