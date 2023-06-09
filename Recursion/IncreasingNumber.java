package Recursion;

public class IncreasingNumber {
	public static void increasingNumber(int n) {
		if(n==0) {
			return;
		}
		increasingNumber(n-1);
		System.out.print(n+ " ");
		
	}
	public static void main(String args[]) {
		increasingNumber(10);
	}

}
