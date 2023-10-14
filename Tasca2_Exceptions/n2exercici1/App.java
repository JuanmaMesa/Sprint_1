package n2exercici1;

import lab2.Input;

public class App {

	public static void main(String[] args) {
	
	//Input read = new Input();
	
		
		boolean response = Input.readYesNo("Do you want a response a few questions? 'y' or 'n'");
		byte age = Input.readByte("Enter your age");
		System.out.println("Age: "+age);
		
		int number = Input.readInt("Enter a number");
		System.out.println("Number: " + number);
		
		float decimalNumber = Input.readFloat("Enter a decimal number");
		
	
		}
	
	public menu() {
		boolean reponse;
		
		do {
			System.out.println();
		}
		
		
		
	}

}
