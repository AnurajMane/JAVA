package employee;

public class Manager extends Employee{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2745874143538977933L;
	protected long HRA;
	
	public Manager(String name, String address, int age, boolean gender, long basicSalary, long hRa) {
		super(name, address, age, gender, basicSalary);
		this.HRA = hRa;
	}

	public long getHRA() {
		return HRA;
	}

	public void setHRA(int hRA) {
		HRA = hRA;
	}

	@Override
	public float computeSalary() {
		
		return HRA+basicSalary;
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