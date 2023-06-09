package Strings;

public class ShortestPath {
	public static void shortestPath(String s) {
		int x=0,y=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='N') {
				y++;
			}
			if(s.charAt(i)=='S') {
				y--;
			}
			if(s.charAt(i)=='E') {
				x++;
			}
			if(s.charAt(i)=='W') {
				x--;
			}
		}
		float path=(float)Math.sqrt((x*x+y*y));
		System.out.println("Shortest Path is "+ path);
	}
	public static void main(String[] args) {
		String s="WNEENESENNN";
		shortestPath(s);
	}

}
