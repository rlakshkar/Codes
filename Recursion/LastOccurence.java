package Recursion;

public class LastOccurence {
	public static int lastOccurence(int arr[],int key,int i) {
		if(i==arr.length) {
			return -1;
		}
		if(key==arr[arr.length-i-1]) {
			return arr.length-i-1;
		}else {
			return lastOccurence(arr,key,i+1);
		}
	}
	public static int lastOccurence2(int arr[],int key,int i) {
		if(i==arr.length) {
			return -1;
		}
		int isfound=lastOccurence(arr,key,i+1);
		if(isfound==-1 && arr[i]==key) {
			return i;
		}
		return isfound;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,1,4,5,6,3,2};
		System.out.println(lastOccurence2(arr,5,0));
	}

}
