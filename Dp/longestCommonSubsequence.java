package Dp;

public class longestCommonSubsequence {
	public static int recursion(String s1,String s2,int i,int j) {
		if(i==s1.length() || j==s2.length()) {
			return 0;
		}
		if(s1.charAt(i)==s2.charAt(j)) {
			return recursion(s1,s2,i+1,j+1)+1;
		}else {
			return Math.max(recursion(s1,s2,i+1,j),recursion(s1,s2,i,j+1));
		}
	}
	
	public static int memoisation(String s1,String s2,int i,int j,int dp[][]) {
		if(i==s1.length() || j==s2.length()) {
			return 0;
		}
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		if(s1.charAt(i)==s2.charAt(j)) {
			return dp[i][j]=recursion(s1,s2,i+1,j+1)+1;
		}else {
			return dp[i][j]= Math.max(recursion(s1,s2,i+1,j),recursion(s1,s2,i,j+1));
		}
	}
	
	public static void tabulation(String s1,String s2) {
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0]=0;
		}
		
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i]=0;
		}
		for (int i = 1; i < s1.length()+1; i++) {
			for (int j = 1; j < s2.length()+1; j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		System.out.println(dp[s1.length()][s2.length()]);
	}
	public static void main(String[] args) {
		String s1="abcdge";
		String s2="abedg";
		/*int dp[][]=new int[s1.length()][s2.length()];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j]=-1;
			}
		}
		System.out.println(memoisation(s1,s2,0,0,dp));*/
		tabulation(s1,s2);

	}

}
