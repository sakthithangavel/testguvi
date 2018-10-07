package test;
import java.util.Scanner;
public class isrectangle {
  static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
    int p=sc.nextInt();
    int a=sc.nextInt();
    p=p/2;
    int d=(p*p)-(4*a);
    if(d>=0)
    {
      if((Math.sqrt(d)-Math.floor(d))==0)
      {
    	System.out.println("yes");  
      }
      else
      {
    	  System.out.println("no");
      }
    }
    else
    {
    	System.out.println("no");
    }
	}

}
