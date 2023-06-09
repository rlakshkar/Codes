package BinarysSearchTree;

public class SortedArrayToBST {
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
		}
	}
	public static Node insert(Node root,int val) {
		if(root==null) {
			root=new Node(val);
			return root;
		}
		if(root.data>val) {
			root.left=insert(root.left,val);
		}else {
			root.right=insert(root.right,val);
		}
		return root;
	}
	
	public static void inOrder(Node root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static boolean search(Node root, int key) {
		if(root==null) {
			return false;
		}
		if(root.data==key) {
			return true;
		}
		if(root.data>key) {
			return search(root.left,key);
		}else {
			return search(root.left,key);
		}
	}
	
	

	public static void main(String[] args) {
		int values[]= {1,2,3,4,5,6,7,8};
		
		Node root=sortedArrayToBST(values,0,values.length-1);
		inOrder(root);
	}

	private static Node sortedArrayToBST(int[] values, int i, int j) {
		if(i>j) {
			return null;
		}
		int mid=(i+j)/2;
		Node root=new Node(values[mid]);
		root.left=sortedArrayToBST(values,i,mid-1);
		root.right=sortedArrayToBST(values,mid+1,j);
		return root;
	}

}
