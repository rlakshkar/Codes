package Questions;

public class LongestRepeatingCharacterReplacement {
	 public static int longestRepeatingCharacterReplacement(String s , int k)
	    {
		 int res=0;
		  int left= 0;
		  int right=0;
		  int maxcount=0;
		  int v[] = new int[26];
		  while(right < s.length()) {
			  v[s.charAt(right)-'A']+=1;
			  maxcount= Math.max(maxcount,v[s.charAt(right)-'A']);
			  while(right-left+1-maxcount > k) {
				  v[s.charAt(left)-'A']-=1;
				  left++;
			  }
			  res= Math.max(res,right-left+1);
			  right++;
		  }
		 return res;
	    }
	 public static void main(String[] args)
	    {
	        String str = "AABABBA";

	        System.out.println(longestRepeatingCharacterReplacement(str,1));
	    }
}
