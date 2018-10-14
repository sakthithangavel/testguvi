package test;
import java.util.Scanner;
import java.util.LinkedList;
public class repeating {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
     int a[][]=new int[sc.nextInt()][sc.nextInt()];
     LinkedList<Integer> li2[]=new LinkedList[a.length];
     for(int i=0;i<a.length;i++)
     {
    	 for(int j=0;j<a[i].length;j++)
    	 {
    		 a[i][j]=sc.nextInt();
    	 }
     }
     li2[0]=new LinkedList<Integer>();
     for(int i:a[0])
     {
    	 li2[0].add(i);
     }
     for(int i=1;i<a.length;i++)
     {
    	 li2[i]=new LinkedList<Integer>();
    	 for(int j:a[i])
    	 {
    		 if(li2[0].contains(j))
    		 {
    			 li2[i].add(j);
    		 }
    	 }
     }
     int small=0;
    for(int i=1;i<li2.length;i++)
    {
    	if(li2[small].size()>li2[i].size())
    	{
    		small=i;
    	}
    }
    if(li2[small].size()>0)
    {
    for(int i:li2[small])
    {
    	System.out.print(i+" ");
    }
    }
    else
    {
    	System.out.print("No Common Element");
    }
	}
    
}
