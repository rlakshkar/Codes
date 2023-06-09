package Recursion;

import java.math.BigInteger;

public class Factorial {
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public static BigInteger factorial2(int n) {
		BigInteger factorial = BigInteger.ONE;
		BigInteger factz = BigInteger.valueOf(n);
		if(n==0 || n==1) {
			return factorial;
		}else {
		return factz.multiply(factorial2(n-1));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(factorial2(4));

	}

}
