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
	
	public static Integer readint(String message) {
		
		int result = 0 ;
		boolean isTrue = false;
		
		do {
			try {
				System.out.println(message + ": ");
				result = input.nextInt();
				System.out.println("Int entered: "+result);
				isTrue = true;
			}catch(InputMismatchException e) {
				System.out.println("InputMismatchException: Error! enter a correct int.");
				input.next();
			}
		}while(!isTrue);
		
		return result;
	}
	
	public static String readString(String message) {
		boolean isTrue = false;
		String result ="";
		
		do {
			try {
				System.out.println(message + ": ");
				result = input.next();
				System.out.println("String entered: "+result);
			}catch(InputMismatchException e) {
				System.out.println("InputMismatchException: Error! Enter a correct String");
				input.next();
			}
		}while(!isTrue);
		
		return result;
	}

		
		
	}

