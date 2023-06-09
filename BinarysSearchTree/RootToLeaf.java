package BinarysSearchTree;

import java.util.ArrayList;

public class RootToLeaf {
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
	
	public static Node delete(Node root, int n) {
		if(root.data<n) {
			root.right=delete(root.right,n);
		}else if(root.data>n) {
			root.left=delete(root.left,n);
		}else {
			if(root.left==null && root.right==null) {
				return null;
			}
			if(root.left==null) {
				return root.right;
			}else if(root.right==null){
				return root.left;
			}
			
			Node IS=findInOrderSuccessor(root.right);
			root.data=IS.data;
			delete(root.right,IS.data);
		}
		return root;
	}
	private static Node findInOrderSuccessor(Node root) {
		while(root.left!=null) {
			root=root.left;
		}
		return root;
	}
	
	public static void printInRange(Node root , int k1, int k2) {
		if(root==null) {
			return;
		}
		if(k1 <= root.data && root.data <= k2) {
			printInRange(root.left,k1, k2);
			System.out.println(root.data);
			printInRange(root.right,k1, k2);
		}
		else if(root.data>k2) {
			printInRange(root.left,k1, k2);
		}else {
			printInRange(root.right,k1, k2);
		}
	}
	
	public static void rootToleaf(Node root, ArrayList<Integer> path) {
		if(root==null) {
			return;
		}
		path.add(root.data);
		if(root.left==null && root.right == null) {
			printPath(path);
		}
		rootToleaf(root.left,path);
		rootToleaf(root.right,path);
		path.remove(path.size()-1);
		
	}

	private static void printPath(ArrayList<Integer> path) {
		for (int i = 0; i < path.size(); i++) {
			System.out.print(path.get(i)+ " ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int values[]= {8,5,10,3,6,11,14};
		Node root=null;
		for (int i = 0; i < values.length; i++) {
			root=insert(root,values[i]);
		}
		
		rootToleaf(root,new ArrayList<>());
		
	}

}