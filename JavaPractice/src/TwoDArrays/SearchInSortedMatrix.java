package TwoDArrays;

public class SearchInSortedMatrix {
	public static void searchInSortedMatrix(int arr[][],int key) {
		int index=-1;
		int row=0;
		int col=arr[0].length-1;
		while(row!=arr.length && col>=0) {
			if(key==arr[row][col]) {
				System.out.println("key found at "+ row +","+col);
				return ;
			}else if(key<arr[row][col]) {
				col--;
			}else {
				row++;
			}
		}
		System.out.println("key not found");
		return ;
	}
	public static void main(String args[]) {
		int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		searchInSortedMatrix(matrix,7);
	}

}
