package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeAndTraversal {
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
	static class BinaryTree{
		static int index=-1;
		public static Node buildPreOder(int node[]) {
			index++;
			if(node[index]==-1) {
				return null;
			}
			Node n1=new Node(node[index]);
			n1.left=buildPreOder(node);
			n1.right=buildPreOder(node);
			
			return n1;
		}
		
		public static void preOrder(Node root) {
			if(root==null) {
				System.out.print(-1+" ");
				return;
			}
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
		public static void postOrder(Node root) {
			if(root==null) {
				System.out.print(-1+" ");
				return;
			}
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
		
		public static void inOrder(Node root) {
			if(root==null) {
				System.out.print(-1+" ");
				return;
			}
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
		
		public static void levelOrder(Node root) {
			if(root==null) {
				return;
			}
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			q.add(null);
			while(!q.isEmpty()) {
				Node curr=q.remove();
				if(curr==null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					}else {
						q.add(null);
					}
				}
				else {
					System.out.print(curr.data+" ");
					if(curr.left!=null) {
						q.add(curr.left);
					}
					if(curr.right!=null) {
						q.add(curr.right);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildPreOder(nodes);
		
	}

}
