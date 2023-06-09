package Hashing;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {

	public static void main(String[] args) {
		int nums[]= {1,2};
		int N=3;
		
		HashMap<Integer,Integer> h=new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(h.containsKey(nums[i])) {
				h.put(nums[i], h.get(nums[i])+1);
			}else {
				h.put(nums[i], 1);
			}
		}
		
		Set<Integer> keys=h.keySet();
		for(Integer k:keys) {
			if(h.get(k)>nums.length/N) {
				System.out.print(k+" ");
			}
		}

	}

}
