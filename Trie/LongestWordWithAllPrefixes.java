package Trie;

public class LongestWordWithAllPrefixes {
	static class Node{
		Node children[]=new Node[26];
		boolean eow=false;
		public Node(){
		for(int i=0;i<children.length;i++) {
			children[i]=null;
		}
		}
	}
	public static Node root=new Node();
	public static void insert(String s) {
		Node  curr=root;
		for (int i = 0; i < s.length(); i++) {
			if(curr.children[s.charAt(i)-'a']==null) {
				curr.children[s.charAt(i)-'a']=new Node();
			}
			curr=curr.children[s.charAt(i)-'a'];
		}
		curr.eow=true;
	}
	
	public static boolean search(String s) {
		Node  curr=root;
		for (int i = 0; i < s.length(); i++) {
			if(curr.children[s.charAt(i)-'a']!=null) {
				curr=curr.children[s.charAt(i)-'a'];
			}else {
				return false;
			}
		}
		
		if(curr.eow==true) {
			return true;
		}
		
		return false;
	}
	public static String ans="";
	public static void longestPrefix(Node root,StringBuilder temp) {
		if(root==null) {
			return;
		}
		for (int i = 0; i <26; i++) {
			if(root.children[i]!=null && root.children[i].eow==true) {
				char ch=(char)(i+'a');
				temp.append(ch);
				if(temp.length()>ans.length()) {
					ans=temp.toString();
				}
				longestPrefix(root.children[i],temp);
				temp.deleteCharAt(temp.length()-1);
			}
			
		}
	}
	public static void main(String[] args) {
		String words[]= {"a","banana","app","appl","ap","apply","apple","mango"};
		for (int i = 0; i < words.length; i++) {
			insert(words[i]);
		}

		longestPrefix(root,new StringBuilder(""));
		System.out.println(ans);
	}
}
