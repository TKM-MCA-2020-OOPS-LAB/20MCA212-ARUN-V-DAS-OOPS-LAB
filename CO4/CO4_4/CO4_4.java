package CO_4;

import java.util.Scanner;

class NegativeException extends Exception{
	public NegativeException(String a) {
		super(a);
    }
}
public class CO4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many numbers do you want:");
		n=sc.nextInt();
		System.out.println("Enter the Numbers:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{ while(true)
			try {
				arr[i]=sc.nextInt();
				if (arr[i]<0)
				throw new NegativeException(arr[i]+" is negative Number!\nPlease Enter the Positive Number");
				break;
			   	}
			catch (NegativeException a) {
				System.out.println("Exception occured.."+a);
				}
		}
		for(int i=0;i<n;i++)
		{
			c=c+arr[i];	
		}
		
		System.out.println("Average Of "+n+" Positive Number:"+c/n);
	}
}
