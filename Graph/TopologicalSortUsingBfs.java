package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Graph.TopoLogicalSortUsingDfs.Edge;

public class TopologicalSortUsingBfs {
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
	public static void findIndegree(ArrayList<Edge>[] graph ,int id[]) {
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].size(); j++) {
				Edge e=graph[i].get(j);
				id[e.d]++;
			}
		}
		
		
	}
	private static void topoSortUtil(ArrayList<Edge>[] graph) {
		int indegree[]=new int[graph.length];
		findIndegree(graph,indegree);
		Queue<Integer> q=new LinkedList<>();
		for (int i = 0; i < indegree.length; i++) {
			if(indegree[i]==0) {
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			int curr=q.remove();
			System.out.println(curr+" ");
			for (int i = 0; i < graph[curr].size(); i++) {
				Edge e =graph[curr].get(i);
				indegree[e.d]--;
				if(indegree[e.d]==0) {
					q.add(e.d);
				}
			}
		}
		
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
		topoSortUtil(graph);
	}

}
