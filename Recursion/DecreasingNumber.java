package Recursion;

public class DecreasingNumber {
	public static void decreasingNumber(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n+ " ");
		decreasingNumber(n-1);
	}
	public static void main(String args[]) {
		decreasingNumber(10);
	}

}
