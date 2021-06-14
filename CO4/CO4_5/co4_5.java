package CO_4;

import java.util.Scanner;

class Table extends Thread{
	public void run(){
		int n=5;
		System.out.println("***Multiplication table Of 5***\n");
		for(int i=1;i<=10;i++)
		{
			
			System.out.println("\t"+n+"X"+i+"="+n*i);
		}
		System.out.println("\n******************************\n");
	}
}

class Prime extends Thread{
	public void run(){
		int n,count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of N:");
		n=sc.nextInt();
		System.out.println("Prime Numbers from 1 to "+n+":");
		for(int i=1;i<=n;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
				}
			}
	}
}

public class co4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj=new Table();
		obj.start();
		
		Prime obj1=new Prime();
		obj1.start();	
	}
}
