package collectionsPack;

import java.util.HashSet;

public class HsSet {

	public static void main(String[] args) {
		
		//Union Intersection
		HashSet <Integer> hs = new HashSet<Integer>();
		
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		
       HashSet <Integer> hs2 = new HashSet<Integer>();
		
		hs2.add(200);
		hs2.add(300);
		hs2.add(400);
		
		//Subset
		hs.containsAll(hs2);
		System.out.println("Subset is : "+hs.containsAll(hs2));
		//Union
		hs.addAll(hs2); 
		System.out.println("Union is : "+hs);
		
		//intersection 
		hs.retainAll(hs2); 
		System.out.println("Intersn is : "+hs);
		 
		
		//Difference
		hs.removeAll(hs2);
		System.out.println("Diff is : "+hs);
		
		
		
	}

}
