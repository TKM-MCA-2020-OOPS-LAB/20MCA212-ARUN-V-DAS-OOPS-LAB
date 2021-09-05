package myprjct;

import java.util.*;

public class co4_17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hm=new LinkedHashMap<>();
		hm.put(1,"Jack");
		hm.put(2,"Peter");
		hm.put(3,"Sam");
		hm.put(4,"Bruce");
		System.out.println("Map:"+hm);
		hm.put(2,"Wayne");
		System.out.println("\nAfter Changing An element in the Map:\n"+hm);
		hm.remove(2);
		System.out.println("\nAfter removing an element from the Map:\n"+hm);
	}
}
