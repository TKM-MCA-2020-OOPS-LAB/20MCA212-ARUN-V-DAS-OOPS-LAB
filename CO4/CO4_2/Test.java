package CO_4;
import java.util.Scanner;

import CO_4.Arithmetic.operation;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		a=sc.nextInt();
		System.out.println("Enter the Second Number: ");
		b=sc.nextInt();
		System.out.println("\nArithmetic Opertions for Given Two Numbers: ");
		
		operation obj=new operation();
		obj.find(a,b);
		
	}

}
