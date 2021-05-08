package string;

import java.util.Scanner;

public class str_concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a string:");
		str1=s1.next();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter another string:");
		str2=s2.next();
		System.out.println("After Concating the string:\n"+str1.concat(str2));
		
	}

}
