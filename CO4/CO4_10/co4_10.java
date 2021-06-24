package myprjct;

import java.util.ArrayList;
import java.util.Collections;

public class co4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Arun");
		obj.add("Sameer");
		obj.add("Gaurav");
		obj.add("Sid");
		System.out.println("\nArray List:");
		for(String str:obj)
			System.out.println(str);
		
		obj.remove("Sid");
		System.out.println("\nAfter removed a String:");
		for(String str:obj)
			System.out.println(str);
		
		Collections.sort(obj);
		System.out.println("\nSort the List:");
		for(String str:obj)
			System.out.println(str);
		
		System.out.println("\nString at Index 0 is: "+obj.get(0));
		System.out.println("String at Index 1 is: "+obj.get(1));
		
		System.out.println("\nSameer is present in List:"+obj.contains("Sameer"));
		System.out.println("Ajay is present in List:"+obj.contains("Ajay"));

		System.out.println("\nSize of the Array List: "+obj.size());
		
		obj.clear();
		System.out.println("\nClear all elements in the list: "+obj);
	}

}
