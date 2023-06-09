package Strings;

public class LargestString {
	public static void largestString(String s[]) {
		String largest="";
		for (int i = 0; i < s.length-1; i++) {
			if(s[i].compareToIgnoreCase(s[i+1])>0) {
				largest=s[i];
			}
		}
		System.out.println("largest String is "+ largest);
	}
	public static void main(String[] args) {
		String s[]= {"appls","apply","apple"};
		largestString(s);
		
	}

}
