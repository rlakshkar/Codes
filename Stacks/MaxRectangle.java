package Stacks;

import java.util.Stack;

public class MaxRectangle {
	
	public static void maxRectangle(int arr[]) {
		Stack<Integer> s =new Stack<>();
		int nsr[]=new int[arr.length];
		int nsl[]=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nsr[i]=arr.length;
			}else {
			nsr[i]=s.peek();
			}
			s.push(i);
		}
		s=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nsl[i]=-1;
			}else {
			nsl[i]=s.peek();
			}
			s.push(i);
		}
		int maxArea=0;
		for (int i = 0; i < arr.length; i++) {
			int area=arr[i]*(nsr[i]-nsl[i]-1);
			maxArea=Math.max(maxArea,area);
			
		}
		
		System.out.println(maxArea);
	}

	public static void main(String[] args) {
		int arr[]= {2,1,5,6,2,3};
		maxRectangle(arr);
	}

}
