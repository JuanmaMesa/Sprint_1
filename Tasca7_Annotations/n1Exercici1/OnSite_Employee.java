package n1Exercici1;

public class OnSite_Employee extends Employee {
	
	private static float petrol = 45f;
	
	public OnSite_Employee(String name, String Surname, float price_hour){
		super(name, Surname, price_hour);
		
	}
	
	public float getPetrol() {
		return petrol;
	}
	
	public void setPetrol(float newValor) {
		petrol = newValor;
	}
	
	@Override
	public double calculateSalary (float numberHours_month) {
		
		double salary = (numberHours_month * super.getPrice_hour())+ petrol;
		return salary;
		
	}
	

}
