package Sorting;

public class MergeSort {
	public static void mergeSort(int arr[],int low,int end)
	{
		if(low<end) {
			int mid = low+(end-low)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,low,mid,end);
			
		}
	}
	public static void merge(int arr[],int low, int mid, int end) {
		int temp[]= new int[end-low+1];
		int i=low,j=mid+1,k=0;
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
				temp[k++]=arr[i++];
			}else {
				temp[k++]=arr[j++];
			}
		}
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		while(j<=end) {
			temp[k++]=arr[j++];
		}
		int n=0;
		for(int m=low;m<=end;m++) {
			arr[m]=temp[n];
			n++;
		}
	}
	public static void main(String args[])
	{
		int arr[]= {5,1,2,4,3};
		int n=arr.length;
		mergeSort(arr,0,arr.length-1);
		System.out.println("Merge Sort : ");
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+ " ");
		}
	}

}
