package myprjct;
import java.util.*;

public class deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String str;
		Deque <String> d= new ArrayDeque<String>();
		System.out.println("Enter No. of Data:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the Data:");
		for(int i=0;i<n;i++) {
			Scanner sc1=new Scanner(System.in);
			str=sc1.next();
			d.add(str);
		}
		System.out.println("*****************");
		System.out.println("Deque:");
		Iterator<String>i=d.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		//peek() method
		System.out.println("*****************");
		System.out.println("Head of the Deque: "+d.peek());
		
		//pop() method
		System.out.println("*****************");
		System.out.println("Popped Element: "+d.pop());
		System.out.println("After Pop: "+d);
				
		//remove() method
		System.out.println("*****************");
		System.out.println("Remove the First Element: "+d.removeFirst());
		System.out.println("After Remove : "+d);
		System.out.println("Remove the Last Element: "+d.removeLast());
		System.out.println("After Remove: "+d);
		
	}

}
