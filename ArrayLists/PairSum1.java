package ArrayLists;

import java.util.ArrayList;

public class PairSum1 {
	public static void main(String args[]) {
	ArrayList<Integer> l=new ArrayList<>();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(5);
	l.add(6);
	
	int sum=5;
	int lp=0, rp=l.size()-1;
	while(lp<rp) {
		if((l.get(rp)+l.get(lp))>sum) {
			rp--;
		}else if((l.get(rp)+l.get(lp))<sum) {
			lp++;
		}else {
			System.out.println("n1="+l.get(lp)+ " "+"n2="+l.get(rp));
			rp--;
			lp++;
		}
		
	}

}
}
