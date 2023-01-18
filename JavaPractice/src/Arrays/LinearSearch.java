package Arrays;

public class LinearSearch {
	public static void linearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Key is found at "+ i);
				return;
			}
		}
		System.out.println("Key is not in the array");
		return;
	}
	public static void main(String args[]) {
		int arr[]= {2,5,7,9,3,6};
		int key=0;
		linearSearch(arr,key);
	}
}
