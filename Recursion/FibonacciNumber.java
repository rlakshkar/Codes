package Recursion;

public class FibonacciNumber {
	public static int fibonacciNumber(int n ) {
		if(n==0 || n==1 ) {
			return n;
		}
		return fibonacciNumber(n-1)+fibonacciNumber(n-2);
	}
	public static void fibonacciNumber2(int n,int a , int b ) {
		if(n<=0) {
			System.out.println("Enter Valid number for fibanocci");
			return;
		}
		if(n==1) {
			System.out.print(a+" ");
			return;
		}
		if(a==0 && b==1) {
			System.out.print(a+" ");
			System.out.print(b+" ");
		}
		if(n==2) {
			return;
		}
		int c=a+b;
		a=b;
		b=c;
		System.out.print(c+" ");
		fibonacciNumber2(n-1,a ,b );
		
	}
	public static void main(String[] args) {
		fibonacciNumber2(10,0,1);

	}

}
