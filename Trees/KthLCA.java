package Trees;

import java.util.ArrayList;

import Trees.TopView.Node;

public class KthLCA {
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
	
	public static Node kthLCA(Node root,int n1,int n2,int k) {
		ArrayList<Node> p1= new ArrayList<>();
		ArrayList<Node> p2= new ArrayList<>();
		getPath(root,p1,n1);
		getPath(root,p2,n2);
		
		int i=0;
		for(;i<p1.size() &&i< p2.size();i++) {
			if(p1.get(i)!=p2.get(i)) {
				break;
			}
			
		}
		Node lca=p1.get(i-1-(k-1));
	    return lca;
	}

	private static boolean getPath(Node root, ArrayList<Node> p, int n) {
		if(root==null) {
			return false;
		}
		p.add(root);
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
		System.out.println(kthLCA(root,4,5,1).data);

	}

}
