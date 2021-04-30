package mtrx_add;
		// TODO Auto-generated method stub
		import java.util.Scanner;
		public class matrix {
		public static void main(String[] args) {
		int m,n,i,j;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		m = in.nextInt();
		System.out.println("Enter the number columns");
		n = in.nextInt();
		int mat1[][] = new int[m][n];
		int mat2[][] = new int[m][n];
		int result[][] = new int[m][n];
		System.out.println("Enter the elements of matrix1");
		for ( i= 0 ; i < m ; i++ )
		{
		for ( j= 0 ; j < n ;j++ )
		mat1[i][j] = in.nextInt();
		System.out.println();
		}
		System.out.println("Enter the elements of matrix2");
		for ( i= 0 ; i < m ; i++ )
		{
		for ( j= 0 ; j < n ;j++ )
		mat2[i][j] = in.nextInt();
		System.out.println();

		}
		for ( i= 0 ; i < m ; i++ )
		for ( j= 0 ; j < n ;j++ )
		result[i][j] = mat1[i][j] + mat2[i][j] ;
		System.out.println("Sum of matrices:-");
		for ( i= 0 ; i < m ; i++ )
		{
		for ( j= 0 ; j < n ;j++ )
		System.out.print(result[i][j]+"\t");
		System.out.println();
		}
		}
		}
