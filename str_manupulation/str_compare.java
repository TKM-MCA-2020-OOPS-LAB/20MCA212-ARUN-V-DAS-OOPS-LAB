package string;

import java.util.Scanner;

public class str_compare {

	public static void main(String[] args) {
		// compare() method
		String str1,str2;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a string:");
		str1=s1.next();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter another string:");
		str2=s2.next();
		System.out.println("Camparing string 1 to String 2\n"+str1.compareTo(str2));
	
		//string compare by equal() method 
		System.out.println(str1.equals(str2));
	}

}
