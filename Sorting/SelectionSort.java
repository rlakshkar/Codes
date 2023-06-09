package Sorting;

public class SelectionSort {
	public static void selectionSort(int arr[],int n) {
		
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
	public static void main(String args[])
	{
		int arr[]= {5,1,2,4,3};
		int n=arr.length;
		selectionSort(arr,n);
		System.out.println("Selection Sort : ");
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+ " ");
		}
	}
}
