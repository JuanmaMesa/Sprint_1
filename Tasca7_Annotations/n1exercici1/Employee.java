package n1exercici1;

public class Employee {
	
	private String name, surName;
	private float price_hour;
	
	public Employee(String name, String Surname, float preu_hora) {
		
		this.name = name;
		this.surName = surName;
		this.price_hour = preu_hora;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public float getPrice_hour() {
		return price_hour;
	}

	public void setPrice_hour(float preu_hora) {
		this.price_hour = preu_hora;
	}

	public double calculateSalary (float numberHours) {
		
		double salary = numberHours * price_hour;
		return salary;
	}
	
	public void infoSalary(float numerHours, double salary) {
		
		System.out.println("  --- information nomina ---\n"+
		"Number hours: "+ numerHours + "\nprice hour:"+price_hour+"\nTotal month: " +salary);
		
		
		
	}
		
		
		
	
}
