public class LongestSubstringWithoutRepeatingCharacter {
	  public static int longestUniqueSubsttr(String s)
	    {
		  int res = 0;
		  int left= 0;
		  int right=0;
		  boolean[] v = new boolean[256];
		  while(right < s.length()) {
			  if(v[s.charAt(right)]) {
				  while(v[s.charAt(right)]) {
					  v[s.charAt(left)]= false;
					  left++;
				  }
			  }
			  v[s.charAt(right)] = true;
			  res= Math.max(res,right-left+1);
			  right++;
			  
		  }
		  return res;
		  
	    }
	  
	  public static void main(String[] args)
	    {
	        String str = "himanshukumar";

	        System.out.println(longestUniqueSubsttr(str));
	    }

}