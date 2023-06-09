package Dp;

public class RodCutting {

	public static void tabulation(int[] v,int []w ,int wt) {
		int dp[][]=new int[v.length+1][wt+1];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				if(i==0 || j==0) {
					dp[i][j]=0;
				}
			}
		}

		for (int i = 1; i <=v.length; i++) {
			for (int j = 1; j <=wt; j++) {
				if(w[i-1] <= j) {
					int cost1=v[i-1]+dp[i][j-w[i-1]];
					int cost2=dp[i-1][j];
					dp[i][j]=Math.max(cost1, cost2);
				}else {
					dp[i][j]=dp[i-1][j];
				}
			}
			
		}
		
		System.out.println(dp[v.length][wt]);
	}
	public static void main(String args[]) {
		int price[]= {1,5,8,9,10,17,17,20};
		int length[]= {1,2,3,4,5,6,7,8};
		int rodlength=8;
		
		tabulation(price,length,rodlength);
	}
}
