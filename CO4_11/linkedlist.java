package myprjct;

import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> l= new LinkedList<Employee>();
		Employee ob1=new Employee(1001,"Sam","Klm",35000);
		Employee ob2=new Employee(1002,"Raju","TVM",45000);
		Employee ob3=new Employee(1003,"Manu","Kochi",40000);
		Employee ob4=new Employee(1004,"Peter","kannur",2500);
	l.add(ob1);	
	l.add(ob2);	
	l.add(ob3);	
	l.add(ob4);	
	Iterator<Employee>n=l.iterator();
	while(n.hasNext()){
		System.out.println("\t"+n.next());
	}
		

	}
}


