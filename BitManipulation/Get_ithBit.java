package BitManipulation;

public class Get_ithBit {
	public static void get_ithBit(int num, int i) {
		int bitmask=1<<i;
		if((num&bitmask)!=0) {
			System.out.println("Bit is : "+ 1);
		}else{
			System.out.println("Bit is : "+ 0);
		}
	}
	public static void main(String args[]) {
		get_ithBit(10,2);
	}
}
 