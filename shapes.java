package javaprjvt;

import java.util.Scanner;

public class shapes {
    void area(float x)
    {
    	float sq=x*x;
    	System.out.println("Area of Square: "+sq);
    }
    void area(float x,float y)
    {
    	float rec=x*y;
    	System.out.println("Area of Rectangle: "+rec);
    }
    void area(double r)
    {
    	double cr=3.14*r*r;
    	System.out.println("Area of Square: "+cr);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shapes obj=new shapes();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side of a Square:");
		float a=s.nextFloat();
		System.out.println("Enter the Length & breadth of a Rectangle:");
		float b=s.nextFloat();
		float c=s.nextFloat();
		System.out.println("Enter the Radius of a Circle:");
		double d=s.nextDouble();
		obj.area(a);
		obj.area(b,c);
		obj.area(d);
	}

}
