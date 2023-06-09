package Recursion;

public class X_ToPowerN {
	public static int x_ToPowerN(int a, int b){
		if(b==0 ) {
			return 1;
		}
		if(b==1 ) {
			return a;
		}
		int hp= x_ToPowerN(a,b/2);
		int result= hp*hp;
		if(b%2!=0) {
			result=result*a;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(x_ToPowerN(2,5));

	}

}
