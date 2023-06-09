package Trees;

import java.util.ArrayList;

import Trees.TopView.Node;

public class MinimumDistanceBetweenNodes {
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
	
	public static Node lca(Node root,int n1,int n2) {
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
		Node lca=p1.get(i-1);
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
	public static int mdbtn(Node root,int n1,int n2) {
		Node lca=lca(root,n1,n2);
		System.out.println(lca.data);
		int d1=lcaDst(lca,n1);
		int d2=lcaDst(lca,n2);
		return d1+d2;
	}

	private static int lcaDst(Node root, int n) {
		if(root==null) {
			return -1;
		}
		if(root.data==n) {
			return 0;
		}
		int ld=lcaDst(root.left, n);
		int rd=lcaDst(root.right, n);
		if(ld==-1 && rd==-1) {
			return -1;
		}else if(ld==-1) {
			return rd+1;
		}else {
			return ld+1;
		}
	}

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right=new Node(3);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		System.out.println(mdbtn(root,4,6));

	}

}
