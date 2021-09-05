package myprjct;

import java.util.*;

public class co4_18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hm=new LinkedHashMap<>();
		hm.put(4,"Jack");
		hm.put(1,"Peter");
		hm.put(2,"Sam");
		hm.put(5,"Bruce");
		hm.put(3,"Wayne");
		System.out.println("HashMap:"+hm);
		Map<Integer,String> tm=new TreeMap<>(hm);
		System.out.println("\n ******* Convert HashMap to TreeMap *******\n");
		System.out.println("TreeMap:"+tm);
	}
}
