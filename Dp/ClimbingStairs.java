package Dp;

public class ClimbingStairs {
	public static int recursion(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return recursion(n-1)+recursion(n-2);
	}
	
	public static int memoisation(int n, int dp[]) {
		if(n==0 ) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		return dp[n]=memoisation(n-1,dp)+memoisation(n-2,dp);
	}
	
	public static int tabulation(int n, int dp[]) {
		
		dp[0]=1;
		for (int i = 1; i <= n; i++) {
			if(i==1){
				dp[i]=dp[i-1]+0;
			}else {
				dp[i]=dp[i-1]+dp[i-2];
			}
		}
		return dp[n];
	}
	public static void main(String[] args) {
		int dp[]=new int[6];
		System.out.println(recursion(5));
		//System.out.println(memoisation(4,dp));
		System.out.println(tabulation(5,dp));

	}

}
