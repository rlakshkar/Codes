package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrimsAlgo {
	static class Edge{
		int s;
		int d;
		int w;
		
		Edge(int s,int d,int w){
			this.s=s;
			this.d=d;
			this.w=w;
		}
	}
	
	static class Pair implements Comparable<Pair>{
		int n;
		int cost;
		Pair(int n,int cost){
			this.n =n;
			this.cost=cost;
		}
		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.cost-o.cost;
		}
		
		
	}
	
	private static void prims(ArrayList<Edge>[] graph,int src) {
		boolean v[]=new boolean[graph.length];
		PriorityQueue<Pair> q=new PriorityQueue<>();
		q.add(new Pair(src,0));
		int finalcost=0;
		while(!q.isEmpty()) {
			Pair curr =q.remove();
			if(!v[curr.n]) {
			v[curr.n]=true;
			finalcost+=curr.cost;
			for(int i=0;i<graph[curr.n].size();i++) {
				Edge e=graph[curr.n].get(i);
				q.add(new Pair(e.d,e.w));
			}
			}
			
		}
		System.out.println(finalcost);
	}
	public static void main(String[] args) {
		ArrayList<Edge> graph[]= new ArrayList[7];
		
		for (int i = 0; i < graph.length; i++) {
			graph[i]=new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,1,10));
		graph[0].add(new Edge(0,2,15));
		graph[0].add(new Edge(0,3,30));
		
		graph[1].add(new Edge(1,0,10));
		graph[1].add(new Edge(1,3,40));
		
		graph[2].add(new Edge(2,0,15));
		graph[2].add(new Edge(2,3,50));
		
		graph[3].add(new Edge(3,1,40));
		graph[3].add(new Edge(3,2,50));
		

		prims(graph,0);
	}

}
