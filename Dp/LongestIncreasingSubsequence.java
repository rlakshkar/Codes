package Dp;

public class LongestIncreasingSubsequence {
	
	public static void tabulation(int[] s1,int[] s2) {
		int dp[][]=new int[s1.length+1][s2.length+1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0]=0;
		}
		
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i]=0;
		}
		for (int i = 1; i < s1.length+1; i++) {
			for (int j = 1; j < s2.length+1; j++) {
				if(s1[i-1]==s2[j-1]) {
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		System.out.println(dp[s1.length][s2.length]);
	}
	public static void main(String[] args) {
		int arr[]= {50,3,10,7,40,80};
		int arr2[]= {3,7,10,40,50,80};
		/*int dp[][]=new int[s1.length()][s2.length()];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j]=-1;
			}
		}
		System.out.println(memoisation(s1,s2,0,0,dp));*/
		tabulation(arr,arr2);

	}

}
