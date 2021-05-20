package javaprjct;

import java.util.Scanner;

public class Employee {
	    int Empid;
	    String Name;
	    double salary;
	    String Address;
	    public Employee(int eid, String name,double sal, String add)
	    {
	    	Empid=eid;
	    	Name=name;
	    	salary=sal;
	    	Address=add;
	    }
	    public class Teacher extends Employee {
	        int Deprt_no;
	        String Subject;
	        public Teacher(int eid, String name,double sal,String add,int dno,String sbj)
	        {
	        	super(eid,name,sal,add);
	        	Deprt_no=dno;
	        	Subject=sbj;
	        }
	    void display() {
	    	System.out.println(" Details of all Employees ");
	    	System.out.println("Employee ID:"+Empid+"\nEmployee Name:"+Name+"\nEmployee Salary:"+salary+"\nAddress:"+Address);
	    	System.out.println(" Details of Teachers");
	    	System.out.println("Dapartment No:"+Deprt_no+"\nSubject Taught:"+Subject);

	    	}
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id,dn,n,i;
		String nam,ad,sb;
		double s;
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the No of Datas:");
    	n=sc.nextInt();
    	Teacher arr[]=new Teacher[n];
    	for(i=0;i<n;i++)
    	{
    		Scanner n1 = new Scanner(System.in);
        	Scanner n2 = new Scanner(System.in);
    		System.out.println("Enter the Employee ID:");
        	id=n1.nextInt();
        	
        	
        	System.out.println("Enter the Employee Name:");
        	nam=n2.nextLine();
        	
        	
        	System.out.println("Enter the Employee Salary:");
        	s=n1.nextInt();
        	
        
        	System.out.println("Enter the Employee Address:");
        	ad=n2.nextLine();
        	
       
        	System.out.println("Enter the Department No:");
        	dn=n1.nextInt();
        	
        	
        	System.out.println("Enter the Teacher's Subject:");
        	sb=n2.nextLine();
        	
        	arr[i]=new Teacher(id,nam,s,ad,dn,sb);
    	}
    	for(i=0;i<n;i++)
    	{
    		arr[i].display();
    	}
	}

}
