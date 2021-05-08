package javaprjvt;
import java.util.Arrays;
import java.util.Scanner;

public class sort {
   public static void main(String[] arrgs)
   {
	   int n,i;
	   Scanner size = new Scanner(System.in);
	   System.out.println("Enter the No. of strings:");
	   n = size.nextInt();
	   String arr[]=new String[n];
	   Scanner str = new Scanner(System.in);
	   System.out.println("Enter the strings:");
	   for(i=0;i<n;i++)
		{
		arr[i]= str.nextLine() ;
		}
	   Arrays.sort(arr);
	   System.out.println("Sorted strings:");
	   for (i =0;i<n;i++)
	    {
		   System.out.println(arr[i]);
	    }
	 
   }
}