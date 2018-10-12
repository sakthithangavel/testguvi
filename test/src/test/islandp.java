package test;
import java.util.Scanner;
import java.util.ArrayList;
public class islandp {
   static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int count=0;
		ArrayList<Integer> row=new ArrayList<Integer>();
		ArrayList<Integer> col=new ArrayList<Integer>();
		if(n>=2)
		{
		for(int i=0;i<n;i++)
		{
		   for(int j=0;j<n;j++)
		   {
			   a[i][j]=sc.nextInt();
			   switch(a[i][j])
			   {
			   case 1:row.add(i);
			          col.add(j);
			          break;
			   }
		   }
		}
		for(int i=0,j=0;i<row.size()&&j<col.size();i++,j++)
		{
			count+=value(a,row.get(i),col.get(j));
		}
		System.out.println(count);
		}
		else
		{
			System.out.println("invalid");
		}
	}
	static int value(int a[][],int row,int col)
	{
		int sum=0;
	    if(row==0&&(col>=0&&col<a.length))
	    {
	    	if(col==0)
	    	{
	    		sum+=a[row][col]+a[row][col+1]+a[row+1][col]+a[row+1][col+1];
	    	}
	    	else if(col==a.length-1)
	    	{
	    		sum+=a[row][col]+a[row][col-1]+a[row+1][col]+a[row+1][col-1];
	    	}
	    	else
	    	{
	    		sum+=a[row][col]+a[row][col-1]+a[row][col+1]+a[row+1][col-1]+a[row+1][col]+a[row+1][col+1];
	    	}
	    	if(sum==1)
	    	{
	    		return 1;
	    	}
	    	else
	    	{
	    		return 0;
	    	}
	    }
	    else if(col==0&&(row>0&&row<a.length))
	    {
	    	if(row==a.length-1)
	    	{
	    		sum+=a[row][col]+a[row-1][col]+a[row][col+1]+a[row-1][col+1];
	    	}
	    	else
	    	{
	    		sum+=a[row][col]+a[row-1][col]+a[row-1][col+1]+a[row][col+1]+a[row+1][col]+a[row+1][col+1];
	    	}
	    	if(sum==1)
	    	{
	    		return 1;
	    	}
	    	else
	    	{
	    		return 0;
	    	}
	    }
	    else if(row==a.length-1&&(col>0||col<a.length))
	    {
	    	if(col==a.length-1)
	    	{
	    	  sum+=a[row][col]+a[col-1][row]+a[row-1][col]+a[row-1][col-1];	
	    	}
	    	else
	    	{
	    		sum+=a[row][col]+a[row][col-1]+a[row][col+1]+a[row-1][col-1]+a[row-1][col]+a[row-1][col+1];
	    	}
	    	if(sum==1)
	    	{
	    		return 1;
	    	}
	    	else
	    	{
	    		return 0;
	    	}
	    }
	    else if(col==a.length-1&&(row>0||row<a.length))
	    {
	    	if(row==a.length-1)
	    	{
	    		sum+=a[row][col]+a[row-1][col]+a[row-1][col-1]+a[row][col-1];
	    	}
	    	else
	    	{
	    		sum+=a[row][col]+a[row-1][col]+a[row-1][col-1]+a[row][col-1]+a[row+1][col]+a[row+1][col-1];
	    	}
	    	if(sum==1)
	    	{
	    		return 1;
	    	}
	    	else
	    	{
	    		return 0;
	    	}
	    }
	    else
	    {
	    	sum+=a[row][col]+a[row][col-1]+a[row][col+1]+a[row-1][col-1]+a[row-1][col]+a[row-1][col+1]+a[row+1][col-1]+a[row+1][col]+a[row+1][col+1];
	    	if(sum==1)
	    	{
	    		return 1;
	    	}
	    }
		return 0;
	}

}
