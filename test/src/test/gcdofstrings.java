package test;
import java.util.Scanner;
import java.util.LinkedHashSet;
public class gcdofstrings 
{
   static Scanner sc=new Scanner(System.in);
   LinkedHashSet<Character> s=new LinkedHashSet<Character>();
	public static void main(String[] args) 
	{
     String a=sc.next().toLowerCase();
     String b=sc.next().toLowerCase();
     String o1=outputString(a);
     String o2=outputString(b);
     if(o1.equals(o2))
     {
     int count1=count(o1,a);
     int count2=count(o2,b);
     if(count1!=0&&count2!=0)
     {
    	 System.out.println(gcd(count1,count2));
     }
     else
     {
    	 System.out.println(0);
     }
     }
     else
     {
    	 System.out.println("Invalid String");
     }
	}
	static String outputString(String a)
	{
		gcdofstrings ob=new gcdofstrings();
		String o="";
		for(char i:a.toCharArray())
		{
			ob.s.add(i);
		}
		for(char i:ob.s)
		{
			o+=i;
		}
		return o;
	}
	static int count(String o,String a)
	{
		int count=0;
		String n=a;
		while(n.length()>=o.length())
		{
			if(n.contains(o))
			{
			n=n.replaceFirst(o, "");
			count++;
			}
			else
			{
				return 0;
			}
		}
		if(a.length()%count==0)
		{
			return count;
		}
		return 0;
	}
	static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(b,a%b);
		}
	}
}
