package javaprjvt;

import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n,srch,i;
      Scanner size =new Scanner(System.in);
      System.out.println("Enter the size of an array:");
      n=size.nextInt();
      int arr[]= new int[n];
      Scanner num =new Scanner(System.in);
      System.out.println("Enter the Numbers:");
      for(i=0;i<n;i++)
      {
    	  arr[i]=num.nextInt();
      }
      System.out.println("Enter the no. to be search:");
      Scanner s =new Scanner(System.in);
      srch=s.nextInt();
      for(i=0;i<n;i++)
    	  if(srch==arr[i])
    	  {
    		  System.out.println(srch+" is present in the array at index "+ i);
    		  break;
          }
      if(i==n)
      {
    	  System.out.println(srch + " is not present in the array.");
      }
	}

}
