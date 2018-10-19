package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class minimumdistance {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
	int n=sc.nextInt();
    int u1=0,v1=0;
	int a[]=new int [n];
	ArrayList<Integer> liv=new ArrayList<Integer>();
	ArrayList<Integer> liu=new ArrayList<Integer>();
    for(int i=0;i<n;i++)
    {
    	a[i]=sc.nextInt();		
    }
    int u=sc.nextInt();
    int v=sc.nextInt();
    for(int i=0;i<n;i++)
    {
       if(a[i]==u||a[i]==v)
       {
    	   if(a[i]==u)
    	   {
    		   u1=i;
    		   liu.add(i);
    	   }
    	   else
    	   {
    		  v1=i;
    		  liv.add(i);
    	   }
       }
    }
    if(u==v)
    {
    	System.out.println(0);
    }
    else
    {
    Collections.sort(liu);
    Collections.sort(liv,Collections.reverseOrder());
    int d1=Math.abs(u1-v1);
    int d2=Math.abs(liu.get(liu.size()-1)-liv.get(liv.size()-1));
    int d=d1<d2?d1:d2;
    System.out.println(d);
    }
	}

}
