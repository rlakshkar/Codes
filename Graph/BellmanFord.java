package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import Graph.DijkstraAlgo.Pair;

public class BellmanFord {
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

	public static void bellmanFord(ArrayList<Edge>[] graph,int src) {
		int dis[]=new int[graph.length];
		for (int i = 0; i < dis.length; i++) {
			if(i!=src) {
				dis[i]=Integer.MAX_VALUE;
			}
		}
		
		for (int i = 0; i < graph.length-1; i++) {
			for (int j = 0; j < graph.length; j++) {
				for (int j2 = 0; j2 < graph[j].size(); j2++) {
					Edge e=graph[j].get(j2);
					if(dis[e.s]!=Integer.MAX_VALUE && dis[e.s]+e.w<dis[e.d]) {
						dis[e.d]=dis[e.s]+e.w;
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
		ArrayList<Edge> graph[]= new ArrayList[5];
		
		for (int i = 0; i < graph.length; i++) {
			graph[i]=new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,1,2));
		graph[0].add(new Edge(0,2,4));
		
		graph[1].add(new Edge(1,2,-4));
		
		graph[2].add(new Edge(2,3,2));
		
		graph[3].add(new Edge(3,4,4));
		
		graph[4].add(new Edge(4,1,-1));
		

		bellmanFord(graph,0);
	}

}
