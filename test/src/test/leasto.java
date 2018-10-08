package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
public class leasto {
  static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
       int n=sc.nextInt();
       int a[]=new int[n];
       ArrayList<Integer> li=new ArrayList<Integer>();
       LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
       LinkedHashMap<Integer,Integer> lm=new LinkedHashMap<Integer,Integer>();
       int small=0;
       for(int i=0;i<n;i++)
       {
    	   a[i]=sc.nextInt();
    	   li.add(a[i]);
    	   ls.add(a[i]);
       }
       if(ls.size()==n)
       {
    	   for(int i:ls)
    		   System.out.print(i+" ");
       }
       else
       {
    	   for(int i:ls)
    	   {
    		   int count=1;
    		   for(int j:li)
    		   {
    			   if(i==j)
    			   {
    				   lm.put(i, count++);
    			   }
    		   }
    	   }
    	Integer key[]=lm.keySet().toArray(new Integer[0]);
    	Integer value[]=lm.values().toArray(new Integer[0]);
    	for(int i=1;i<key.length;i++)
    	{
    	  if(value[small]>value[i])
    	  {
    		  small=i;
    	  }
    	}
    	System.out.println(key[small]);
       }
	}

}
