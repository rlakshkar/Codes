package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingLetter {
	public static void firstNonRepeatingLetter(String s) {
	    Queue<Character> q=new LinkedList<>();
		int freq[]=new int[26];
		
		for (int i = 0; i <s.length(); i++) {
			q.add(s.charAt(i));
			freq[s.charAt(i)-'a']++;
			while(!q.isEmpty() && freq[q.peek()-'a']>1) {
				q.remove();
			}
			
		}
		System.out.println(q.peek()+ " ");
	}

	public static void main(String[] args) {
		String s="aabccxb";
		firstNonRepeatingLetter(s);
	}

}
