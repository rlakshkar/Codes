package Arrays;

public class SearchInRotatedSortedArray {
	public static int searchInRotatedSortedArray(int arr[], int target,int low, int end) {
			if(low>end) {
				return -1;
			}
			int mid=low+(end-low)/2;
			if(arr[mid]==target){
				return mid;
			}
			if(arr[low]<=arr[mid]) {
				if(arr[low]<=target && arr[mid-1]>=target) {
					return searchInRotatedSortedArray(arr, target,low,mid-1);
				}else {
					return searchInRotatedSortedArray(arr, target,mid+1,end);
				}
			}
			if(arr[mid]<=arr[end]) {
				if(arr[mid]<=target && arr[end]>=target) {
					return searchInRotatedSortedArray(arr, target,mid+1,end);
				}else {
					return searchInRotatedSortedArray(arr, target,low,mid-1);
				}
			}
		
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {4,5,6,7,0,1,2};
		System.out.println(searchInRotatedSortedArray(arr,2,0,arr.length-1));
		
	}

}
