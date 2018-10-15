package test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class kthlargeste {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
      int n=sc.nextInt();
      int k=sc.nextInt();
      ArrayList<Integer> li=new ArrayList<Integer>();
      for(int i=0;i<n;i++)
      {
    	  li.add(sc.nextInt());
      }
      Collections.sort(li,Collections.reverseOrder());
      if(n>=k)
      {
      int kl=li.get(k-1);
      System.out.println(kl);
      }
      else
      {
    	  System.out.println("Invalid Index");
      }
	}

}
