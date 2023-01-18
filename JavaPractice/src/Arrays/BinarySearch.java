package Arrays;

public class BinarySearch {
	public static int binarySearchRecursive(int arr[],int key,int low,int end) {
		if(arr.length==0) {
			return -1;
		}
		if(low<=end) {
			int mid= low+(end-low)/2;
			if(arr[mid]==key) {
				return mid;
			}else if(arr[mid]<key) {
				return binarySearchRecursive(arr,key,mid+1,end);
			}else {
				return binarySearchRecursive(arr,key,low,mid-1);
			}
		}
		return -1;
	}
	
	public static int binarySearchIterative(int arr[],int key) {
		int low=0;
		int end=arr.length-1;
		
		while(low<=end) {
			int mid=low+(end-low)/2;
			if(arr[mid]==key) {
				return mid;
			}else if(arr[mid]<key) {
				low=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int arr[]= {1,2,4,5,6,7,8,9};
		int key=6;
		System.out.println(binarySearchRecursive(arr,key,0,arr.length-1));
		System.out.println(binarySearchIterative(arr,key));
	}

}
