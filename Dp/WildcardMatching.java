package Dp;

public class WildcardMatching {

	public static void tabulation(String s1,String s2) {
		boolean dp[][]=new boolean[s1.length()+1][s2.length()+1];
		dp[0][0]=true;
		for (int i = 1; i < dp.length; i++) {
			dp[i][0]=false;
		}
		
		for (int i = 1; i < dp[0].length; i++) {
			if(s2.charAt(i-1)=='*') {
				dp[0][i]=dp[0][i-1];
			}
		}
		
		for (int i = 1; i < s1.length()+1; i++) {
			for (int j = 1; j < s2.length()+1; j++) {
				if(s2.charAt(j-1)=='*') {
					dp[i][j] = dp[i-1][j] || dp[i][j-1];
				}else if(s1.charAt(i-1)==s2.charAt(j-1) || s2.charAt(j-1)=='?'){
					dp[i][j]=dp[i-1][j-1];
				}else {
					dp[i][j]=false;
				}
			}
		}
		System.out.println(dp[s1.length()][s2.length()]);	
	}
	public static void main(String[] args) {
		String s1 ="aa";
		String s2="*b";
		tabulation(s1,s2);
	}

}