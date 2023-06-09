package BitManipulation;

public class FastExponentiation {
	public static void fastExponentiation(int num,int pow) {
		int ans=1;
		while(pow>0) {
			if((pow&1)!=0) {
				ans*=num;
			}else {
				ans*=1;
			}
			num*=num;
			pow=pow>>1;
		}
		System.out.println("Ans is "+ ans);
	}

	public static void main(String[] args) {
		
		fastExponentiation(2,3);
	}

}
