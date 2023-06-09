package BitManipulation;

public class ClearLast_iBits {
	
	public static void clearLast_iBits(int num, int i) {
		int bitmask=(~0)<<i;
		num=num&bitmask;
		System.out.println(num);
	}
	public static void main(String args[]) {
		clearLast_iBits(15,2);
	}

}
