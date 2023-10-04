package laboratorio;

public class Exception_array {

	public static void main(String[] args) {
		int numeros [] = new int[2];

	try {
		numeros[0] =2;
		numeros[1] = 4;
		numeros[2] = 5;
		
		
		
			for(int n:numeros) {
			System.out.println(n);}
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("error del array");
			
			
		}
	
	
	
	
			
		}
		
	
	
	
	
	}


