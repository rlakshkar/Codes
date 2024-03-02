import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindRepeatedDnaSequences {
	
	static int ans=0;
	public static int tabulation(String s1,String s2) {
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
					ans=Math.max(ans, dp[i][j]);
				}else {
					dp[i][j]=0;
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		String s1="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		ArrayList<String> s2= new ArrayList<>();
		for(int i=0;i<s1.length()-9;i++) {
			    s2.add(s1.substring(i,i+10));
		}
		List<String> s3= new ArrayList<>();
        HashSet<String> set = new HashSet<>();
		for (int i = 0; i < s2.size(); i++) {
			if(tabulation(s1.substring(i+1),s2.get(i)) == 10)
			{
                 if(!set.contains(s2.get(i))){
                    set.add(s2.get(i));
				    s3.add(s2.get(i));
                 }
			}
            ans=0;
		}
		System.out.println(s3);

	}

}

/*
public List<String> findRepeatedDnaSequences(String s) {
    Set seen = new HashSet(), repeated = new HashSet();
    for (int i = 0; i + 9 < s.length(); i++) {
        String ten = s.substring(i, i + 10);
        if (!seen.add(ten))
            repeated.add(ten);
    }
    return new ArrayList(repeated);
}
 */  
