package Arrays;

public class ReverseArray {
	public static void reverseArrayIterative(int arr[],int low,int end) {
		if(arr.length==0) {
			System.out.println("Empty array");
		}
		while(low<=end) {
			int temp=arr[low];
			arr[low]=arr[end];
			arr[end]=temp;
			low++;
			end--;
		}
	}
	
	public static void reverseArrayRecursive(int arr[],int low,int end) {
		if(arr.length==0) {
			System.out.println("Empty array");
			return;
		}
		if(low>=end) {
			return;
		}
		int temp=arr[low];
		arr[low]=arr[end];
		arr[end]=temp;
		reverseArrayRecursive(arr,++low,--end);
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,6};
		reverseArrayRecursive(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}