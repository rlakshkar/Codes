package Dp;

public class longestCommonSubString {

	public static int recursion(String s1,String s2,int i,int j,int currlength) {
		if(i==s1.length() || j==s2.length()) {
			return currlength;
		}
		int maxlength=currlength;
		if(s1.charAt(i)==s2.charAt(j)) {
			maxlength=Math.max(maxlength, recursion(s1,s2,i+1,j+1,currlength+1));
		}

		maxlength=Math.max(maxlength, Math.max(recursion(s1,s2,i+1,j,0),recursion(s1,s2,i,j+1,0)));

		return maxlength;
	}
	
	public static void tabulation(String s1,String s2) {
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0]=0;
		}
		
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i]=0;
		}
		int ans=0;
		for (int i = 1; i < s1.length()+1; i++) {
			for (int j = 1; j < s2.length()+1; j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1]+1;
					ans=Math.max(ans, dp[i][j]);
				}else {
					dp[i][j]=0;
				}
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		String s1="ABCDGH";
		String s2="ACDGHR";
		System.out.println(recursion(s1,s2,0,0,0));
		tabulation(s1,s2);

	}

}
