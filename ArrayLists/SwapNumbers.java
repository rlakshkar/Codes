package ArrayLists;

import java.util.ArrayList;

public class SwapNumbers {
	public static void main(String args[]) {
	
	ArrayList<Integer> l=new ArrayList<>();
	l.add(5);
	l.add(4);
	l.add(3);
	l.add(2);
	l.add(1);
	
	int i1=0,i2=4;
	
	int temp=l.get(i2);
	l.set(i2, l.get(i1));
	l.set(i1, temp);
	
	System.out.println(l);

	}
}
