package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CheapestFlight {
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
		int k;
		Pair(int n,int path,int k){
			this.n=n;
			this.path=path;
			this.k=k;
		}
		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.k-o.k;
		}
	}
	public static void dijkstra(ArrayList<Edge>[] graph,int src,int dest,int stops) {
		int dis[]=new int[graph.length];
		for (int i = 0; i < dis.length; i++) {
			if(i!=src) {
				dis[i]=Integer.MAX_VALUE;
			}
		}
		boolean v[]=new boolean[graph.length];
		PriorityQueue<Pair> q=new PriorityQueue<>();
		q.add(new Pair(src,0,0));
		while(!q.isEmpty()) {
			Pair curr =q.remove();
			if(curr.k>stops) {
				break;
			}
				for(int i=0;i<graph[curr.n].size();i++) {
					Edge e=graph[curr.n].get(i);
					if(dis[e.s]!= Integer.MAX_VALUE &&  curr.path+e.w<dis[e.d] && curr.k<=stops) {
						dis[e.d]=curr.path+e.w;
						q.add(new Pair(e.d,dis[e.d],curr.k+1));
					}
				}
			
			
		}
		
		System.out.println(dis[dest]);
		
	}
	public static void main(String[] args) {
		ArrayList<Edge> graph[]= new ArrayList[4];
		
		for (int i = 0; i < graph.length; i++) {
			graph[i]=new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,1,100));
		
		
		graph[1].add(new Edge(1,2,100));
		graph[1].add(new Edge(1,3,600));
		
		
		graph[2].add(new Edge(2,0,100));
		graph[2].add(new Edge(2,3,200));
		

		dijkstra(graph,0,3,1);
	}

}
