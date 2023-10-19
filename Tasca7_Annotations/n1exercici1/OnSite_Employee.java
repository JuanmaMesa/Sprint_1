package n1exercici1;

public class OnSite_Employee extends Employee {
	
	private static float plusPetrol = 45.8f;
	
	public OnSite_Employee(String name, String Surname, float price_hour){
		super(name, Surname, price_hour);
		
	}
	
	public float getPetrol() {
		return plusPetrol;
	}
	
	public void setPetrol(float newValor) {
		plusPetrol = newValor;
	}
	
	@Override
	public double calculateSalary (float numberHours_month) {
		
		double salary = (numberHours_month * super.getPrice_hour())+ plusPetrol;
		return salary;
		
	}
	
	@Override
	public void infoSalary(float numbersHours, double salary) {
		super.infoSalary(numbersHours, salary + plusPetrol);
		
	}
	

}
