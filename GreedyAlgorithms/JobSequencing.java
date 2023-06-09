package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
	static class Job implements Comparable<Job>{
		int deadline;
		int profit;
		int id;
		
		public Job(int i,int d, int p) {
			this.id=i;
			this.deadline=d;
			this.profit=p;
		}

		@Override
		public int compareTo(Job j) {
			if(this.deadline==j.deadline) {
				return j.profit-this.profit;
			}
			return this.deadline-j.deadline;
		}
	}

	public static void main(String[] args) {
		ArrayList<Job> l=new ArrayList<>();
		
		l.add(new Job(0,4,20));
		l.add(new Job(1,1,10));
		l.add(new Job(2,1,40));
		l.add(new Job(3,1,30));
		
		Collections.sort(l);
		//Collections.sort(l, (a,b)->a.profit-b.profit); when only for one field ,if for two condition use above one 
		
		
		ArrayList<Integer> res=new ArrayList<>();
		res.add((l.get(0)).id);
		int time=(l.get(0)).deadline;
		for(int i=1;i<l.size();i++) {
			if(time<(l.get(i)).deadline) {
				res.add((l.get(i)).id);
				time=(l.get(i)).deadline;
			}
			
		}
		
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i)+" ");
		}
	}

}
