package Recursion;

public class TilingProblem {
	public static int tilingProblem(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		
		int ways=tilingProblem(n-1)+tilingProblem(n-2);
		return ways;
	}
	public static void main(String[] args) {
		System.out.println(tilingProblem(3));
	}

}
