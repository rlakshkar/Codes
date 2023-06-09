package ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class FindMaximum {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		l.add(5);
		l.add(4);
		l.add(300);
		l.add(2);
		l.add(1);
		
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < l.size(); i++) {
			if(l.get(i)>max) {
				max=l.get(i);
			}
		}
		System.out.println(max);
	}

}
