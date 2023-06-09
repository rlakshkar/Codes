package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Graph.BFS.Edge;

public class Bipartitie {
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
	
	private static boolean bipartite(ArrayList<Edge>[] graph) {
		int col[]=new int[graph.length];
		for (int i = 0; i < col.length; i++) {
			col[i]=-1;
		}
		Queue<Integer> q=new LinkedList<>();
		for (int j = 0; j < col.length; j++) {
			if(col[j]==-1) {
			q.add(0);
			col[0]=0;
			while(!q.isEmpty()) {
				int curr =q.remove();
				for(int i=0;i<graph[curr].size();i++) {
					Edge e=graph[curr].get(i);
					if(col[e.d]==-1) {
						q.add(e.d);
						col[e.d]=col[curr]==0?1:0;
					}else if(col[curr]==col[e.d]) {
						return false;
					}
				}
			}
			}
		}
		return true;
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
		graph[2].add(new Edge(2,3,1));
		
		graph[3].add(new Edge(3,1,1));
		graph[3].add(new Edge(3,2,1));
		
		

		System.out.println(bipartite(graph));
	}

}
