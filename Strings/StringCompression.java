package Strings;

public class StringCompression {
	public static void stringCompression(String s) {
		StringBuilder s1=new StringBuilder("");
		for (int i = 0; i < s.length(); i++) {
			Integer count =1;
			while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
				count++;
				i++;
			}
			s1.append(s.charAt(i));
			if(count>1) {
				s1.append(count);
			}
		}
		System.out.println("String Compression :"+ s1);
	}
	public static void main(String args[]) {
		String s ="abcdf";
		stringCompression(s);
	}
}
