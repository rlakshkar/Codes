package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

	public static void main(String[] args) {
		int v[]={60,100,120};
		int w[]= {10,20,30};
		double ratio[][]=new double[w.length][2];
		for (int i = 0; i < v.length; i++) {
			ratio[i][0]=i;
			ratio[i][1]=v[i]/(double)w[i];
		}
		
		Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
		
		int wt=50;
		int ans=0;
		for (int i = ratio.length-1; i >=0; i--) {
			int index= (int)ratio[i][0];
			if(w[index]<=wt) {
				ans+=v[index];
				wt=wt-w[index];
			}else {
				ans+=(ratio[i][1]*wt);
				wt=0;
				break;
			}
		}
		
		System.out.println(ans);
	}

}
