package Heap;

import java.util.PriorityQueue;

import Heap.NearByCars.Point;

public class WeakestSoldiers {
	
	public static class Row implements Comparable<Row>{
		int count;
		int index;
		
		Row(int count , int index){
			this.count=count;
			this.index=index;
		}
		
		@Override
		public int compareTo(Row o) {
			if(this.count==o.count) {
				return this.index-o.index;
			}
			return this.count-o.count;
		}
	}

	public static void main(String[] args) {
		int row[][]= {{1,0,0,0},{1,1,1,1,},{1,0,0,0},{1,0,0,0}};
		
		PriorityQueue<Row> p=new PriorityQueue<>();
		for (int i = 0; i < row.length; i++) {
			int count=0;
			for (int j = 0; j < row[0].length; j++) {
				count+=row[i][j]==1?1:0;
			}
			p.add(new Row(count,i));
			
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println("A"+p.remove().index);
		}
	}

}
