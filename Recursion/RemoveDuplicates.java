package Recursion;

public class RemoveDuplicates {
	public static void removeDuplicates(String s, int i ,String s1,boolean map[]){
		if(i==s.length()) {
			System.out.println(s1);
			return;
		}
		if(map[s.charAt(i)-'a']==true) {
			removeDuplicates(s,i+1 ,s1,map);
		}else {
			map[s.charAt(i)-'a']=true;
			removeDuplicates(s,i+1 ,s1+s.charAt(i),map);
		}
	}

	public static void main(String[] args) {
		String s ="apnacollege";
		removeDuplicates(s,0,"",new boolean[26]);
	}

}
