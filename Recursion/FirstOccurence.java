package Recursion;

public class FirstOccurence {
	public static int firstOccurence(int arr[],int key,int i) {
		if(i==arr.length) {
			return -1;
		}
		if(key==arr[i]) {
			return i;
		}else {
			return firstOccurence(arr,key,i+1);
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,1,4,5,6,3,2};
		System.out.println(firstOccurence(arr,5,0));
	}

}
