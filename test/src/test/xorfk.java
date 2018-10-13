package test;
import java.util.Scanner;
public class xorfk {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
    int a[]=new int [sc.nextInt()];
     int k=sc.nextInt();
     int u[]=new int[k];
     int v[]=new int[k];
     int uvx[]=new int [k];
     for(int i=0;i<a.length;i++)
     {
    	 a[i]=sc.nextInt();
     }
     for(int i=0;i<k;i++)
     {
    	 u[i]=sc.nextInt();
    	 v[i]=sc.nextInt();
    	 if(u[i]<v[i]&&u[i]>0&&v[i]<=a.length)
    	 {
    		 uvx[i]=value(a,u[i],v[i]);
    	 }
    	 else
    	 {
    		 uvx[i]=-1;
    	 }
     }
     for(int i:uvx)
     {
    	 if(i==-1)
    	 {
    		 System.out.println("Invalid");
    	 }
    	 else
    	 {
    		 System.out.println(i);
    	 }
     }
	}
	static int value(int a[],int start,int end)
	{
		start=start-1;
		end=end-1;
		int xor=0;
		for(int i=start;i<=end;i++)
		{
			xor^=a[i];
		}
		return xor;
	}

}
