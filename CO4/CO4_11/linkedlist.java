package myprjct;

import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String name;
		LinkedList<String> l= new LinkedList<String>();
		System.out.println("Enter No. of Element:");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter The Students Name:");
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			name=sc1.nextLine();
			l.add(name);
		}
		System.out.println("*****************");
		System.out.println("List Of Students:");
		Iterator<String>i=l.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("*****************");
		l.clear();
		System.out.println("After removing all elements from the Linkedlist:");
		l.clear();
		System.out.println("List:"+l);
		
	}
}