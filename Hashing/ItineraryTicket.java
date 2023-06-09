package Hashing;

import java.util.HashMap;
import java.util.Set;

public class ItineraryTicket {
	public static void main(String args[]) {
		HashMap<String,String> map =new HashMap<>();
		map.put("Chennai","Bengaluru");
		map.put("Mumbai", "Delhi");
		map.put("Goa", "Chennai");
		map.put("Delhi", "Goa");
		
		Set<String> keys=map.keySet();
		
		HashMap<String,String> revmap =new HashMap<>();
		for(String key:keys) {
			revmap.put(map.get(key),key);
		}
		
		String start="";
		for(String key:keys) {
			if(!revmap.containsKey(key)) {
				start=key;
			}
		}
		while(map.get(start)!=null) {
			System.out.print(start+" ");
			start=map.get(start);
		}
		System.out.println(start);
	}
}
