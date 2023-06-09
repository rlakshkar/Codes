package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Graph.TopologicalSortUsingBfs.Edge;

public class AllpathFromSrcToTarget {
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

	private static void dfsUtil(ArrayList<Edge>[] graph,int src,int dest,String ans) {
		if(src==dest) {
			System.out.println(ans+dest);
			return;
		}
		for (int i = 0; i < graph[src].size(); i++) {
			Edge e = graph[src].get(i);
			dfsUtil(graph,e.d,dest,ans+src);
		}
		
	}
	public static void main(String[] args) {
		ArrayList<Edge> graph[]= new ArrayList[7];
		
		for (int i = 0; i < graph.length; i++) {
			graph[i]=new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,3,1));
		
		graph[2].add(new Edge(2,3,1));
		
		graph[3].add(new Edge(3,1,1));
		
		graph[4].add(new Edge(4,0,1));
		graph[4].add(new Edge(4,1,1));
		
		graph[5].add(new Edge(5,0,1));
		graph[5].add(new Edge(5,2,1));

		dfsUtil(graph,5,1," ");
	}

}
