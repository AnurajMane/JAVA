package recursion;

public class SignedMultiplication {
	public static int quotientSign(int a, int b) {
		boolean isNegative = (a < 0) ^ (b < 0);

		int x = Math.abs(a);
		int y = Math.abs(b);
		int result = multiplication(x, y);

		return isNegative ? -result : result;
	}

	//for signed Multiplication
	public static int multiplication(int a, int b) {
		if(b < 1 || a < 1) {
			return 0;
		}
		if(a < b) {
			return a+multiplication(a, b-1);
		}
		else
			return b+multiplication(b, a-1);
	}
	
	public static void main(String args []) {
		int result = quotientSign(-40,20);
		System.out.println("Multiplication : " + result);
	}
}