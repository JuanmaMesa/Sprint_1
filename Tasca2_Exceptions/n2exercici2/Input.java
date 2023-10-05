package n2exercici2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

	private static Scanner input = new Scanner (System.in);
	
	public static byte readByte(String message) {
		boolean validata = false;
		byte result = 0;
		
		do {
			try {
				System.out.println(message+": ");
				result = input.nextByte();
				validata = true;
			}catch(InputMismatchException e) {
				
				System.out.println("Format error.");
				input.nextLine();// clean the buffer
			}
			
		}while(validata ==false);
		return result;
		
		
	}
	
	
	
}
