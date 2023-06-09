package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class Chocola {

	public static void main(String[] args) {
		int n=4,m=6;
		Integer vc[]= {2,1,3,1,4};
		Integer hc[]= {4,1,2};
		
		Arrays.sort(vc,Collections.reverseOrder());
		Arrays.sort(hc,Collections.reverseOrder());
		
		int hp=1,vp=1;
		int h=0,v=0;
		int cost=0;
		while(h<hc.length && v<vc.length) {
			if(vc[v]>hc[h]) {
				cost+=hp*vc[v];
				v++;
				vp++;
			}else {
				cost+=vp*hc[h];
				h++;
				hp++;
			}
		}
		
		while(h<hc.length ) {
		
				cost+=vp*hc[h];
				h++;
				hp++;
		}
		
		while(v<vc.length) {
				cost+=hp*vc[v];
				v++;
				vp++;

		}
		System.out.println(cost);
	}

}
