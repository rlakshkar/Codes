package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland {
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
	static int ct=0;
	public static void dfs(ArrayList<Edge> graph[]) {
		boolean v[][]=new boolean[graph.length][graph[0].size()];
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < v.length; j++) {
			if(!v[i][j] && graph[i].get(j).w==1) {
				ct++;
				dfsUtil(graph,i,j,v);
			}
		}
		}
	}
	private static void dfsUtil(ArrayList<Edge>[] graph,int src,int j, boolean[][] v) {
		v[src][j]=true;
		for (int i = 0; i < graph[src].size(); i++) {
			Edge e = graph[src].get(i);
			if(!v[src][e.d] && graph[src].get(e.d).w==1) {
				dfsUtil(graph,src,e.d,v);
			}
		}
		
	}
	public static void main(String[] args) {
		ArrayList<Edge> graph[]= new ArrayList[5];
		
		for (int i = 0; i < graph.length; i++) {
			graph[i]=new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,0,1));
		graph[0].add(new Edge(0,1,1));
		graph[0].add(new Edge(0,2,0));
		graph[0].add(new Edge(0,3,1));
		graph[0].add(new Edge(0,4,1));
		
		
		graph[1].add(new Edge(1,0,1));
		graph[1].add(new Edge(1,1,1));
		graph[1].add(new Edge(1,2,0));
		graph[1].add(new Edge(1,3,0));
		graph[1].add(new Edge(1,4,0));
		
		
		graph[2].add(new Edge(2,0,0));
		graph[2].add(new Edge(2,1,1));
		graph[2].add(new Edge(2,2,0));
		graph[2].add(new Edge(2,3,0));
		graph[2].add(new Edge(2,4,0));
		
		graph[3].add(new Edge(3,0,0));
		graph[3].add(new Edge(3,1,1));
		graph[3].add(new Edge(3,2,0));
		graph[3].add(new Edge(3,3,0));
		graph[3].add(new Edge(3,4,1));
		
		
		graph[4].add(new Edge(4,0,1));
		graph[4].add(new Edge(4,1,1));
		graph[4].add(new Edge(4,2,0));
		graph[4].add(new Edge(4,3,1));
		graph[4].add(new Edge(4,4,1));

		dfs(graph);
		System.out.println(ct);
	}

}
