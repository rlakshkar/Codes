package Stacks;

import java.util.Stack;

public class StockSpan {

	public static void stockSpan(int arr[]) {
		Stack<Integer> s =new Stack<>();
		int span[]=new int[arr.length];
		span[0]=1;
		s.push(0);
		for(int i=1;i<arr.length;i++) {
			while(!s.isEmpty() && arr[s.peek()]<arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				span[i]=i+1;
			}else {
			span[i]=i-s.peek();
			}
			s.push(i);
		}
		
		for (int i = 0; i < span.length; i++) {
			System.out.print(span[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {100,80,60,70,60,85,100};
		stockSpan(arr);

	}

}
