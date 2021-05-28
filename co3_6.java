package javainterface;

import java.util.Scanner;

interface calculation{
	void input();
	void area();
	void perimeter();
}
class Circle implements calculation{
	int r;
	double pi=3.14,ar,pr;
	@Override
	public void input() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the Radius of the Circle: ");
		r=sc.nextInt();
	}
	@Override
	public void area() {
		ar=r*r;
		System.out.println("\nArea of the Circle: "+ar);
	}
	@Override
	public void perimeter() {
		pr=2*pi*r;
		System.out.println("Perimeter of the Circle: "+pr);
		System.out.println("---------------------------------");
	}
}
class Rectangle implements calculation{
	int l,b,ar,pr;
	@Override
	public void input() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("\nEnter the Length of the Recatngle: ");
		l=sc1.nextInt();
		System.out.println("Enter the Breadth of the Recatngle: ");
		b=sc1.nextInt();
	}
	@Override
	public void area() {
		
		ar=l*b;
		System.out.println("\nArea of the Rectangle: "+ar);
	}
	@Override
	public void perimeter() {
	
		pr=2*(l+b);
		System.out.println("Perimeter of the Rectangle: "+pr);
		System.out.println("---------------------------------");
	}
}
public class co3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		Circle obj=new Circle();
		Rectangle obj1=new Rectangle();
		
		while(ch<3) {
		Scanner sc2=new Scanner(System.in);
		System.out.println("\nChoose the Shape: ");
		System.out.println("1.Circle:\n2.Rectangle: ");
		ch=sc2.nextInt();
		switch(ch) {
		case 1:
			obj.input();
			obj.area();
			obj.perimeter();
			break;
		case 2:
			obj1.input();
			obj1.area();
			obj1.perimeter();
			break;
		 default:
			 System.out.println("!Invalid choice!");
		}
	 }
	
   }
}
