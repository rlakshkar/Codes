package Stacks;

import java.util.Stack;

public class ReverseString {
	public static String reverseString(String s1) {
		Stack<Character> s= new Stack<>();
		String s2="";
		for(int i=0;i<s1.length();i++) {
			s.push(s1.charAt(i));
		}
		while(!s.isEmpty()) {
			s2=s2+s.peek();
			s.pop();
		}
		return s2;
	}
	
	public static void main(String args[]) {
		
		String s1="abc";
		System.out.println(reverseString(s1));
	}

}
