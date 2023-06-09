package Stacks;

import java.util.Stack;

public class ReverseStack {
	
	public static void pushAtBottom(Stack s ,int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int data1 = (int) s.pop();
		pushAtBottom(s,data);
		s.push(data1);
		
	}
	
	public static void reverse(Stack s) {
		if(s.isEmpty()) {
			return;
		}
		int top=(int)s.pop();
		reverse(s);
		pushAtBottom(s,top);
	}

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		reverse(s);
		
		while(!s.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}
	}

}
