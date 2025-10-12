package employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.Scanner;

import org.w3c.dom.Node;

public class Entry {

	//	private static Employee [] objEmployee = new Employee[100];
	private static int count = 0;


	

	public static void main(String[] args) throws ClassNotFoundException {

		LinkedList<Employee> objEmployee = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);

		int choice, ch = 0;
		do {

			System.out.println("1. Add Employee\n2. Display All\n3. Save\n4. Load\n5. Sort By\n6. Exit\nEnter Your Choice.............");
			choice = scanner.nextInt();

			switch(choice) {
			case 1 : {
				do {
					System.out.println("Enter which type of Employee you want to add : \n1. Manager\n2. Engineer\n3. SalesPerson\n4. Main Menu");
					ch = scanner.nextInt();

					switch(ch) {
					//For Manager
					case 1 : {

						EmployeeData data = inputData();		
						System.out.print("Enter HRA : ");
						long hRa = scanner.nextInt();	
						objEmployee.add(new Manager(data.name, data.address, data.age, data.gender, data.basicSalary, hRa));
						count++;
						System.out.println("Total Employees : " + count);

					} break;

					//For Engineer
					case 2 : {

						EmployeeData data = inputData();
						System.out.print("Enter Overtime : ");
						long overtime = scanner.nextInt();
						objEmployee.add(new Engineer(data.name, data.address, data.age, data.gender, data.basicSalary, overtime));
						count++;
						System.out.println("Total Employees : " + count);
					} break;

					//For SalesPerson
					case 3 : {

						EmployeeData data = inputData();
						System.out.print("Enter commision : ");
						long commision= scanner.nextInt();
						objEmployee.add(new SalesPerson(data.name, data.address, data.age, data.gender, data.basicSalary, commision));
						count++;
						System.out.println("Total Employees : " + count);
					} break;

					//Go to main menu
					case 4 : {} break;
					}

				}while(ch<4);
			} break;
			case 2 : {
				System.out.println("\n-----------All employees are--------------");
				displayAllEmployees(objEmployee);


			} break;

			case 3 : 
			{
				try {
					//save to file
					ObjectOutputStream objFile = new ObjectOutputStream(new FileOutputStream("text.txt"));
					
					for(Employee data : objEmployee)
						objFile.writeObject(data);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			} break;
			case 4 : 
			{
				//load from file
				try {
					ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("text.txt"));
					Employee emp = null;
					while((emp = (Employee) objIn.readObject()) != null) {
						
						objEmployee.add(emp);
					
					
					
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			} break;

			case 5 : {
				System.out.println("\nSorting By : ");
				//Sorting logic
				do{
					System.out.println("1. Name\n2. Designation\n3. Main Menu");
					ch = scanner.nextInt();
					switch(ch) {
					case 1 : {
						//sort by name
						System.out.println("\n--------------Sorted by Name-----------");
						for (int i = 0; i < objEmployee.size() - 1; i++) {
						    for (int j = i + 1; j < objEmployee.size(); j++) {
						        if (objEmployee.get(i).getName().compareTo(objEmployee.get(j).getName()) > 0) {
						            Employee temp = objEmployee.get(i);
						            objEmployee.set(i, objEmployee.get(j));
						            objEmployee.set(j, temp);
						        }
						    }
						}
							
						displayAllEmployees(objEmployee);
					} break;

					case 2 : {
						//Sort by Designation
						System.out.println("\n-----------Sorted by Designation-------------");
						for (int i = 0; i < objEmployee.size() - 1; i++) {
						    for (int j = i + 1; j < objEmployee.size(); j++) {
						        String designationI = objEmployee.get(i).getClass().getSimpleName();
						        String designationJ = objEmployee.get(j).getClass().getSimpleName();

						        if (designationI.compareTo(designationJ) > 0) {
						            Employee temp = objEmployee.get(i);
						            objEmployee.set(i, objEmployee.get(j));
						            objEmployee.set(j, temp);
						        }
						    }
						}
			
						displayAllEmployees(objEmployee);
					} break;

					case 3 : {} break;
					}
				}while(ch<3);
			} break;

			case 6 : {} break;
			
			}
		}while(choice < 6);
		scanner.close();

	}

	// Method to input common data
	public static EmployeeData inputData () {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter name : ");
		String name = scanner.next();

		System.out.print("Enter Address : ");
		String address = scanner.next();

		System.out.print("Enter Age : ");
		int age = scanner.nextInt();

		System.out.print("Enter Gender (1 for M, 0 for F): ");
		String gender = scanner.next();
		boolean gender1 = Boolean.getBoolean(gender);
		
		System.out.print("Enter Basic Salary : ");
		long basicSalary = scanner.nextInt();
		
		scanner.close();
		
		return new EmployeeData(name, address, age, gender1, basicSalary);

		

	}


	//get valid integer input
//	private static int getIntInput() {
//		while (true) {
//			try {
//				return GetInput.getInt();
//			} catch (InputMismatchException e) {
//				System.out.println("Invalid input. Please enter a number.");
//				GetInput.getInt(); // Clear the invalid input from the buffer
//			} finally {
//				GetInput.getInt(); // Consume the rest of the line
//			}
//		}
//	}

	private static void displayAllEmployees(LinkedList<Employee> objEmployee) {
	    if (objEmployee.isEmpty()) {
	        System.out.println("No employees to display.");
	    } else {
	        for (Employee e : objEmployee) {
	            e.display();
	            System.out.println();
	        }
	    }
	}


	private static class EmployeeData {
		String name;
		String address;
		int age;
		boolean gender;
		long basicSalary;

		public EmployeeData(String name, String address, int age, boolean gender, long basicSalary) {
			this.name = name;
			this.address = address;
			this.age = age;
			this.gender = gender;
			this.basicSalary = basicSalary;
		}
	}
	
	

}