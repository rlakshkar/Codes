package Trees;


import java.util.LinkedList;
import java.util.Queue;

public class CountNodesAndSum {
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
		
		public static int countNode(Node root) {
			if(root==null) {
				return 0;
			}
			
			int left=countNode(root.left);
			int right =countNode(root.right);
		    int count=left+right+1;
		    
		    return count;
		}
		
		public static int sumNode(Node root) {
			if(root==null) {
				return 0;
			}
			
			int left=sumNode(root.left);
			int right =sumNode(root.right);
		    int sum=left+right+root.data;
		    
		    return sum;
		}
		
		static class Info{
			int count;
			int sum;
			Info(int count,int sum){
				this.count=count;
				this.sum=sum;
			}
		} 
		public static Info countAndSumNode(Node root) {
			if(root==null) {
				return new Info(0,0);
			}
			
			int leftsum=countAndSumNode(root.left).sum;
			int rightsum =countAndSumNode(root.right).sum;
			int leftcount=countAndSumNode(root.left).count;
			int rightcount =countAndSumNode(root.right).count;
		    int sum=leftsum+rightsum+root.data;
		    int count =leftcount+rightcount+1;
		    
		    return new Info(count,sum);
		}
	}

	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildPreOder(nodes);
		System.out.println(tree.countNode(root));
		System.out.println(tree.sumNode(root));
		
		System.out.println(tree.countAndSumNode(root).count);
		System.out.println(tree.countAndSumNode(root).sum);
	}

}
