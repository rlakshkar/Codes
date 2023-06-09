package BitManipulation;

public class CountSetBits {
	public static void countsetBits(int num) {
		int count=0;
		while(num>0) {
			if((num&1)!=0) {
				count++;
			}
			num=num>>1;
		}
		System.out.println(count);
	}
	public static void main(String args[]) {
		countsetBits(0);
	}

}
