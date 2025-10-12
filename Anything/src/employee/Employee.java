package employee;

import java.io.Serializable;

public abstract class Employee implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7995158037167301107L;
	protected String name;
	protected String address;
	protected int age;
	protected boolean gender;
	protected long basicSalary;

	
	Employee(){
		
	}
	
	Employee(String name,String address,int age,boolean gender,long basicSalary){
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}
	
	//Getters
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public boolean isGender() {
		return gender;
	}

	public long getBasicSalary() {
		return basicSalary;
	}

	
	//Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public void setBasicSalary(long basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public abstract float computeSalary();

	/*public void commonDisplay() {
		System.out.println("Name : " + name + " address : " + address + " age : " + age + " gender : " + gender);
	}*/
	
	public void display() {
		
	}
	
	
}
