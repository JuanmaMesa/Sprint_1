package laboratorio;	
	
	public class Calculadora {
	    public double dividir(double dividendo, double divisor) throws ArithmeticException {
	        if (divisor == 0) {
	            throw new ArithmeticException("División por cero no permitida");
	        }

	        // Realizar la operación de división
	        return dividendo / divisor;
	    }

	    public static void main(String[] args) {
	        Calculadora calculadora = new Calculadora();

	        try {
	            double resultado = calculadora.dividir(10.0, 0.0);
	            System.out.println("Resultado: " + resultado);
	        } catch (ArithmeticException e) {
	            System.out.println("Se ha producido una excepción: " + e.getMessage());
	            	
	        }
	    }
	}

	


