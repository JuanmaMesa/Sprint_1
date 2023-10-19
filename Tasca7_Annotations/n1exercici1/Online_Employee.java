package n1exercici1;

public class Online_Employee extends Employee {
	private static final float PRICE_INTERNET = 40.60f;
	
	public Online_Employee(String name, String Surname,float price_hour) {
		
		super(name,Surname, price_hour);
		
	}
	
	@Override
	public double calculateSalary(float numberHours_month) {
		double salary = ((numberHours_month * super.getPrice_hour())+PRICE_INTERNET);
		
		//String formattSalary = String.format("%.3f", salary) ;
		//salary =Double.parseDouble(formattSalary);
		return salary; 
	}
}
