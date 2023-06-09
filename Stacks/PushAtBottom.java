package Stacks;

import java.util.Stack;

public class PushAtBottom {
	
	public static void pushAtBottom(Stack s ,int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int data1 = (int) s.pop();
		pushAtBottom(s,data);
		s.push(data1);
		
	}

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		pushAtBottom(s,1);
		pushAtBottom(s,2);
		pushAtBottom(s,3);
		pushAtBottom(s,4);
		
		
		while(!s.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}
	}

}
