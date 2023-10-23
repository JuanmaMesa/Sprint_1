package n2exercici3;

import javax.management.OperationsException;

public class App_calculadora {

	public static void main(String[] args) {
		
		Calculator addiction = (a,b,c) -> a + b + c;
		Calculator subtract = (a,b,c) -> (b - c);
		Calculator multiply = (a,b,c) -> (a * c) *b;
		Calculator division = (a,b) -> ;
		
		System.out.println("suma -> "+addiction.operations(5, 5, 6));
		System.out.println("resta -> "+subtract.operations(5, 6, 6));
		System.out.println("multiplicacion -> "+multiply.operations(5, 5, 6.9f));
		System.out.println("division -> "+division.operations(5, 5, 0));
	
		
		
		System.out.println("division -> "+ String.format("%.2f", division.operations(5, 5, 6)));     //+division.operations(5, 5, 6));
		
		
		
		
		
		

	}
	
	@FunctionalInterface
	interface Calculator{
		float operations(float a, float b, float c);
		
	}
	
	

}
