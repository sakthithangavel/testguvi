package test;
import java.util.Scanner;
public class diagonalsum 
{
    static Scanner sc=new Scanner(System.in);
    static int n=sc.nextInt();
	public static void main(String[] args) 
	{
       int arr[][]=new int[n][n];
       int sum=0;
       for(int i=0;i<n;i++)
       {
    	   for(int j=0;j<n;j++)
    	   {
    		   arr[i][j]=sc.nextInt();
    	   }
       }
       for(int i=0,j=0;i<n&&j<n;i++,j++)
       {
    	   sum+=arr[i][j];
       }
       System.out.println(sum);
	}

}
