package BackTracking;

public class NQueens {
	public static boolean issafe(char matrix[][],int row,int col) {
		for(int i=row-1;i>=0;i--) {
			if(matrix[i][col]=='Q')
			{
				return false;
			}	
		}
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--) {
			if(matrix[i][j]=='Q')
			{
				return false;
			}	
		}
		for(int i=row-1,j=col+1;i>=0 && j<matrix[0].length;i--,j++) {
			if(matrix[i][j]=='Q')
			{
				return false;
			}	
		}
		
		return true;
	}
	public static void nQueens(char matrix[][],int row) {
		if(row==matrix.length) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					System.out.print(matrix[i][j]+ " ");
				}
				System.out.println("");
			}
			System.out.println("");
			return;
		}
		for(int col=0;col<matrix[0].length;col++) {
			if(issafe(matrix,row,col)) {
				matrix[row][col]='Q';
				nQueens(matrix,row+1);
				matrix[row][col]='X';
			}
		}
	}
		
	public static void main(String args[]) {
		char matrix[][]= {{'X','X','X','X'},{'X','X','X','X'},{'X','X','X','X'},{'X','X','X','X'}};
		nQueens(matrix,0);
		
	}
}