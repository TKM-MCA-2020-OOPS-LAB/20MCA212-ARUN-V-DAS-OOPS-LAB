package myprjct;

import java.util.*;

public class LHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String str;
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		System.out.println("Enter No. of Data:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the Data:");
		for(int i=0;i<n;i++) {
			Scanner sc1=new Scanner(System.in);
			str=sc1.next();
			set.add(str);
		}
		System.out.println("***********************");
		System.out.println("Size of LinkedHashSet:"+set.size());
		System.out.println("LinkedHashSet:"+set);
		
		System.out.println("***********************");
		System.out.println("Removing Bruce from LinkedHashSet :"+set.remove("Bruce"));
		System.out.println("After Removing :"+set);
		
		System.out.println("***********************");
		System.out.println("Checking Bruce is Present :"+set.contains("Bruce"));
		System.out.println("Checking Wayne is Present :"+set.contains("Wayne"));
		
		System.out.println("***********************");
		System.out.println("Display the LinkedHashSet:");
		Iterator<String>i=set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}
