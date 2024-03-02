import java.util.ArrayList;
import java.util.PriorityQueue;

public class SlidingWindowMinimum {
	
	public static class Pair implements Comparable<Pair>{
		
		int val;
		int index;
		
		Pair(int val,int index){
			this.val=val;
			this.index=index;
		}

		@Override
		public int compareTo(Pair o) {
			
			return this.val-o.val;
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1,3,-1,-3,5,3,6,7};
		int k=3;
		PriorityQueue<Pair> p=new PriorityQueue<>();
		
		int l[]=new int[arr.length-k+1];
		for (int i = 0; i <k; i++) {
			p.add(new Pair(arr[i],i));
			
		}
		
		l[0]=p.peek().val;
		for (int i = k; i < arr.length; i++) {
			while(p.size()>0 && p.peek().index<=(i-k)) {
				p.remove();
			}
			p.add(new Pair(arr[i],i));
			l[i-k+1]=p.peek().val;
			
		}
		
		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i]);
		}
	}

}
