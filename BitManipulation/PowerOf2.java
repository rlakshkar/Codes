package BitManipulation;

public class PowerOf2 {
	public static void powerOf2(int num) {
		if((num&(num-1))==0) {
			System.out.println("Yes , num is power of 2");
		}else {
			System.out.println("No , num is not power of 2");
		}
		
	}
	public static void main(String args[]){
		powerOf2(1);
		
	}

}
