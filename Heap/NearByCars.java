package Heap;

import java.util.PriorityQueue;

public class NearByCars {
	
	public static class Point implements Comparable<Point>{
		int x;
		int y;
		int dist;
		int index;
		
		Point(int x,int y, int dist, int index){
			this.x=x;
			this.y=y;
			this.dist=dist;
			this.index=index;
		}
		@Override
		public int compareTo(Point o) {
			
			return this.dist-o.dist;
		}
		
	}

	public static void main(String[] args) {
		PriorityQueue<Point> p=new PriorityQueue<>();
		p.add(new Point(3,3,18,0));
		p.add(new Point(5,-1,26,1));
		p.add(new Point(-2,4,20,2));
		
		for (int i = 0; i < 2; i++) {
			System.out.println("C"+p.remove().index);
		}
	}

}
