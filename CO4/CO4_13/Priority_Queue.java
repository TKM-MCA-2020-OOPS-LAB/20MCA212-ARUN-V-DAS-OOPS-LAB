package myprjct;
import java.util.*;

public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String str;
		PriorityQueue<String> p=new PriorityQueue<String>();
		System.out.println("Enter No. of Data:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the Data:");
		for(int i=0;i<n;i++) {
			Scanner sc1=new Scanner(System.in);
			str=sc1.next();
			p.add(str);
		}
		System.out.println("*****************");
		System.out.println("Priority Queue:");
		Iterator<String>i=p.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		//peek method
		System.out.println("*****************");
		System.out.println("Head of Priority Queue: "+p.peek());

	}
}
