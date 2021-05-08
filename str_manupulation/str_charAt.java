package string;

import java.util.Scanner;

public class str_charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any string:");
		str=s.next();
	    char str1=str.charAt(3);
		System.out.println("Character at Index 3 from the given string is: "+str1);	
	}

}
