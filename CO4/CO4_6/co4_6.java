package CO_4;

import java.util.Scanner;

class Fibonacci implements Runnable{
	public void run(){
		int n=10,n1=0,n2=1,nxt;
		System.out.println("Fibonacci Series upto "+n+":\n");
		for(int i=1;i<=n;i++) {
			System.out.print(n1+",");
			nxt=n1+n2;
			n1=n2;
			n2=nxt;
    	}
		System.out.println("\n\n*************************\n");
	}
}

class EvenNo implements Runnable{
	public void run(){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of N:");
		n=sc.nextInt();
		System.out.println("Even Numbers from 1 to "+n+":");
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
				}
			}
		}
}
public class co4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci obj=new Fibonacci();
		Thread t=new Thread(obj);
		t.start();
		
		EvenNo obj1=new EvenNo();
		Thread t1=new Thread(obj1);
		t1.start();
	}

}
