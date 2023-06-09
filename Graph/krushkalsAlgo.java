package Graph;

import java.util.ArrayList;
import java.util.Collections;

public class krushkalsAlgo {
	static class Edge implements Comparable<Edge>{
		int s;
		int d;
		int c;
		Edge(int s ,int d,int c){
			this.s=s;
			this.d=d;
			this.c=c;
		}
		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return this.c-o.c;
		}
	}
	
	static int n=4;
	static int par[]=new int[4];
	static int rank[]=new int[4];
	
	public static void init() {
		for (int i = 0; i < par.length; i++) {
			par[i]=i;
		}
	}

	public static int find(int x) {
		if(par[x]==x) {
			return x;
		}
		return par[x]=find(par[x]);
	}
	
	public static void union(int a,int b) {
		int parA=find(a);
		int parB=find(b);
		
		if(rank[parA]==rank[parB]) {
			par[parB]=parA;
			rank[parA]++;
		}else if(rank[parA]>rank[parB]){
			par[parB]=parA;
		}else {
			par[parA]=parB;
		}
	}
	
	public static void kruskal(ArrayList<Edge> edge,int V) {
		init();
		Collections.sort(edge);
		int mincost=0;
		int count=0;
		for (int i = 0; count< V-1; i++) {
			Edge e=edge.get(i);
			int parA=find(e.s);
			int parB=find(e.d);
			if(parA!=parB) {
				union(e.s,e.d);
				mincost+=e.c;
				count++;
			}
			
		}
		System.out.println(mincost);
	}
	public static void main(String[] args) {
		ArrayList<Edge> edge=new ArrayList<>();
		edge.add(new Edge(0,1,10));
		edge.add(new Edge(0,2,15));
		edge.add(new Edge(0,3,30));
		edge.add(new Edge(0,3,40));
		edge.add(new Edge(0,3,50));
	
		kruskal(edge,4);
	}

}
