package test;
import java.util.Scanner;
import java.util.ArrayList;
public class frc {
  static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
       int a[]=new int[sc.nextInt()];
       ArrayList<Integer> li=new ArrayList<Integer>();
       for(int i=0;i<a.length;i++)
       {
    	   a[i]=sc.nextInt();
       }
       for(int i:a)
       {
    	   if(li.contains(i))
    	   {
    		   System.out.println(i);
    		   return;
    	   }
    	   else
    	   {
    		   li.add(i);
    	   }
       }
       if(li.size()==a.length)
       {
    	   System.out.println("unique");
       }
	}

}
