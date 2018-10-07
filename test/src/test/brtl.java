package test;
import java.util.Scanner;
public class brtl {
  static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{ 
      int l=sc.nextInt();
      String s=Integer.toBinaryString(l);
      int length=s.length();
      if(l!=0)
      {
      for(int i=length-1;i>=0;i--)
      {
    	  if(s.charAt(i)==0)
    		  continue;
    	  else
    	  {
    		  System.out.println(i+1);
    		  return;
    	  }
      }
      }
      else
      {
    	  System.out.println(0);
      }
	}

}
