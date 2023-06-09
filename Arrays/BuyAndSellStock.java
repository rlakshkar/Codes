package Arrays;

public class BuyAndSellStock {
	public static void buyAndSellStock(int arr[]) {
		int buyprice=Integer.MAX_VALUE;
		int sellprice=0;
		int profit=0;
		for (int i = 0; i < arr.length; i++) {
			if(buyprice>arr[i]) {
				buyprice=arr[i];
			}else {
				sellprice=arr[i]-buyprice;
				profit=Math.max(profit,sellprice);
			}
			
		}
		System.out.println("Max Profit is "+ profit);
		
	}
	public static void main(String args[]) {
		int price[]= {7,1,5,3,6,4};
		buyAndSellStock(price);
	}

}
