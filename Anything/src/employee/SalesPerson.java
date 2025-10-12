package employee;

public class SalesPerson extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5428504014272626158L;
	protected float commission;
	
	
	public SalesPerson(String name, String address, int age, boolean gender, long basicSalary, float commission) {
		super(name, address, age, gender, basicSalary);
		this.commission = commission;
	}


	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}
	
	@Override
	public float computeSalary() {
		return basicSalary+commission;
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
