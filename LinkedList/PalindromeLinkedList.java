package LinkedList;

public class PalindromeLinkedList {
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
	
	public static void reverse() {
		if(head==null || head==tail) {
			return;
		}
		
		Node prev=null;
		Node curr=tail=head;
		Node next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	
	public static void palindrome()
	{
		Node fp=head.next;
		Node sp=head;
		while(sp.next!=null && fp.next!=null && fp.next.next!=null) {
			sp=sp.next;
			fp=fp.next.next;
		}
		Node head1=head;
		Node head2=sp.next;
		
		Node prev=null;
		Node curr=tail=head2;
		Node next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head2=prev;
		
		while(head2!=null) {
			if(head1.data==head2.data) {
				head1=head1.next;
				head2=head2.next;
				continue;
			}
			System.out.println("Not palindrome");
			return;
		}
		System.out.println("Palindrome");
		
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
		PalindromeLinkedList l= new PalindromeLinkedList();
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		l.addLast(30);
		l.addLast(20);
		l.addLast(10);
		print();
		palindrome();
	}

}
