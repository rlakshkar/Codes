package GreedyAlgorithms;

public class IndiansCoin {

	public static void main(String[] args) {
		int coins[]= {1,2,5,10,20,50,100,500,1000,2000};
		int v=121;
		
		for (int i = coins.length-1; i >=0 ; i--) {
			while(coins[i]<=v) {
				System.out.println(coins[i]);
				v=v-coins[i];
			}
			if(v==0) {
				break;
			}
		}

	}

}
