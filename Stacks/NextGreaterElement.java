package Stacks;

import java.util.Stack;

public class NextGreaterElement {
	
	public static void nextGreaterElement(int arr[]) {
		Stack<Integer> s =new Stack<>();
		int nge[]=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			while(!s.isEmpty() && arr[s.peek()]<arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nge[i]=-1;
			}else {
			nge[i]=arr[s.peek()];
			}
			s.push(i);
		}
		
		for (int i = 0; i < nge.length; i++) {
			System.out.print(nge[i]+ " ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {6,8,0,1,3};
		nextGreaterElement(arr);
	}

}
