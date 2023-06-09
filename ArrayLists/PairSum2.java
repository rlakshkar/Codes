package ArrayLists;

import java.util.ArrayList;

public class PairSum2 {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(1);
		l.add(2);
		l.add(3);
		
		int lp=0,rp=0;
		int sum=5;
		for (int i = 0; i <l.size()-1; i++) {
			if(l.get(i)>l.get(i+1)) {
				lp=i+1;
				rp=i;
				break;
			}
		}
		while(lp!=rp) {
			if((l.get(rp)+l.get(lp))>sum) {
				rp=(l.size()+rp-1)%l.size();
			}else if((l.get(rp)+l.get(lp))<sum) {
				lp=(lp+1)%l.size();
			}else {
				System.out.println("n1="+l.get(lp)+ " "+"n2="+l.get(rp));
				if(Math.abs(rp-lp)==1) {
					break;
				}
				rp=(l.size()+rp-1)%l.size();
				lp=(lp+1)%l.size();
			}
		}
	}

}
