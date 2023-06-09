package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class Implementation {
	static class HashMap<K,V>{
		private class Node{
			K key;
			V value;
			Node(K key, V value){
				this.key=key;
				this.value=value;
			}
		}
		
		
		private int n;
		private int N;
		private LinkedList<Node> bucket[]; 
		public HashMap(){
			this.N=4;
			this.bucket=new LinkedList[4];
			for (int i = 0; i < 4; i++) {
				bucket[i]=new LinkedList<>();
			}
			
		}
		public void put(K key,V value) {
			int bi=hashFunction(key);
			int di= searchInLL(key,bi);
			
			if(di!=-1) {
				Node node=bucket[bi].get(di);
				node.value=value;
			}else {
				bucket[bi].add(new Node(key,value));
				n++;
			}
			
			double lambda=(double)n/N;
			if(lambda>2.0) {
				rehash();
			}
			
		}
		private void rehash() {
			LinkedList<Node> oldBucket[]=bucket;
			bucket=new LinkedList[2*N];
			N=2*N;
			for (int i = 0; i < bucket.length; i++) {
				bucket[i]=new LinkedList<>();
				
			}
			
			for (int i = 0; i < oldBucket.length; i++) {
				LinkedList<Node> ll=oldBucket[i];
				for (int j = 0; j < ll.size(); j++) {
					Node node=ll.remove();
					put(node.key,node.value);
				}
				
			}
			
		}
		private int searchInLL(K key, int bi) {
			LinkedList<Node> ll=bucket[bi];
			for (int i = 0; i < ll.size(); i++) {
				Node node=ll.get(i);
				if(node.key==key) {
					return i;
				}
			}
			return -1;
		}
		private int hashFunction(K key) {
			return Math.abs(key.hashCode())%N;
		}
		
		
		public boolean containsKey(K key) {
			int bi=hashFunction(key);
			int di= searchInLL(key,bi);
			
			if(di!=-1) {
				return true;
			}
			return false;
		}
		
		public V remove(K key) {
			int bi=hashFunction(key);
			int di= searchInLL(key,bi);
			
			if(di!=-1) {
				Node node=bucket[bi].remove(di);
				n--;
				return node.value;
			}else {
				return null;
			}
		}
		public V get(K key) {
			int bi=hashFunction(key);
			int di= searchInLL(key,bi);
			
			if(di!=-1) {
				return bucket[bi].get(di).value;
			}else {
				return null;
			}
			
		}
		
		public ArrayList<K> keySet(){
			ArrayList<K> keys=new ArrayList<>();
			for (int i = 0; i < bucket.length; i++) {
				LinkedList<Node> ll=bucket[i];
				for (Node node : ll) {
					keys.add(node.key);
					
				}
			}
			return keys;
		}
		
		public boolean isEmpty() {
			return n==0;
		}
	}
	public static void main(String[] args) {
		HashMap<String,Integer> h= new HashMap<>();
		h.put("India",120);
		h.put("China",40);
		h.put("Nepal", 50);
		h.put("India",80);
		
		ArrayList<String> keys=h.keySet();
		for (int i = 0; i < keys.size(); i++) {
			System.out.println(keys.get(i)+" "+h.get(keys.get(i)) );
			
		}
		
	}
	
	   
}
