package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
	
	private static Scanner input = new Scanner(System.in);
	
	public static byte readByte(String message) {
		
		byte result = 0;
		boolean isTrue = false;
		
		do {
			try {
				System.out.println(message + ": ");
				result = input.nextByte();
				System.out.println("byte entered: "+result);
				isTrue = true;
			}catch(InputMismatchException e) {
				System.out.println("InputMismatchException: Enter a correct byte ");
				input.nextLine();// limpieza de buffer
				
			}
		} while(!isTrue);
		
		return result;
		}


	
}
