package Strings;

public class Palindrome {
	public static void palindrome(String s) {
		boolean palindrome=true;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				palindrome=false;
				break;
			}
		}
		if(palindrome) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
	}
	public static void main(String args[]) {
		String s="Neha";
		palindrome(s.toLowerCase());
	}
}
