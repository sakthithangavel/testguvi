package test;
import java.util.Arrays;
import java.util.Scanner;
public class detective {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=sc.nextInt();
		int sum=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
			  if(a[i]==1)
			  {
				  sum+=0;
			  }
			  else
			  {
				  sum+=a[j];
			  }
			}
		}
		System.out.print(sum);
	}

}
