package ArrayLists;

import java.util.ArrayList;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		ArrayList<Integer> h=new ArrayList<>();
		h.add(1);
		h.add(8);
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(8);
		h.add(3);
		h.add(7);
		
		int lp=0, rp=h.size()-1;
		int maxWater=0;
		
		while(lp<rp) {
			if(h.get(lp)< h.get(rp)) {
				maxWater=Math.max(maxWater, (rp-lp)*h.get(lp));
				lp++;
			}else {
				maxWater=Math.max(maxWater, (rp-lp)*h.get(rp));
				rp--;
			}
		}
		
		System.out.println(maxWater);
	}

}
