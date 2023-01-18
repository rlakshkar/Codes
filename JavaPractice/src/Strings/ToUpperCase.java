package Strings;

public class ToUpperCase {
	public static void toUpperCase(String s) {
		StringBuilder s1= new StringBuilder("");
		s1.append(Character.toUpperCase(s.charAt(0)));
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i)==' ' && i<s.length()-1) {
				s1.append(s.charAt(i));
				i++;
				s1.append(Character.toUpperCase(s.charAt(i)));
			}else {
				s1.append(s.charAt(i));
			}
		}
		System.out.println("First letter to upper case: "+ s1);
	}
	public static void main(String[] args) {
		String s="hi, i am rahul lakshkar";
		toUpperCase(s);

	}

}
