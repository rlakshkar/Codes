package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopoLogicalSortUsingDfs {
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
	
	public static void topoSort(ArrayList<Edge> graph[]) {
		boolean v[]=new boolean[graph.length];
		Stack<Integer> s= new Stack<>();
		for (int i = 0; i < graph.length; i++) {
			if(!v[i]) {
				topoSortUtil(graph,i,v,s);
			}
			
		}
		
		while(!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
	}
	private static void topoSortUtil(ArrayList<Edge>[] graph,int src, boolean[] v,Stack<Integer> s)
	{
		v[src]=true;
		for (int i = 0; i < graph[src].size(); i++) {
			Edge e = graph[src].get(i);
			if(!v[e.d]) {
				topoSortUtil(graph,e.d,v,s);
			}
		}
		s.push(src);
	}
	public static void main(String[] args) {
		ArrayList<Edge> graph[]= new ArrayList[6];
		
		for (int i = 0; i < graph.length; i++) {
			graph[i]=new ArrayList<>();
		}
		
		graph[2].add(new Edge(2,3,1));
		
		graph[3].add(new Edge(3,1,1));
		
		graph[4].add(new Edge(4,0,1));
		graph[4].add(new Edge(4,1,1));
		
		graph[5].add(new Edge(5,0,1));
		graph[5].add(new Edge(5,2,1));
		

		topoSort(graph);
	}

}
