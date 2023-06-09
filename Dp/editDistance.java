package Dp;

public class editDistance {
	 
	public static void tabulation(String s1,String s2) {
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		dp[0][0]=0;
		for (int i = 0; i < s1.length(); i++) {
			dp[i][0]=i;
		}
		
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i]=i;
		}
		
		for (int i = 1; i < s1.length()+1; i++) {
			for (int j = 1; j < s2.length()+1; j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1];
				}else {
					int add=dp[i][j-1]+1;
					int replace=dp[i-1][j-1]+1;
					int delete=dp[i-1][j]+1;
					dp[i][j]=Math.min(replace, Math.min(add, delete));
				}
			}
		}
		System.out.println(dp[s1.length()][s2.length()]);	
	}
	public static void main(String[] args) {
		String s1="intention";
		String s2="execution";
		tabulation(s1,s2);

	}

}
