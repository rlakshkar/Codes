package BinarysSearchTree;

import javax.sound.sampled.DataLine.Info;

public class sizeOfLargestBST {
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
	static int maxBST=0;
	
	public static class Info{
		boolean isBST;
		int size;
		int min;
		int max;
		
		Info(boolean isBST,int size, int min,int max){
			this.isBST=isBST;
			this.size=size;
			this.min=min;
			this.max=max;
		}
	}
	public static Info sizeOfLargestBST(Node root) {
		if(root==null) {
			return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
		}
		Info left=sizeOfLargestBST(root.left);
		Info right=sizeOfLargestBST(root.right);
		int size=left.size+right.size+1;
		int minvalue=Math.min(root.data, Math.min(left.min,right.min));
		int maxvalue=Math.max(root.data, Math.min(left.max,right.max));
		if(root.data<=left.max || root.data>=right.min) {
			return new Info(false, size,minvalue,maxvalue);
		}
		if(left.isBST && right.isBST) {
			maxBST=Math.max(maxBST, size);
			return new Info(true, size,minvalue,maxvalue);
		}
		
		return new Info(false, size,minvalue,maxvalue);
	}
	public static void main(String[] args) {
		
		Node root=new Node(50);
		root.left=new Node(30);
		root.left.left=new Node(5);
		root.left.right=new Node(20);
		
		root.right=new Node(60);
		root.right.left=new Node(45);
		root.right.right=new Node(70);
		root.right.right.left=new Node(65);
		root.right.right.right=new Node(80);
		
		sizeOfLargestBST(root);
		System.out.println(maxBST);
	}

}
