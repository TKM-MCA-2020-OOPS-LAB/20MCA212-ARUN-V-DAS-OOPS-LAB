package CO_4.Shape_package;

import java.util.Scanner;

interface calc{
	void area();
}
class Rectangle implements calc {
	double l,b;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("*** RECTANGLE ***");
		System.out.println("Enter the Length: ");
		l=sc.nextDouble();
		System.out.println("Enter the Breadth: ");
		b=sc.nextDouble();
		System.out.println("Area of the Rectangle: "+(l*b));
		System.out.println("---------------------------");
	}
}
class Triangle extends Rectangle {
 double b,h;
	public void area() {
		// TODO Auto-generated method stub
		super.area();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n*** TRIANGLE ***");
		System.out.println("Enter the Base: ");
		b=sc.nextDouble();
		System.out.println("Enter the Height: ");
		h=sc.nextDouble();
		System.out.println("Area of the Triangle: "+((b*h)/2));
		System.out.println("---------------------------");
	}
}
class Square extends Triangle {
	double s;
	public void area() {
		// TODO Auto-generated method stub
		super.area();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n*** SQUARE ***");
		System.out.println("Enter the Side:");
		s=sc.nextDouble();	
		System.out.println("Area of the Square: "+s*s);
		System.out.println("---------------------------");
	}
}
class Circle extends Square{
	double r;
	public void area() {
		// TODO Auto-generated method stub
		super.area();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n*** CIRCLE ***");
		System.out.println("Enter the Radius: ");
		r=sc.nextDouble();	
		System.out.println("Area of the Circle: "+(3.14*r*r));
		System.out.println("---------------------------");
	}
}
public class Shapes extends Circle {
	
	public void area() {
		// TODO Auto-generated method stub
		super.area();		
	}

}
