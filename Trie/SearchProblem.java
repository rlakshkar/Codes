package Trie;

public class SearchProblem {
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
		
		
		return true;
	}
	public static int count=1;
	public static int countNodes(Node root) {
		if(root==null) {
			return 0;
		}
		for(int i=0;i<root.children.length;i++) {
			if(root.children[i]!=null) {
				countNodes(root.children[i]);
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String words= "ababa";
		for (int i = 0; i < words.length(); i++) {
			insert(words.substring(i));
		}

		System.out.println(countNodes(root));
	}
}
