package BackTracking;


public class Suduko {
	public static boolean sudukoSolver(int matrix[][],int row,int col,int d) {
		for (int i = 0; i < 9; i++) {
			if(matrix[row][i]==d) {
				return false;
			}
		}
		
		for (int i = 0; i < 9; i++) {
			if(matrix[i][col]==d) {
				return false;
			}
		}
		
		int r=(row/3)*3;
		int c=(col/3)*3;
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				if(matrix[i][j]==d) {
					return false;
				}
			}
		}
		
		
		return true;
	}
	
	public static boolean suduko(int matrix[][],int row,int col) {
		if(row==9) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					System.out.print(matrix[i][j]+ " ");
				}
				System.out.println("");
			}
			return true;
		}
		int nextRow =row,nextCol=col+1;
		if(nextCol==9) {
			nextRow++;
			nextCol=0;
		}
		
		if(matrix[row][col]!=0) {
			return suduko(matrix,nextRow,nextCol);
			
		}
		
		for(int d=1;d<=9;d++) {
			if(sudukoSolver(matrix,row,col,d)) {
				matrix[row][col]=d;
				if(suduko(matrix,nextRow,nextCol)) {
					return true;
				}
				matrix[row][col]=0;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		int matrix[][]={ {3, 0, 6, 5, 0, 8, 4, 0, 0},
				{5, 2, 0, 0, 0, 0, 0, 0, 0},
				{0, 8, 7, 0, 0, 0, 0, 3, 1},
				{0, 0, 3, 0, 1, 0, 0, 8, 0},
				{9, 0, 0, 8, 6, 3, 0, 0, 5},
				{0, 5, 0, 0, 9, 0, 6, 0, 0}, 
				{1, 3, 0, 0, 0, 0, 2, 5, 0},
				{0, 0, 0, 0, 0, 0, 0, 7, 4},
				{0, 0, 5, 2, 0, 6, 3, 0, 0} };
		suduko(matrix,0,0);
	}
}
