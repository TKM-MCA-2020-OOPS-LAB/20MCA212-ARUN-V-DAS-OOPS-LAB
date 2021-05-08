package string;

import java.util.Scanner;

public class str_case {

	public static void main(String[] args) {
	
		String str1;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any string:");
		str1=s1.next();
		System.out.println("Upper Case: "+str1.toUpperCase());
		System.out.println("Lower Case: "+str1.toLowerCase());
	}

}
