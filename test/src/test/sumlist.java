package test;
import java.util.Scanner;
public class sumlist 
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
      int n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      int sum[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	  a[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++)
      {
    	  b[i]=sc.nextInt();
    	  sum[i]=a[i]+b[i];
      }
      for(int i:sum)
      {
    	  System.out.print(i+" ");
      }
	}
}
