package BackTracking;

public class GridWaysCount {
	public static int gridWaysCount(int n,int m, int i,int j) {
		if(i==n-1 && j==m-1) {
			return 1;
		}
		else if(i==n || j==m) {
			return 0;
		}	
		return gridWaysCount(n,m,i+1,j)+gridWaysCount(n,m,i,j+1);
	}
	public static void main(String args[]) {
		System.out.println(gridWaysCount(3,3,0,0));
	}
}
