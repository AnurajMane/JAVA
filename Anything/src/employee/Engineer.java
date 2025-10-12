package employee;

public class Engineer extends Employee{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6872160477683145548L;
	protected float overtime;
	protected int ratePerHour = 500;
	
	
	
	public Engineer(String name, String address, int age, boolean gender, long basicSalary, float overtime) {
		super(name, address, age, gender, basicSalary);
		this.overtime = overtime;
	}


	public float getOvertime() {
		return overtime;
	}

	public void setOvertime(float overtime) {
		this.overtime = overtime;
	}
	

	

	@Override
	public float computeSalary() {
		return (overtime * ratePerHour) + basicSalary;
	}
	
	@Override
	public void display() {
		System.out.println("Name : " + name + " address : " + address + " age : " + age + " gender : " + gender + "Total Salary : " + computeSalary());
	}
	
	/*
	public void display() {
		commonDisplay();
		System.out.println(" Total Salary : " + computeSalary());
	}
	*/

}
