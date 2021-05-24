package oops;

import java.util.Scanner;

class Person{
	int age;
	String name,gender,address;
	public Person(String nam,String g,int ag,String add) {
		name=nam;
		gender=g;
		address=add;
}
Person(){}	
}
class Employee extends Person{
	int Empid;
	double salary;
	String comp_name,quali;
	public Employee(String nam,String g,int ag,String add,int eid,String cn,String qly,double sal) {
		super(nam,g,ag,add);
		Empid=eid;
		comp_name=cn;
		quali=qly;
		salary=sal;
	}
	Employee(){}
}
class Teacher extends Employee{
	int teacher_id;
	String subject,department;
	public Teacher(String nam,String g,int ag,String add,int eid,String cn,String qly,double sal,String sub,String dpt,int tid) {
		super(nam,g,ag,add,eid,cn,qly,sal);
		subject=sub;
		department=dpt;
		teacher_id=tid;
	}
	Teacher(){}
	void display() {
		System.out.println(" Name:"+name+"\n Gender:"+gender+"\n Address:"+address+"\n Age:"+age);
		System.out.println(" Employee ID:"+Empid+"\n Company Name:"+comp_name+"\n Qualification:"+quali+"\n Salary:"+salary);
		System.out.println(" Subject:"+subject+"\n Department:"+department+"\n Teacher ID:"+teacher_id);

	}
}
public class co3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the No of Data Records:");
    	n=sc.nextInt();
    	Scanner sc1 = new Scanner(System.in);
    	Scanner sc2 = new Scanner(System.in);
    	Teacher arr[]=new Teacher[n];
    	for(i=0;i<n;i++) {
    		arr[i]=new Teacher();
           
    		System.out.println("\nDetail:"+(i+1));
    		
    		System.out.println("Enter the Name:");
        	arr[i].name=sc1.nextLine();
        	
        	System.out.println("Enter the Gender:");
        	arr[i].gender=sc1.nextLine();
        	
        	System.out.println("Enter the Age:");
        	arr[i].age=sc2.nextInt();
        	
        	System.out.println("Enter the Address:");
        	arr[i].address=sc1.nextLine();
        	
        	System.out.println("Enter the Employee_ID:");
        	arr[i].Empid=sc2.nextInt();
        	
        	System.out.println("Enter the Company_Name:");
        	arr[i].comp_name=sc1.nextLine();
        	
        	System.out.println("Enter the Qualification:");
        	arr[i].quali=sc1.nextLine();
        	
        	System.out.println("Enter the Salary:");
        	arr[i].salary=sc2.nextDouble();
        	
        	System.out.println("Enter the Subject:");
        	arr[i].subject=sc1.nextLine();
        	
        	System.out.println("Enter the Department:");
        	arr[i].department=sc1.nextLine();
        	
        	System.out.println("Enter the Teacher_ID:");
        	arr[i].teacher_id=sc2.nextInt();
        	
    	}
    	System.out.println("\n *ALL DETAILS* ");
    	for(i=0;i<n;i++) {
    		System.out.println("\nDetail:"+(i+1));
    		arr[i].display();
    		}
	}

}
