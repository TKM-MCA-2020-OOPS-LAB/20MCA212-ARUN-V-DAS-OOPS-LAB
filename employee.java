package javaprjvt;

import java.util.Scanner;

public class employee {
	int eno;
	String ename;
	float esalary;
	void info() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the eno:");
		eno=sc.nextInt();
		System.out.println("Enter the EName:");
		ename=sc.next();
		System.out.println("Enter the salary:");
		esalary=sc.nextFloat();
	}
	void display()
	{
	System.out.println("Eno: "+eno+"\nEname: "+ename+"\nEsalary"+esalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int n,i,srch;
		Scanner size=new Scanner(System.in);
		System.out.println("Enter the No. of Employees:");
		n=size.nextInt();
	
		employee emp[]= new employee[n];	
		for(i=0;i<n;i++)
		{
		emp[i]=new employee();
		System.out.println("Enter the Employee details:");
		emp[i].info();
		}
		for(i=0;i<n;i++)
		{
    	System.out.println("\nDetails of Employee:"+(i+1));
    	emp[i].display();
		}
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter the Employee No. to be searched:");
		srch=s.nextInt();
		for( i=0;i<n;i++)
		{
			if(srch==emp[i].eno)
			{
				emp[i].display();
			}
		}
		if(i==n)
		{
			System.out.println("Invalid Employee No!");
		}
}
}
