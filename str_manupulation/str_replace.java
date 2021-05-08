package string;

import java.util.Scanner;

public class str_replace {

	public static void main(String[] args) {
		// replace() method
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any string:");
		str=s.next();
		System.out.println("After replacing the string:"+str.replace("a"," v"));
	}

}
