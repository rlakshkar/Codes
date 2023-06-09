package TwoDArrays;

public class DiagonalSum {
	public static int diagonalSum(int arr[][]) {
		int sum=0;
		int n=arr[0].length-1;
		int m=arr[0].length-1;  
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i][i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			if((n+i)==m && n!=i) {
				sum+=arr[i][n];
			}
			n--;
		}
		return sum;
		
	}
	
	public static void main(String args[]) {
		int matrix[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(diagonalSum(matrix));
	}

}
