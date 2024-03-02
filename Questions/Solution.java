class Solution {
    public static int[] plusOne(int[] digits) {
        /*StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            stringBuilder.append(digits[i]);
            
        }

        String s = stringBuilder.toString();
        int num = Integer.parseInt(s) + 1;
        s=Integer.toString(num);
        
        int arr[] = new int[s.length()];
        
        for(int i=arr.length-1;i>=0;i--){
            if(num >0){
                arr[i]= num%10;
                num = num/10;
            }
        }

        return arr;
        */
    	for (int i = digits.length - 1; i >= 0; i--) {
    	      if (digits[i] < 9) {
    	        digits[i]=digits[i]+1;
    	        return digits;
    	      }
    	      digits[i] = 0;
    	    }
    	int a[]=new int[digits.length+1];
    	a[0]=1;
    	return a;
    	
        
    }
    public static void main(String[] args) {
        int d[]= {9,8,7,6,5,4,3,2,1,0};
        int arr[] = plusOne(d);
        for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
    }
}