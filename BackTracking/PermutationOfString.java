package BackTracking;

public class PermutationOfString {
	public static void permutationOfString(String s, String result) {
		if(s.length()==0) {
			System.out.println(result);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
		String newStr=s.substring(0,i)+s.substring(i+1);
		permutationOfString(newStr,result+s.charAt(i));
		}
		
		
	}
	public static void main(String args[]) {
		String s="abc";
		permutationOfString(s,"");
	}
}
