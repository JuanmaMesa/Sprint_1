package n1Exercici1;

public class App_Employee {

	public static void main(String[] args) {
		
		float numberHours = 31;
		Online_Employee workerOnline1 = new Online_Employee("Mark", "Spriler", 29);
		
		OnSite_Employee workerOnSite1 = new OnSite_Employee("John","Bull", 49);
		
		
		
		
		
		
		System.out.println(workerOnline1.calculateSalary(numberHours));

	}

}
