package n1exercici1;

public class App_Employee {

	public static void main(String[] args) {
		
		float numberHours_month = 120;
		Online_Employee workerOnline1 = new Online_Employee("Mark", "Spriler", 29);
		
		OnSite_Employee workerOnSite1 = new OnSite_Employee("John","Bull", 42);
		
		
		
		
		
	
		//workerOnline1.calculateSalary(numberHours_month);
		workerOnline1.infoSalary(numberHours_month, workerOnline1.calculateSalary(numberHours_month));
		
		
		
		
		//System.out.println("Salary October: "+ workerOnSite1.calculateSalary(numberHours_month));
		
	
		

	}


}
