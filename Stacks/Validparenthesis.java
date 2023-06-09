package Stacks;

import java.util.Stack;

public class Validparenthesis {
	
	public static boolean validparenthesis(String s) {
		Stack<Character> s1= new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
				s1.push(s.charAt(i));
			}else {
			if(s1.isEmpty()) {
				return false;
			}
			if((s1.peek()=='(' && s.charAt(i)==')') || (s1.peek()=='{' && s.charAt(i)=='}') || (s1.peek()=='[' && s.charAt(i)==']' ) ) {
				s1.pop();
			}else {
				return false;
			}
			}
		}
		if(s1.isEmpty()) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		String s="({})[]";
		System.out.println(validparenthesis(s));

	}

}
