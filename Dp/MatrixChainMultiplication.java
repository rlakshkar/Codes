package Dp;

public class MatrixChainMultiplication {
	
	public static int tabulation(int[] arr,int i,int j) {
		if(i==j) {
			return 0;
		}
		int mincost=Integer.MAX_VALUE;
		for (int k = i; k < j; k++) {
			int cost1=tabulation(arr,i,k);
			int cost2=tabulation(arr,k+1,j);
			int cost3=arr[i-1]*arr[k]*arr[j];
			int finalCost=cost1+cost2+cost3;
			mincost=Math.min(mincost, finalCost);
		}
		return mincost;
	}
	
	
	public static int memoisation(int[] arr,int i,int j,int dp[][]) {
		if(i==j) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int mincost=Integer.MAX_VALUE;
		for (int k = i; k < j; k++) {
			int cost1=tabulation(arr,i,k);
			int cost2=tabulation(arr,k+1,j);
			int cost3=arr[i-1]*arr[k]*arr[j];
			int finalCost=cost1+cost2+cost3;
			mincost=Math.min(mincost, finalCost);
		}
		return dp[i][j]=mincost;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,3};
		int dp[][]=new int[arr.length][arr.length];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j]=-1;
			}
			
		}
		System.out.println(memoisation(arr,1,arr.length-1,dp));

	}

}
