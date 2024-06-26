package Arrays;

public class MaxSubArraysSum {
	public static void maxSubArraysSum(int arr[]) {
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int start=i;
			for (int j = i; j < arr.length; j++) {
				int end=j;
				int sum=0;
				for (int k = start; k <=end; k++) {
					sum+=arr[k];
				}
					if(max<sum) {
					max=sum;
				}
			}
		}
		System.out.println("Max sum is "+ max);
	}
	public static void main(String args[]) {
		int arr[]= {1,2,-10,4,-5};
		maxSubArraysSum(arr);
	}

}
