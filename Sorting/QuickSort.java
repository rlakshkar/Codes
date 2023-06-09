package Sorting;

public class QuickSort {
	public static int partition(int arr[],int low,int end) {
		int pivot=arr[end];
		int i=low-1;
		for (int j=low;j<end;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;
		return i;
	}
	
	public static void quickSort(int arr[],int low,int end) {
		if(low<end) {
		int p= partition(arr,low,end);
		quickSort(arr,low,p-1);
		quickSort(arr,p+1,end);	
		}
	}
	public static void main(String args[])
	{
		int arr[]= {5,1,2,4,3};
		int n=arr.length;
		quickSort(arr,0,n-1);
		System.out.println("Quick Sort : ");
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+ " ");
		}
	}
}
