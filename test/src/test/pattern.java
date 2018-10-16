package test;
import java.util.Scanner;
public class pattern {
     static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
      int n=sc.nextInt();
      if(n>0)
      {
      for(int i=n;i>0;i--)
      {
    	  for(int j=i;j>0;j--)
    	  {
    		  System.out.print(1+" ");
    	  }
    	  System.out.println();
      }
      }
      else
      {
    	  System.out.println("Invalid Input");
      }
	}

}
