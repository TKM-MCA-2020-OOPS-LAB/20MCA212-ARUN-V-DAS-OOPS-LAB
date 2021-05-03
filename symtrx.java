package oops;

import java.util.Scanner;
public class symtrx {
	private static Scanner sc;
	public static void main(String[] args) {
		int i, j, row, col, count = 1;
		sc= new Scanner(System.in);
		System.out.println("\n Enter no. of Rows :  ");
		row = sc.nextInt();
		System.out.println("\n Enter no. of Columns :  ");
		col = sc.nextInt();
		int mat[][] = new int[row][col];
		int trans[][] = new int[row][col];
		System.out.println("\n Enter the elements of Matrix :  ");
		for(i = 0; i < row; i++) {
			for(j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}		
		}
		for(i = 0; i < mat.length ; i++)
		{
			for(j = 0; j < mat[0].length; j++)
			{
				trans[j][i] = mat[i][j];
			}
		}
		System.out.println("\nAfter Transposing Matrix Items are :");
		for(i = 0; i < trans.length ; i++)
		{
			for(j = 0; j < trans[0].length; j++)
			{
				System.out.format("%d \t", trans[i][j]);
			}
			System.out.print("\n");
		}
		for(i = 0; i < mat.length ; i++)
		{
			for(j = 0; j < mat[0].length; j++)
			{
				if(mat[i][j] != trans[i][j])
				{
					count++;
					break;
				}
			}
		}
		
		if(count == 1) {
			System.out.println("\nMatrix is a Symmetric Matrix");
		}
		else {
			System.out.println("\nMatrix is Not a Symmetric Matrix");
		}
	}
}