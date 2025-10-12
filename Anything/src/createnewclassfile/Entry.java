package createnewclassfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Entry {


	public static void main(String args []) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter package name : ");
		String packName = sc.next();
		
		System.out.println("Enter class name : ");
		String className = sc.next();
		
		File file = new File(className + ".java");
		
		System.out.println("Enter Class access specifier :\n1. public 2. default");
		short classAcc = sc.nextShort();
		
		
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("package " + packName + System.lineSeparator());
            
            String a = "public ";
            String b = "default ";
            if(classAcc == 1)
            	writer.append(a + "class " + className + " {" + System.lineSeparator());
            else
            	writer.append(b + "class " + className + " {" + System.lineSeparator());
            //writer.
            
            //**********************************************************************************
            
            
            short choice;
    		do {
    			System.out.println("-----------Add class defination---------\n");
    			System.out.println("1. add field\n2. add method\n3. generate class");
    			System.out.println("Enter your choice : ");
    			choice = sc.nextShort();
    			
    			short subchoice = 0;
    			switch(choice) {
    			
	    			case 1 : 
	    			{
	    				do {
	    					System.out.println("1. Enter the access specifier (public/private/protected) :");
	    					String accSpecifier = sc.next();
	    					System.out.println("2. Enter the data type :");
	    					String dataType = sc.next();
	    					System.out.println("3. enter the name of the variable :");
	    					String varName = sc.next();
	    					
	    					writer.append(accSpecifier + " " + dataType + " " + varName + ";" + System.lineSeparator());
	    					System.out.println("Enter 1 for continue | Enter 4 for break");
	    					
	    					
	    				}while(subchoice < 4);
	    			}
	    			
					/*
					 * case 2 : { do {
					 * 
					 * }while }
					 */
    			}
    			
    		}while(choice < 4);
            
            
            
            
            //**********************************************************************************
            
            
            
            
            System.out.println("Java file created: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
        
        
        
		/*
//			
//		show the menu to choose access specifier a. public b. default
//		show the menu to 
//		1. add field
//		2. add method
//		3. generate class
//		if 1 is chosen
//		a. Enter the data type
//		b. Enter the access specifier
//		c. enter the name of the variable
//		if 2 is chosen
//		a. Enter the return type
//		b. Enter the access specifier
//		c. enter the parameters with name and type
//		d. enter name of the method
//		If 3 is chosen
//		Using all the information gathered above create a java file on your disk with the name of hte class and write the entire body of hte class in that file

	}*/
}
}
