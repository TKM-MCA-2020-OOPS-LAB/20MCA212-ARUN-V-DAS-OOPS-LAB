package javainterface;

import java.util.Scanner;

interface calc {
	void input();
	void find();
	void display();
}
class Bill implements calc{
	int order;
	int pid1,pid2,qty1,qty2;
	double unit1,unit2,total1,total2,amnt;
	String nam1,nam2,date;
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		Scanner sc1=new Scanner (System.in);
		
		System.out.println("Enter the Order No:");
		order=sc.nextInt();
		System.out.println("Enter the Date:");
		date=sc1.nextLine();
		
		System.out.println("\nDetails 1:");
		System.out.println("Enter the Product_ID:");
		pid1=sc.nextInt();
		System.out.println("Enter the Name:");
		nam1=sc1.nextLine();
		System.out.println("Enter the Quantity:");
		qty1=sc.nextInt();
		System.out.println("Enter the Unit_Price:");
		unit1=sc.nextInt();
		
		System.out.println("\nDetails 2:");
		System.out.println("Enter the Product_ID:");
		pid2=sc.nextInt();
		System.out.println("Enter the Name:");
		nam2=sc1.nextLine();
		System.out.println("Enter the Quantity:");
		qty2=sc.nextInt();
		System.out.println("Enter the Unit_Price:");
		unit2=sc.nextInt();
	
	}
	@Override
	public void find() {
		// TODO Auto-generated method stub
		total1=qty1*unit1;
		total2=qty2*unit2;
		amnt=total1+total2;
	}	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("\nOrder No:"+order);
		System.out.println("Date:"+date);
		
		System.out.println("\n Product_ID\tName\tQuantity\tUnit_Price\tTotal");
		System.out.println("_____________________________________________________________");
		System.out.println("\n "+pid1+"\t\t"+nam1+"\t"+qty1+"\t\t"+unit1+"\t\t"+total1);
		System.out.println(" "+pid2+"\t\t"+nam2+"\t"+qty2+"\t\t"+unit2+"\t\t"+total2);
		System.out.println("_____________________________________________________________");
		System.out.println("\n\t\t\t\t\tNet.Amount\t"+amnt);
	}
}
public class co3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bill obj=new Bill();
		obj.input();
		obj.find();
		obj.display();		
	}
}
