package test;
import java.util.Scanner;
public class cofo {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
      int s=sc.nextInt();
      int e=sc.nextInt();
      int k=sc.nextInt();
      int count=0;
      for(int i=s;i<e;i++)
      {
    	if(contains(k,i))
    	{
    		count++;
    	}
      }
      System.out.println(count);
	}
    static boolean contains(int k,int n)
    {
    	String n1=Integer.toString(n);
    	String k1=Integer.toString(k);
    	if(n1.contains(k1))
    	{
    	return true;
    	}
    	return false;
    }
}
