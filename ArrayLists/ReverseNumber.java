package ArrayLists;

import java.util.ArrayList;

public class ReverseNumber {
	public static void main(String args[]) {
		
		ArrayList<Integer> l=new ArrayList<>();
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(1);

		int lp=0,rp=l.size()-1;
		while(lp<rp){
			int temp=l.get(lp);
			l.set(lp,l.get(rp));
			l.set(rp,temp);
			lp++;
			rp--;
		}

		for(Integer i: l){
			System.out.print(i+ " ");
		}
		
	}

}
