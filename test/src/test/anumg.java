package test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;
public class anumg 
{
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Character> li=new ArrayList<Character>();
    static String o="";
	public static void main(String[] args) 
	{
      long n=sc.nextLong();
      if(n>0)
      {
      String n1=Long.toString(n);
      IntStream.range(0, n1.length()).forEach(i -> li.add(n1.charAt(i)));
      Collections.sort(li,Collections.reverseOrder());
      IntStream.range(0, li.size()).forEach(i -> o+=li.get(i));
      long m=n+1;
      long rn=Long.parseLong(o);
      if(rn>n)
      {
    	  for(long i=m;i<=rn;i++)
    	  {
    		  if(containsvalue(i))
    		  {
    			  System.out.println(i);
    			  return;
    		  }
    	  }
      }
      else
      {
    	  System.out.println("Impossible");
      }
      }
      else
      {
    	  System.out.println("Not possible");
      }
	}
	public static boolean containsvalue(long n)
	{
		String n1=Long.toString(n);
		ArrayList<Character> l=new ArrayList<Character>();
		IntStream.range(0, n1.length()).forEach(i -> l.add(n1.charAt(i)));
		Collections.sort(l,Collections.reverseOrder());
		if(l.containsAll(li)&&l.equals(li))
		{
			return true;
		}
		return false;
	}

}
