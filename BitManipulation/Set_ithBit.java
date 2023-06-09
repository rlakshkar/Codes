package BitManipulation;

public class Set_ithBit {
	public static void set_ithBit(int num, int i) {
		int bitmask=1<<i;
		num=num|bitmask;
		System.out.println(num);
	}
	public static void main(String args[]) {
		set_ithBit(10,2);
	}
}
 