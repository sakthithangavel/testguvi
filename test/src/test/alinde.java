package test;
import java.util.Scanner;
public class alinde 
{
    static Scanner sc=new Scanner(System.in);
    static int size;
	public static void main(String[] args) 
	{
	  int j=0,k=0;
      int arr[]=new int[size=sc.nextInt()];
      boolean flag=false;
      for(int i=0;i<size;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      if(size==1)
      {
    	  System.out.println("no");
    	  return;
      }
      if(size==2)
      {
    	  if(arr[size-1]>arr[size-2])
    	  {
    		  System.out.println("yes");
    		  return;
    	  }
    	  else
    	  {
    		  System.out.println("no");
    		  return;
    	  }
      }
      if(size%2==1)
      {
      for(int i=0;i<size-1;i+=2)
      {
    	  j=i+1;
    	  k=i+2;
    	  if(j<size&&k<size&&arr[i]<arr[j]&&arr[j]>arr[k])
    	  {
    		  flag=true;
    	  }
    	  else
    	  {
    		 flag=false;
    		 System.out.println("no");
    		 return;
    	  }
      }
      }
      else
      {
    	  for(int i=0;i<size-1;i+=2)
    	  {
    		  j=i+1;
    		  k=i+2;
              if(j<size&&k<size&&arr[i]<arr[j]&&arr[j]>arr[k])
              {
            	  flag=true;
              }
              else
              {
            	  flag=false;
            	  System.out.println("no");
            	  return;
              }
    	  }
    	  if(arr[size-2]<arr[size-1])
    	  {
    		  flag=true;
    	  }
      }
      if(flag==true)
    	  System.out.println("yes");
	}
	

}
