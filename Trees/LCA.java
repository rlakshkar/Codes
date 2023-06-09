package Trees;

import java.util.ArrayList;

import Trees.TopView.Node;

public class LCA {
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public static int lca(Node root,int n1,int n2) {
		int lca=0;
		ArrayList<Integer> p1= new ArrayList<>();
		ArrayList<Integer> p2= new ArrayList<>();
		getPath(root,p1,n1);
		getPath(root,p2,n2);
		
		for(int i=0;i<p1.size() &&i< p2.size();i++) {
			if(p1.get(i)==p2.get(i)) {
				lca=p1.get(i);
			}
			
		}
	    return lca;
	}

	private static boolean getPath(Node root, ArrayList<Integer> p, int n) {
		if(root==null) {
			return false;
		}
		p.add(root.data);
		if(root.data==n) {
			return true;
		}
		boolean left =getPath(root.left,p,n);
		boolean right=getPath(root.right,p,n);
		if(left || right) {
			return true;
		}
		p.remove(p.size()-1);
		return false;
	}

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right=new Node(3);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		System.out.println(lca(root,6,7));

	}

}
