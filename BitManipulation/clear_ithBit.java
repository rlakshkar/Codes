package BitManipulation;

public class clear_ithBit {
	public static void clear_ithBit(int num, int i) {
		int bitmask=~(1<<i);
		num=num&bitmask;
		System.out.println(num);
	}
	public static void main(String args[]) {
		clear_ithBit(10,3);
	}
}
 