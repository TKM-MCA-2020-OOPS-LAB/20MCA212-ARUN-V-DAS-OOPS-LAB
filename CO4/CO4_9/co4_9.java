package CO_4;

import java.util.Scanner;

class BubbleSort {
	void sort(int arr[],int n) {
		int temp;
		//Iteration 
	for (int i=0;i<n;i++) {
		//compare 
		for (int j=0;j<n-1;j++) {
			if(arr[j]>arr[j+1]) {
				//swap elements
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
		 	}
	   	}
	}
	void display(int arr[],int n) {
				//Displaying
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			}
   }
}
public class co4_9{	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		n=sc.nextInt();
		System.out.println("Enter the Elements:");
		int arr[] = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		BubbleSort  obj= new BubbleSort  ();
		System.out.println("Before sorting:");
		 obj.display(arr,n);
		
		 obj.sort(arr,n);
		 
		System.out.println("\nAfter Sorting:");
		 obj.display(arr,n);
	}
}
