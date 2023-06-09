package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		l.add(5);
		l.add(4);
		l.add(3);
		l.add(2);
		l.add(1);
		
		Collections.sort(l);
		
		System.out.println(l);
		
		Collections.sort(l,Collections.reverseOrder());
		
		System.out.println(l);
		
	}

}
