package Trees;

import Trees.TopView.Node;

public class KthLevel {
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
	
	public static void kthLevel(Node root , int n) {
		if(root==null) {
			return;
		}
		if(n==1) {
			System.out.print(root.data+ " ");
			return;
		}
		kthLevel(root.left,n-1);
		kthLevel(root.right,n-1);
		
	}

	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right=new Node(3);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		kthLevel(root,2);

	}

}
