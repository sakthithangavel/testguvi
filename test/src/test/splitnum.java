package test;
import java.util.Scanner;
public class splitnum {
  static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
       Integer n=Math.abs(sc.nextInt());
       char a[]=n.toString().toCharArray();
       int sum=0;
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=0;j<=i;j++)
    	   {
    		     sum+=Character.getNumericValue(a[j]);
    	   }
       }
       System.out.println(sum);
	}

}
