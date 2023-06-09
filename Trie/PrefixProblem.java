package Trie;

public class PrefixProblem {
	static class Node{
		Node children[]=new Node[26];
		int frequency;
		boolean eow=false;
		public Node(){
		for(int i=0;i<children.length;i++) {
			children[i]=null;
		}
		frequency=0;
		}
	}
	public static Node root=new Node();
	public static void insert(String s) {
		Node  curr=root;
		for (int i = 0; i < s.length(); i++) {
			if(curr.children[s.charAt(i)-'a']==null) {
				curr.children[s.charAt(i)-'a']=new Node();
				curr.children[s.charAt(i)-'a'].frequency++;
			}else {
			curr.children[s.charAt(i)-'a'].frequency++;
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
	
	public static void findPrefix(Node root,String ans) {
		if(root==null) {
			return;
		}
		if(root.frequency==1) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < root.children.length; i++) {
			if(root.children[i]!=null){
				findPrefix(root.children[i],(ans+(char)(i+'a')));
			}
		}
	}
	public static void main(String[] args) {
		String words[]= {"zebra","dog","duck","dove"};
		for (int i = 0; i < words.length; i++) {
			insert(words[i]);
		}
    	findPrefix(root,"");
	}
}
