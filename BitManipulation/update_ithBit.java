package BitManipulation;

public class update_ithBit {
	public static int clear_ithBit(int num, int i) {
		int bitmask=~(1<<i);
		num=num&bitmask;
		return num;
	}
	
	public static void update_ithBit(int num, int i,int newbit) {
		int bitmask=newbit<<i;
		num=clear_ithBit(num,i);
		num=num|bitmask;
		System.out.println(num);
	}
	public static void main(String args[]) {
		update_ithBit(10,0,1);
	}
}
 