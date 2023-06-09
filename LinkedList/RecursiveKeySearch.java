package LinkedList;

public class RecursiveKeySearch {

	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static int size=0;
	public static Node head;
	public static Node tail;
	
	public void addFirst(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=tail=node;
			size++;
			return;
		}
		node.next=head;
		head=node;
		size++;
	}
	
	public void addLast(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=tail=node;
			size++;
			return;
		}
		tail.next=node;
		tail=node;
		size++;
	}
	
	public static void removeFirst() {
		if(head==null) {
			System.out.println("LinkedList is empty");
			return;
		}
		if(head==tail) {
			head=null;
			size--;
			return;
		}
		head=head.next;
		size--;
	}
	
	public static void removeLast() {
		if(head==null) {
			System.out.println("LinkedList is empty");
			return;
		}
		if(head==tail) {
			head=null;
			size--;
			return;
		}
		Node curr=head;
		while(curr.next!=tail) {
			curr=curr.next;
		}
		curr.next=null;
		size--;
	}
	
	public static void addMiddle(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=tail=node;
			size++;
			return;
		}
		Node sp=head;
		Node fp=head;
		while(sp.next!=null && fp.next!=null && fp.next.next!=null) {
			sp=sp.next;
			fp=fp.next.next;
		}
		node.next=sp.next;
		sp.next=node;
		size++;
	}
	
	public static void recursiveKeySearch(int data) {
		recursiveKeySearchHelper(head,data);
		return;
	}
	
	public static void recursiveKeySearchHelper(Node head,int data) {
		if(head==null) {
			System.out.println("Key not found");
			return;
		}
		if(head.data==data) {
			System.out.println("Key found");
			return;
		}
		recursiveKeySearchHelper(head.next,data);
		
	}
	public static void print() {
		Node curr=head;
		if(curr==null) {
			System.out.println("Empty Linked List");
			return;
		}
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.print("null ");
	}

	public static void main(String[] args) {
		RecursiveKeySearch l= new RecursiveKeySearch();
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		l.addLast(40);
		l.addLast(50);
		l.addMiddle(70);
		print();
		recursiveKeySearch(70);
		
		
	}


}
