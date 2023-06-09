package BitManipulation;

public class ClearRangeOfBits {
	public static void clearRangeOfBits(int num, int i,int j) {
		int a=((~0)<<j+1);
		int b=1<<i-1;
		int bitmask=a|b;
		num=num&bitmask;
		System.out.println(num);
	}
	public static void main(String args[]) {
		clearRangeOfBits(10,2,4);
	}

}
