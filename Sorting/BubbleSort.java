package Sorting;
public class BubbleSort {
	public static void bubbleSort(int arr[],int n) {
		boolean swap=false;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(!swap) {
				break;
			}
		}
	}
	public static void main(String args[])
	{
		int arr[]= {5,1,2,4,3};
		int n=arr.length;
		bubbleSort(arr,n);
		System.out.println("Bubble Sort : ");
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]+ " ");
		}
	}
}
