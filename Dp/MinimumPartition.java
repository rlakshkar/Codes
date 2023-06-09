package Dp;

public class MinimumPartition {
	public static int ans=0;
	public static int recursion(int v[],int w[],int wt,int i) {
		if(i==w.length || wt==0) {
			return 0;
		}
		if(w[i]<=wt) {
			int cost1=v[i]+recursion(v,w,wt-w[i],i+1);
			int cost2=recursion(v,w,wt,i+1);
			ans=Math.max(cost1, cost2);
		}else {
			ans=recursion(v,w,wt,i+1);
		}
		return ans;
	}
	
	public static int minPartition(int[] nums) {
		int sum=0;
		int val[]=new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
			val[i]=nums[i];
		}
		
		int sum1=recursion(val,nums,sum/2,0);
		int sum2=sum-sum1;
		return Math.abs(sum2-sum1);
	}
	public static void main(String[] args) {
		int nums[]= {1,6,11,5};
		System.out.println(minPartition(nums));
	}

}
