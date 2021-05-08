package javaprjvt;

import java.util.Scanner;

public class cpu {
	double price;
	public class processor{
		float core;
		String mfg;
	}
	static class ram{
		int memory;
		String mfg1;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cpu obj=new cpu();
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the price:");
		obj.price=p.nextInt();
		
		cpu.processor obj1 = obj.new processor();
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the no of core:");
		obj1.core=c.nextFloat();
		
		Scanner mf=new Scanner(System.in);
		System.out.println("Enter the manufacturer name:");
		obj1.mfg=mf.nextLine();
		
		cpu.ram obj2 = new cpu.ram();
		Scanner m=new Scanner(System.in);
		System.out.println("Enter the Rame size:");
		obj2.memory=m.nextInt();
		
		Scanner mfg=new Scanner(System.in);
		System.out.println("Enter the manufacturer name:");
		obj2.mfg1=mfg.nextLine();
		
		System.out.println("\nDetails of CPU\nPrice: "+obj.price+"\nProcessor info.\nNo.Of core: "+obj1.core+"\nMFG:"+obj1.mfg+"\nRAM info.\nMemory:"+obj2.memory+"\nMFG:"+obj2.mfg1);
	}

}
