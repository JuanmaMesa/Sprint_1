package n1exercici2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DniValid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numDni = 0;
		do {
			 
			System.out.println("Dime tu digitos del Dni");
			
			try {
				numDni = input.nextInt();
				
				if(isDniTrue(numDni)) {
					System.out.println("tu DNI completo es: "+numDni+"-"+calculateLetter(numDni));
				}else {
					System.out.println("Tienes que poner 8 digitos:");
				}
				
		
			}catch(InputMismatchException e) {
				System.out.println("InputMismatchException: Error! No has puesto digitos.");
				input.next();
			}
			
		}while(!isDniTrue(numDni));
	}
	
	public static char calculateLetter(int num) {
		num = (num %23);
		final String letter = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letterDni = letter.charAt(num);
		return letterDni;
	}

	public static boolean isDniTrue(int num) {
		String dniString = Integer.toString(num);
		return dniString.length()==8;
		
		
			
			
		}
		
	}

