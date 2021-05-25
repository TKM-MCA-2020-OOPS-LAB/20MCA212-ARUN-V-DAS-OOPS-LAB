package javaprjct;

import java.util.Scanner;

class Publisher{
	String pub;
	public Publisher(String p) {
		pub=p;
	}
	Publisher(){}
}
class Book extends Publisher{
	String book,author;
	public Book(String p,String bk,String authr) {
		super(p);
		book=bk;
		author=authr;
	}
	Book(){}
}
 class Literature extends Book{
	public Literature(String p,String bk,String authr) {
		super(p,bk,authr);
	}
	Literature(){}
	void display() {
		System.out.println("\nGenre:Literature");
		System.out.println("Book Name:"+book);
		System.out.println("Publisher:"+pub);
		System.out.println("Author:"+pub);
	}
}
class Fiction extends Book{
	public Fiction(String p,String bk,String authr) {
		super(p,bk,authr);
		
	}
	Fiction(){}
	void display() {
		System.out.println("\nGenre:Fiction");
		System.out.println("Book Name:"+book);
		System.out.println("Publisher:"+pub);
		System.out.println("Author:"+author);
	}
}
public class co3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Literature ltr=new Literature();
		Fiction fict=new Fiction();
		
		System.out.println("**Literature Book**");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Publisher Name:");
		ltr.pub=sc.nextLine();
		System.out.println("Enter the Book Name:");
		ltr.book=sc.nextLine();
		System.out.println("Enter the Author Name:");
		ltr.author=sc.nextLine();
		
		System.out.println("**Fiction Book**");
		System.out.println("Enter the Publisher Name:");
		fict.pub=sc.nextLine();
		System.out.println("Enter the Book Name:");
		fict.book=sc.nextLine();
		System.out.println("Enter the Author Name:");
		fict.author=sc.nextLine();
		
		ltr.display();
		fict.display();
	}

}
