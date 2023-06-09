package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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
	
	public static void bfs(ArrayList<Edge> graph[]) {
		boolean v[]=new boolean[graph.length];
		for (int i = 0; i < graph.length; i++) {
			if(!v[i]) {
				bfsUtil(graph,i,v);
			}
			
		}
	}
	private static void bfsUtil(ArrayList<Edge>[] graph,int src, boolean[] v) {
		Queue<Integer> q=new LinkedList<>();
		q.add(src);
		while(!q.isEmpty()) {
			int curr =q.remove();
			if(!v[curr]) {
			System.out.println(curr);
			v[curr]=true;
			for(int i=0;i<graph[curr].size();i++) {
				Edge e=graph[curr].get(i);
				q.add(e.d);
			}
			}
			
		}
		
	}
	public static void main(String[] args) {
		ArrayList<Edge> graph[]= new ArrayList[7];
		
		for (int i = 0; i < graph.length; i++) {
			graph[i]=new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,1,1));
		graph[0].add(new Edge(0,2,1));
		
		graph[1].add(new Edge(1,3,1));
		graph[1].add(new Edge(1,0,1));
		
		graph[2].add(new Edge(2,0,1));
		graph[2].add(new Edge(2,4,1));
		
		graph[3].add(new Edge(3,1,1));
		graph[3].add(new Edge(3,4,1));
		graph[3].add(new Edge(3,5,1));
		
		graph[4].add(new Edge(4,2,1));
		graph[4].add(new Edge(4,3,1));
		graph[4].add(new Edge(4,5,1));
		
		graph[5].add(new Edge(5,3,1));
		graph[5].add(new Edge(5,4,1));
		graph[5].add(new Edge(5,6,1));
		
		graph[6].add(new Edge(6,5,1));

		bfs(graph);
	}

}
