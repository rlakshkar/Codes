package Arrays;

public class MaxSubArraysSumUsingPrefix {
	public static void maxSubArraysSumUsingPrefix(int arr[]) {
		int max=Integer.MIN_VALUE;
		int temp[]=new int[arr.length];
		temp[0]=arr[0];
		for (int i = 1; i < arr.length; i++) {
			temp[i]=temp[i-1]+arr[i];
		}
		int sum =0;
		for (int i = 0; i < temp.length; i++) {
			for (int j = i; j < temp.length; j++) {
				sum = i==0?temp[j]: temp[j]-temp[i-1];
				if(max<sum) {
					max=sum;
				}
			}
		}
		System.out.println("Max sum is "+ max);
	}
	public static void main(String args[]) {
		int arr[]= {-1,2,10,4,-5};
		maxSubArraysSumUsingPrefix(arr);
	}

}
