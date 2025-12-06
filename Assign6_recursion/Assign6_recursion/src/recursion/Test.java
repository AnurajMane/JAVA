package recursion;

public class Test {

	//get remainder
	private static int remainder(int num1, int num2) {
		if(num1 < 1) {
			
			return 1;
		}
		return 1-remainder(num1-num2, num2);
	
	}
	//get quotient
	private static int quotient(int a, int b) {
		
		if(b == 0) {
			return -1;
		}
		if(a < b) {
			return 0;
		}
		
		
		return 1+quotient(a-b, b);
	}
	
	
	//for signed dividation
	public static int quotientSign(int a, int b) {
		
		
		boolean isNegative = (a < 0) ^ (b < 0);
		
		
		int x = Math.abs(a);
		int y = Math.abs(b);
		int result = quotient(x, y);
		
		return isNegative ? -result : result;
	}
	
	
	public static void main(String[] args) {
	
		//get remainder
		int result = remainder(7,2);
		System.out.println("Remainder : " + result);
		
		//get quotient
		result = quotient(10,2);
		System.out.println("quotient : " + result);
		
		//for signed dividation
		result = quotientSign(-10,2);
		System.out.println("quotient : " + result);
	}

	
}
