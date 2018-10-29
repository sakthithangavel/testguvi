package test;
import java.util.Scanner;
public class primegenerator 
{
   static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
      int n=sc.nextInt();
      for(int i=2;i<n;i++)
      {
    	  if(isPrime(i))
    	  {
    		  System.out.print(i+" ");
    	  }
      }
	}
    public static boolean isPrime(int n)
    {
    	if(n<=1)
    		return false;
    	else
    	{
    		for(int i=2;i<n;i++)
    		{
    			if(n%i==0)
    				return false;
    		}
    	}
    	return true;
    }
}
