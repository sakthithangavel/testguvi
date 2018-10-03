package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class largest {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
      ArrayList<Integer> li =new ArrayList<Integer>();
      int n=sc.nextInt();
      int sum=0;
      for(int i=0;i<n;i++)
      {
    	  li.add(sc.nextInt());
      }
     Collections.sort(li,Collections.reverseOrder());
     for(int i:li)
     {
    	 sum=sum*10+i;
     }
     System.out.print(sum);
	}

}
