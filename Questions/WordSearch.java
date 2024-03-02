
public class WordSearch {

	public static void main(String[] args) {
		char arr[][]= {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String s = "SEED";
		System.out.println(wordSearch(arr,s,0));
	}

	private static boolean wordSearch(char[][] arr, String s, int index) {
		 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == s.charAt(index)){
					if(wordSearch2(arr,s,i,j,index)) {
						return true;
					}
				}
				
			}
			
		}
		
		return false;
	}

	private static boolean wordSearch2(char[][] arr, String s, int i, int j, int k) {
		
		if(k == s.length()) {
			return true;
		}
		
		if(i>=arr.length || j>=arr[0].length || j<0 || i<0 
				|| arr[i][j] != s.charAt(k)) {
			return false;
		}
		char temp = arr[i][j];
		arr[i][j] = ' ';
		if(wordSearch2(arr,s,i,j+1,k+1) || wordSearch2(arr,s,i+1,j,k+1) || wordSearch2(arr,s,i,j-1,k+1) || wordSearch2(arr,s,i-1,j,k+1)) {
			return true;
		}
		
		arr[i][j]=temp;
		
		return false;
	}

}
