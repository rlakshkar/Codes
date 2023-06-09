package Arrays;

public class TrappingWater {
	public static void trappingwater(int arr[]) {
		int n=arr.length;
		int lb[]=new int[n];
		int rb[]=new int[n];
		int trappedwater=0;
		lb[0]=arr[0];
		for (int i = 1; i < n; i++) {
			lb[i]=Math.max(lb[i-1],arr[i]);
		}
		
		rb[n-1]=arr[n-1];
		for (int i = n-2; i >=0; i--) {
			rb[i]=Math.max(rb[i+1],arr[i]);
		}
		
		for (int i = 0; i < n; i++) {
			trappedwater+=Math.min(lb[i],rb[i])-arr[i];
		}
		System.out.println("Trapped water is "+ trappedwater);
	}

	public static void main(String[] args) {
		int arr[]= {4,2,0,6,3,2,5};
		trappingwater(arr);

	}

}
