package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionInDirectedGraph {
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
	
	public static boolean iscycle(ArrayList<Edge> graph[]) {
		boolean v[]=new boolean[graph.length];
		boolean s[]=new boolean [graph.length];
		for (int i = 0; i < graph.length; i++) {
			if(!v[i]) {
				if(iscycleUtil(graph,i,v,s)) {
					return true;
				}
			}
			
		}
		return false;
	}
	private static boolean iscycleUtil(ArrayList<Edge>[] graph,int src, boolean[] v,boolean[] s) {
		v[src]=true;
		s[src]=true;
		for (int i = 0; i < graph[src].size(); i++) {
			Edge e = graph[src].get(i);
			if(s[e.d]) {
				return true;
			}
			if(!v[e.d] && iscycleUtil(graph,e.d,v,s)) {
				return true;
			}
		}
		s[src]=false;
		return false;
	}
	public static void main(String[] args) {
		ArrayList<Edge> graph[]= new ArrayList[7];
		
		for (int i = 0; i < graph.length; i++) {
			graph[i]=new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,2,1));
		
		graph[1].add(new Edge(1,0,1));
		
		graph[2].add(new Edge(2,3,1));
	
		graph[3].add(new Edge(3,0,1));
		
		System.out.println(iscycle(graph));
	}

}
