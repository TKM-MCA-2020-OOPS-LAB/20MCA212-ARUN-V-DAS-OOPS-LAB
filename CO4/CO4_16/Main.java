package myprjct;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String str;
		HashSet<String> set1= new HashSet<String>();
		System.out.println("HashSet 1");
		System.out.println("Enter No. of data:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the data:");
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			str=sc1.nextLine();
			set1.add(str);
		}
		System.out.println("******************");
		System.out.println("HashSet 2");
		HashSet<String> set2= new HashSet<String>();
		System.out.println("Enter No. of data:");
		n=sc.nextInt();
		System.out.println("Enter the data:");
		
		for(int i=0;i<n;i++) {
			str=sc1.nextLine();
			set2.add(str);
		}
		System.out.println("******************");
		System.out.println("Set1: "+set1);
		System.out.println("Set2: "+set2);
		
		System.out.println("******************");
		HashSet<String> u= new HashSet<String>(set1);
		u.addAll(set2);
		System.out.println("Union: "+u);
	
		HashSet<String> i= new HashSet<String>(set1);
		i.retainAll(set2);
		System.out.println("Intersection: "+i);
		
		HashSet<String> d= new HashSet<String>(set1);
		d.removeAll(set2);
		System.out.println("Difference: "+d);
		
	}

}
