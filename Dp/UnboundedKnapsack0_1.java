package Dp;

public class UnboundedKnapsack0_1 {
	static int ans=0;
	public static int recursion(int v[],int w[],int wt,int i) {
		if(i==w.length || wt==0) {
			return 0;
		}
		if(w[i]<=wt) {
			int cost1=v[i]+recursion(v,w,wt-w[i],i+1);
			int cost2=recursion(v,w,wt,i+1);
			ans=Math.max(cost1, cost2);
		}else {
			ans=recursion(v,w,wt,i+1);
		}
		return ans;
	}
	
	public static int memoisation(int v[],int w[],int wt,int i,int dp[][]) {
		if(i==0 || wt==0) {
			return 0;
		}
		
		if(dp[i][wt]!=0) {
			return dp[i][wt];
		}
		if(w[i-1]<=wt) {
			int cost1=v[i-1]+memoisation(v,w,wt-w[i-1],i-1,dp);
			int cost2=memoisation(v,w,wt,i-1,dp);
			dp[i][wt]=Math.max(cost1, cost2);
		}else {
			dp[i][wt]=memoisation(v,w,wt,i-1,dp);
		}
		return dp[i][wt];
	}
	
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
		int v[]= {15,14,10,45,30};
		int w[]= {2,5,1,3,4};
		int wt=7;
		//System.out.println(recursion(v,w,wt,0));
		//int dp[][]=new int[v.length+1][wt+1];
		//System.out.println(memoisation(v,w,wt,w.length,dp));
		tabulation(v,w,wt);
	}
}
