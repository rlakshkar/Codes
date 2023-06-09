package Recursion;

public class BinaryStringWithOutConsecutiveOne {
	public static void binaryStringWithOutConsecutiveOne(int n,int lastplace ,String s) {
		if(n==0) {
			System.out.println(s);
			return;
		}
		binaryStringWithOutConsecutiveOne(n-1,0,s+"0");
		if(lastplace==0) {
		binaryStringWithOutConsecutiveOne(n-1,1,s+"1");
		}
	}
	public static void main(String[] args) {
		binaryStringWithOutConsecutiveOne(3,0,"");

	}

}
