package Trees;

public class Subtree {
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
	
	public static boolean isSubtree(Node root,Node root1) {
		
		if(root==null) {
			return false;
		}
		
		if(root.data==root1.data ) {
			if(isIdentical(root,root1)) {
				return true;
			}
		}
		
		
		return isSubtree(root.left,root1) || isSubtree(root.right,root1);
	}
	public static boolean isIdentical(Node root, Node root1) {
		if(root==null && root1==null) {
			return true;
		}else if(root==null || root1==null || root.data!=root1.data){
			return false;
		}
		
		if(!isIdentical(root.left,root1.left)) {
			return false;
		}
		if(!isIdentical(root.right,root1.right)) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right=new Node(3);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		
		Node root1=new Node(2);
		root1.left=new Node(4);
		root1.right=new Node(5);
		
		
		System.out.println(isSubtree(root,root1));
	}

}
