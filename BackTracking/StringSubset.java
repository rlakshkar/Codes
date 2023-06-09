package BackTracking;

public class StringSubset {
	public static void stringSubset(String s, int i, String s1) {
		if(i==s.length()) {
			if(s1.length()==0){
				System.out.println("Empty");
			}else {
			System.out.println(s1);
			}
			return;
		}
		stringSubset(s,i+1,s1+s.charAt(i));
		stringSubset(s,i+1,s1);
		
	}
	public static void main(String args[]) {
		String s="abc";
		stringSubset(s,0,"");
	}
}
