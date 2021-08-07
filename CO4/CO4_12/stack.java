package myprjct;
import java.util.*;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String str;
		Stack<String> s=new Stack<String>();
		System.out.println("Enter No. of Data:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the Data:");
		for(int i=0;i<n;i++) {
			Scanner sc1=new Scanner(System.in);
			str=sc1.next();
			s.push(str);
		}
		
		System.out.println("***************************");
		System.out.println("Stack: "+s);
		
		
		//stack peek() method
		System.out.println("Element at the top: "+s.peek());	
		System.out.println("***************************");
		
		//stack pop() method
		System.out.println("Popped Element:"+s.pop());
		System.out.println("Stack after pop opertation:\n"+s);	
		System.out.println("***************************");
		
		//remove element from specific position
		String r=s.remove(0);
		System.out.println("Remove Element at position 1: "+r);	
		System.out.println("Stack after remove an element from a specific position:\n"+s);	
		System.out.println("***************************");
		
		//remove particular element 
		boolean rm=s.remove("Peter");
		System.out.println("Remove Peter: "+rm);	
		System.out.println("Stack after remove an particular element:\n"+s);	
		System.out.println("***************************");
	}

}
