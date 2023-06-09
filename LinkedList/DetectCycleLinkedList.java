package LinkedList;

public class DetectCycleLinkedList {
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
	
	public static void cycle() {
		Node fp=head;
		while(fp.next!=null) {
			fp=fp.next;
		}
		fp.next=head;
	}
	
	public static void detectCycle() {
		int flag=0;
		Node fp=head;
		Node sp=head;
		while(fp!=null && fp.next!=null) {
			fp=fp.next.next;
			sp=sp.next;
			if(fp==sp) {
				System.out.println("Cycle exist");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Cycle don't exist");
			return;
		}
		if(fp==head) {
			while(fp.next!=sp) {
				fp=fp.next;
			}
			fp.next=null;
			return;
		}
		sp=head;
		Node prev=null;
		while(fp!=sp) {
			prev=fp;
			sp=sp.next;
			fp=fp.next;
		}
		prev.next=null;
	}

	public static void main(String[] args) {
		DetectCycleLinkedList l= new DetectCycleLinkedList();
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		l.addLast(40);
		l.addLast(50);
		l.addMiddle(70);
		print();
		cycle();
		detectCycle();
		detectCycle();
	}

}
