package javaprjct;

import java.util.Scanner;

class Student{
	String name;
	int roll_no,maths,eng,sci,hin;
	public Student(){
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the Student Name:");
		name=sc.nextLine();
		System.out.println("Enter the Student Roll_no:");
		roll_no=sc2.nextInt();
	}
	
}
class Sports extends Student {
	int game1,game2;
	public Sports() {
		Scanner sc2=new Scanner(System.in);
		System.out.println("Sports Scrore:");
		System.out.println("Enter the Score in Game 1:");
		game1=sc2.nextInt();
		System.out.println("Enter the Score in Game 2:");
		game2=sc2.nextInt();
	}

}
class Result extends Sports{
	
	public Result() {
		Scanner sc2=new Scanner(System.in);
		System.out.println("\nAcademic Details:");
		System.out.println("Enter the marks obtained in Maths:");
		maths=sc2.nextInt();
		System.out.println("Enter the marks obtained in English:");
		eng=sc2.nextInt();
		System.out.println("Enter the marks obtained in Science:");
		sci=sc2.nextInt();
		System.out.println("Enter the marks obtained in Hindi:");
		hin=sc2.nextInt();
	}
	
	void display() {
		System.out.println("\nAcademic Deatils Of Student:");
		System.out.println("NAME: "+name+"\nROLL_NO: "+roll_no);
		
		System.out.println("\nSUBJECTS MARKS");
		System.out.println("Maths\t "+maths+"\nEnglish\t "+eng+"\nScience\t "+sci+"\nHindi\t "+hin);

		System.out.println("\nSports Deatils Of Student:");
		System.out.println("TotaL Score: "+(game1+game2));

	}
}
public class co3_5 {
	public static void main(String[] args) {
		Result obj=new Result();
		obj.display();
	}
}
