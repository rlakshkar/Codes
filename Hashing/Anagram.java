package Hashing;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		String s="care";
		String t ="race";
		HashMap<Character,Integer> h=new HashMap<>();
		
		for(int i = 0; i <s.length(); i++) {
			Character c=s.charAt(i);
			h.put(c, h.getOrDefault(c, 0)+1);
		}
		
		for(int i = 0; i <t.length(); i++) {
			Character c=t.charAt(i);
			if(h.get(c)!=null) {
				if(h.get(c)==1) {
					h.remove(c);
				}else {
					h.put(c, h.get(c)-1);
				}
			}
		}
		
		if(h.isEmpty()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
