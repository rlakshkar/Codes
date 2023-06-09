package Dp;

public class TargetSumSubset {
	
	public static void tabulation(int[] v,int[] n ,int sum) {
		boolean dp[][]=new boolean[v.length+1][sum+1];
		for (int i = 1; i < dp[0].length; i++) {
			dp[0][i]=false;
		}
		for (int j = 0; j < dp.length; j++) {
					dp[j][0]=true;
		}

		for (int i = 1; i <=v.length; i++) {
			for (int j = 1; j <=sum; j++) {
				if(n[i-1] <= j) {
					boolean ans1=dp[i-1][j-n[i-1]];
					boolean ans2=dp[i-1][j];
					dp[i][j]=ans1 || ans2;
				}else {
					dp[i][j]=dp[i-1][j];
				}
			}
			
		}
		
		System.out.println(dp[v.length][sum]);
	}
	public static void main(String args[]) {
		int v[]= {4,2,7,1,3};
		int n[]= {4,2,7,1,3};
		int sum=6;

		tabulation(v,n,sum);
	}
}
