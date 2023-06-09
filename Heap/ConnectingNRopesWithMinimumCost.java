package Heap;

import java.util.PriorityQueue;

import Heap.NearByCars.Point;

public class ConnectingNRopesWithMinimumCost {

	public static void main(String[] args) {
		PriorityQueue<Integer> p=new PriorityQueue<>();
		p.add(4);
		p.add(3);
		p.add(2);
		p.add(6);
		int cost=0;
		while(p.size()>1) {
			int a=p.remove();
			int b=p.remove();
			cost+=a+b;
			p.add(a+b);
		}
		
		System.out.println(cost);
		

	}

}
