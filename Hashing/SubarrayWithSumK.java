package Hashing;

import java.util.HashMap;

public class SubarrayWithSumK {

	public static void main(String[] args) {
		int arr[]= {10,2,-2,-20,10};
		HashMap<Integer,Integer> h=new HashMap<>();
		int k=-10;
		int sum=0;
		int count=0;
		h.put(0,1);
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			if(h.containsKey(sum-k)) {
				count=count+h.get(sum-k);
			}
			h.put(sum,h.getOrDefault(sum, 0)+1);
		}
		System.out.println(count);

	}

}
