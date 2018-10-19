package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class rightlargest {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
     int n=sc.nextInt();
     int a[]=new int[n];
     ArrayList<Integer> oli=new ArrayList<Integer>();
     ArrayList<Integer> mli=new ArrayList<Integer>();
     int val=0;
     for(int i=0;i<n;i++)
     {
    	 a[i]=sc.nextInt();
     }
     for(int i=1;i<n;i++)
     {
        oli.add(a[i]);
     }
     oli.add(0);
     Collections.sort(oli,Collections.reverseOrder());
     Integer c[]=new Integer[oli.size()];
     c=oli.toArray(c);
     mli.add(c[val]);
     for(int i=1;i<a.length;i++)
     {
    	if(c[val]<=a[i])
    	{
    	 mli.add(c[i]);
    	 val=i;
    	}
    	else
    	{
    		mli.add(c[val]);
    	}
     }
     for(int i:mli)
     {
    	 System.out.print(i+" ");
     }
	}
}
