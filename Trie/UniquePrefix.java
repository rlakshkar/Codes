package Trie;

public class UniquePrefix {
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
	public static void main(String[] args) {
		String words[]= {"the","a","there","their","any","thee"};
		for (int i = 0; i < words.length; i++) {
			insert(words[i]);
		}

		System.out.println(search("th"));
	}
}
