package Sorting;

public class HeapSort {
	public static void heapify(int arr[],int length,int i) {
		int par=i;
		int lc=2*i+1;
		int rc=2*i+2;
		if(lc<length && arr[lc]>arr[par]) {
			par=lc;
		}
		if(rc<length && arr[rc]>arr[par]) {
			par=rc;
		}
		
		if(par!=i) {
			int temp=arr[par];
			arr[par]=arr[i];
			arr[i]=temp;
			heapify(arr,length,par);
		}	
	}
	public static void heapSort(int arr[]) {
		if(arr.length==0) {
			return;
		}
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,arr.length,i);
		}
		
		for(int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	public static void main(String args[])
	{
		int arr[]= {5,1,2,4,3};
		int n=arr.length;
		heapSort(arr);
		System.out.println("Heap Sort : ");
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+ " ");
		}
	}

}
