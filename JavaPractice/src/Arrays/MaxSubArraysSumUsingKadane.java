package Arrays;

public class MaxSubArraysSumUsingKadane {
	public static void maxSubArraysSumUsingKadane(int arr[]) {
		int max=Integer.MIN_VALUE;
		int currsum=0;
		for (int i = 0; i < arr.length; i++) {
			currsum+=arr[i];
			if(currsum<0) {
				currsum=0;
			}
			if(max<currsum) {
				max=currsum;
			}

		}
		System.out.println("Max sum is "+ max);
	}
	public static void main(String args[]) {
		int arr[]= {1,2,10,4,5};
		maxSubArraysSumUsingKadane(arr);
	}

}
