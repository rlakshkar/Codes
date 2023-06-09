package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DijkstraAlgo {
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
		int path;
		Pair(int n,int path){
			this.n=n;
			this.path=path;
		}
		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.path-o.path;
		}
	}
	public static void dijkstra(ArrayList<Edge>[] graph,int src) {
		int dis[]=new int[graph.length];
		for (int i = 0; i < dis.length; i++) {
			if(i!=src) {
				dis[i]=Integer.MAX_VALUE;
			}
		}
		boolean v[]=new boolean[graph.length];
		PriorityQueue<Pair> q=new PriorityQueue<>();
		q.add(new Pair(src,0));
		while(!q.isEmpty()) {
			Pair curr =q.remove();
			if(!v[curr.n]) {
				v[curr.n]=true;
				for(int i=0;i<graph[curr.n].size();i++) {
					Edge e=graph[curr.n].get(i);
					if(dis[e.s]+e.w<dis[e.d]) {
						dis[e.d]=dis[e.s]+e.w;
						q.add(new Pair(e.d,dis[e.d]));
					}
				}
			}
			
		}
		
		for (int i = 0; i < dis.length; i++) {
			System.out.print(dis[i]+ " ");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		ArrayList<Edge> graph[]= new ArrayList[6];
		
		for (int i = 0; i < graph.length; i++) {
			graph[i]=new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,1,2));
		graph[0].add(new Edge(0,2,4));
		
		graph[1].add(new Edge(1,2,1));
		graph[1].add(new Edge(1,3,7));
		
		graph[2].add(new Edge(2,4,3));
		
		graph[3].add(new Edge(3,5,1));
		
		graph[4].add(new Edge(4,3,2));
		graph[4].add(new Edge(4,5,5));
		

		dijkstra(graph,0);
	}

}
