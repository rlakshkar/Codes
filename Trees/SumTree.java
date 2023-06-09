package Trees;

import Trees.KthLCA.Node;

public class SumTree {
	
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
	
	public static int sumTree(Node root) {
		if(root==null) {
			return 0;
		}
		int left=sumTree(root.left);
		int right=sumTree(root.right);
		int data=root.data;
		root.data=left+right;
		
		return data+root.data;
	}
	
	public static void preOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right=new Node(3);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		sumTree(root);
		preOrder(root);

	}

}
