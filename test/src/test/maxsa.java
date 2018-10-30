package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class maxsa 
{
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Integer> li=new ArrayList<Integer>();
	public static void main(String[] args) 
	{
      int a[]=new int[sc.nextInt()];
      for(int i=0;i<a.length;i++)
      {
    	  a[i]=sc.nextInt();
      }
      int l=a.length-1;
      for(int i=l;i>=0;i--)
      {
    	  int sum=0;
    	  for(int j=i;j>=0;j--)
    	  {
    		  sum+=a[j];
    	  }
    	  li.add(sum);
      }
      Collections.sort(li);
      System.out.println(li.get(l));
	}

}
