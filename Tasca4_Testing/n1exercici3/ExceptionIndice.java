package n1exercici3;

public class ExceptionIndice {

	public String[]  primaryColors(int size) throws ArrayIndexOutOfBoundsException {
		
		if (size !=3) {
			throw new ArrayIndexOutOfBoundsException("Tamaño del array incorrecto");
		}
		String colors[]= {"Red","Blue","Yellow"}; 
		return colors;
		
		
		
		
	}

	public static void main(String[]args) {
		
	try{
		ExceptionIndice colors = new ExceptionIndice();
		String[] primaryColors = colors.primaryColors(2
				
				
				);
		//String[]primaryColors = colors.primaryColors();
		//String color = primaryColors[3];
		//System.out.println(color);
	}catch( ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException: "+e.getMessage());
	}
		
		
	}
}
