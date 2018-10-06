package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class lsid {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
      int n=sc.nextInt();
      int a[]=new int[n];
      ArrayList<Integer> li=new ArrayList<Integer>();
      for(int i=0;i<n;i++)
      {
    	  a[i]=sc.nextInt();
    	  li.add(a[i]);
      }
      Arrays.sort(a);
      int diff2=a[n-1]-a[0];
      if(diff2==0)
      {
    	  System.out.println(0);
      }
      else
      {
      int diff=li.indexOf(a[n-1])-li.indexOf(a[0]);
      System.out.println(diff);
      }
	}

}
