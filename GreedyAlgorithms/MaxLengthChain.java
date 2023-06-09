package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChain {

	public static void main(String[] args) {
		int start[]= {5,39,5,27,50};
		int end[]= {24,60,28,40,90};
		
		int activities[][]=new int[start.length][3];
		for (int i = 0; i < start.length; i++) {
			activities[i][0]=i;
			activities[i][1]=start[i];
			activities[i][2]=end[i];
			
		}
		Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
		
		int maxLength=1;
		ArrayList<Integer> l=new ArrayList<>();
		int endTime=activities[0][2];
		for(int i = 1; i < activities.length; i++) {
			if(activities[i][1]>endTime) {
				maxLength++;
				endTime=activities[i][2];
			}	
		}
		
		System.out.println(maxLength);	
		
	}

}
