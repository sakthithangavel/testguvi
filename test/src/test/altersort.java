package test;
import java.util.Arrays;
import java.util.Scanner;
public class altersort {
  static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    if(a.length%2==1)
    {
    for(int i=0,j=n-1;i<j&&j>i;i++,j--)
    {
    	System.out.print(a[j]+" "+a[i]+" ");
    }
    System.out.println(a[a.length/2]);
    }
    else
    {
    	 for(int i=0,j=n-1;i<j&&j>i;i++,j--)
    	    {
    	    	System.out.print(a[j]+" "+a[i]+" ");
    	    }	
    }
	}
	

}
