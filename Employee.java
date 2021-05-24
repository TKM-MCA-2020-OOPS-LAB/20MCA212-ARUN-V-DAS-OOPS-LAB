package javaprjct;

import java.util.Scanner;

class Employees {
	    int Empid;
	    String Name;
	    double salary;
	    String Address;
	    public Employees(int eid, String name,double sal, String add)
	    {
	    	Empid=eid;
	    	Name=name;
	    	salary=sal;
	    	Address=add;
	    }
	   Employees(){}
}
	 class Teacher extends Employees {
	        int Deprt_no;
	        String Subject;
	        public Teacher(int eid, String name,double sal,String add,int dno,String sbj)
	        {
	        	super(eid,name,sal,add);
	        	Deprt_no=dno;
	        	Subject=sbj;
	        }
	        Teacher(){}
	      
	    void display() {
	    	System.out.println("Employee ID:"+Empid+"\nEmployee Name:"+Name+"\nEmployee Salary:"+salary+"\nAddress:"+Address);
	    	System.out.println("Dapartment No:"+Deprt_no+"\nSubject Taught:"+Subject);
	    	}
	    }
 public class Employee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the No of Data Records:");
    	n=sc.nextInt();
    	Scanner n1 = new Scanner(System.in);
    	Scanner n2 = new Scanner(System.in);
    	Teacher arr[]=new Teacher[n];
    	for(i=0;i<n;i++)
    	{
    		arr[i]=new Teacher();
    		System.out.println("\nDetail:"+(i+1));
    		
    		System.out.println("Enter the Employee ID:");
        	arr[i].Empid=n1.nextInt();
        	
        	
        	System.out.println("Enter the Employee Name:");
        	arr[i].Name=n2.nextLine();
        	
        	
        	System.out.println("Enter the Employee Salary:");
        	arr[i].salary=n1.nextInt();
        	
        
        	System.out.println("Enter the Employee Address:");
        	arr[i].Address=n2.nextLine();
        	
       
        	System.out.println("Enter the Department No:");
        	arr[i].Deprt_no=n1.nextInt();
        	
        	
        	System.out.println("Enter the Teacher's Subject:");
        	arr[i].Subject=n2.nextLine();
        	
        	
    	}
    	System.out.println("\n * Details Of Employees & Teachers * ");
    	for(i=0;i<n;i++)
    	{
    		System.out.println("\nDetail"+(i+1));
    		arr[i].display();
    	}
	}

}

