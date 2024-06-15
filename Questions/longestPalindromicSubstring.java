package Questions;

public class longestPalindromicSubstring {
	
	public static void tabulation(String s1,String s2) {
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0]=0;
		}
		
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i]=0;
		}
		int ans=0;
		String s="";
		for (int i = 1; i < s1.length()+1; i++) {
			for (int j = 1; j < s2.length()+1; j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1]+1;
					if(ans!=Math.max(ans, dp[i][j])) {
						ans=Math.max(ans, dp[i][j]);
						s=s1.substring(0,i);
					}
				}else {
					dp[i][j]=0;
				}
			}
		}
		System.out.println(ans);
		String ss=s.substring((s.length()-ans));
		for (int i =0; i < ss.length(); i++) {
			System.out.print(ss.charAt(i));
		}
	}
	public static void main(String[] args) {
		String s1="forgeeksskeegfor";
		String s2="rofgeeksskeegrof";
		tabulation(s1,s2);

	}

}
