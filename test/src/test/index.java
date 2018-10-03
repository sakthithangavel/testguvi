package test;
import java.util.Scanner;
import java.util.ArrayList;
public class index {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=sc.nextInt();
		int a[]=new int[n];
		ArrayList<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
     for(int i=0;i<n;i++)
     {
    	 if(a[i]==i)
    	 {
    		 li.add(a[i]);
    	 }
     }
     if(li.size()>0)
     {
    	 for(int i:li)
    	 {
    		 System.out.print(i+" ");
    	 }
     }
     else
     {
    	 System.out.print(-1);
     }
	}

}
