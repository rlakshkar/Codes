package Heap;

import java.util.ArrayList;

public class HeapOperation {
	static class Heap{
		ArrayList<Integer> l=new ArrayList<>();
		
		public void add(int data) {
			l.add(data);
			int x=l.size()-1;
			int par=(x-1)/2;
			while(l.get(x)<l.get(par)) {
				int temp=l.get(x);
				l.set(x,l.get(par));
				l.set(par, temp);
				x=par;
				par=(x-1)/2;
			}
		}
		
		public int peek() {
			return l.get(0);
		}
		
		public void heapify(int i) {
			int par=i;
			int lc=2*i+1;
			int rc=2*i+2;
			if(lc<l.size() && l.get(lc)<l.get(par)) {
				par=lc;
			}
			if(rc<l.size() && l.get(rc)<l.get(par)) {
				par=rc;
			}
			
			if(par!=i) {
				int temp=l.get(par);
				l.set(par,l.get(i));
				l.set(i,temp);
				heapify(par);
			}	
		}
		
		public int remove() {
			int data=l.get(0);
			int temp=l.get(0);
			l.set(0, l.get(l.size()-1));
			l.set(l.size()-1,temp);
			
			l.remove(l.size()-1);
			
			heapify(0);
			
			return data;
		}

		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return l.size()==0;
		}
	}
	
	public static void main(String args[]) {
		Heap p=new Heap();
		p.add(3);
		p.add(4);
		p.add(1);
		p.add(5);
		
		while(!p.isEmpty()) {
			System.out.println(p.peek());
			p.remove();
		}
		
	}

}
