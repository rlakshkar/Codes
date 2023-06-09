package Recursion;

public class SumOf_N_NaturalNumbers {
	public static int sumOf_N_NaturalNumbers(int n) {
		if(n==1) {
			return 1;
		}
		return n+sumOf_N_NaturalNumbers(n-1);
		
	}
	public static void main(String[] args) {
		System.out.println(sumOf_N_NaturalNumbers(5));

	}

}
