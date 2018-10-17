package test;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class lru {
    static Scanner sc=new Scanner(System.in);
    static int count=0;
	public static void main(String[] args) 
	{
      int n=sc.nextInt();
      int k=sc.nextInt();
      int st[]=new int[n];
      Queue<Integer> li=new LinkedList<Integer>();
      for(int i=0;i<n;i++)
      {
    	st[i]=sc.nextInt();  
      }
      for(int i=0;i<st.length;i++)
      {
    	  if(li.contains(st[i])&&li.size()<k)
    	  {
    		  continue;
    	  }
    	  else if(!li.contains(st[i])&&li.size()<k)
    	  {
    		  li.add(st[i]);
    	  }
    	  else if(!li.contains(st[i])&&li.size()>=k)
    	  {
    		    li.remove();
    		    li.add(st[i]);
    	  }
      }
      for(int i:li)
      {
    	  System.out.print(i+" ");
      }
	}

}
