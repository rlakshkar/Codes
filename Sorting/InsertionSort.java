package Sorting;

public class InsertionSort {
	public static void insertionSort(int arr[],int n) {
	
	for(int i=1;i<n;i++) {
		int key=arr[i];
		int j=i-1;
		while(j>=0 && key<arr[j]) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
	}
}
public static void main(String args[])
{
	int arr[]= {5,1,2,4,3};
	int n=arr.length;
	insertionSort(arr,n);
	System.out.println("Insertion Sort : ");
	for(int i=0;i<n;i++) {
	System.out.print(arr[i]+ " ");
	}
}

}
