package test;
import java.util.Arrays;
import java.util.Scanner;
public class sortbyrc 
{
    static Scanner sc=new Scanner(System.in);
    static int row;
    static int col;
	public static void main(String[] args) 
	{
		int arr[][]=new int[row=sc.nextInt()][col=sc.nextInt()];
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<col;j++)
        	{
        		arr[i][j]=sc.nextInt();
        	}
        	Arrays.sort(arr[i]);
        }
        arr=arraysort(arr,row,col);
        for(int i[]:arr)
        {
        	for(int j:i)
        	{
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
	}
	public static int[][] arraysort(int arr[][],int row,int col)
	{
		int b[][]=new int[col][row];
		int c[][]=new int[row][col];
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				b[i][j]=arr[j][i];
			}
			Arrays.sort(b[i]);
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
		      c[i][j]=b[j][i];		
			}
		}
		return c;
	}
}
