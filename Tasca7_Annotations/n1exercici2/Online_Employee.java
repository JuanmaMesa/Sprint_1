package n1exercici2;
import n1exercici1.Employee;

public class Online_Employee extends Employee {
	private static final float PRICE_INTERNET = 40.60f;
	
	public Online_Employee(String name, String Surname,float price_hour) {
		
		super(name,Surname, price_hour);
		
	}
	
	@Override
	public double calculateSalary(float numberHours_month) {
		double salary = super.calculateSalary(numberHours_month)+ PRICE_INTERNET;
		return salary; 
	}
	
	
	@Override
	public void infoSalary(float numberHours, double salary) {
		super.infoSalary(numberHours, salary ) ; 
		System.out.println("Plus interner: "+ PRICE_INTERNET);
		
		
		
	}
}
