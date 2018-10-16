package test;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class sortlist {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
     int n=sc.nextInt();
     ArrayList<String> li=new ArrayList<String>();
     for(int i=0;i<n;i++)
     {
    	 li.add(sc.next());
     }
     Collections.sort(li);
     for(String i:li)
     {
    	 System.out.println(i.toLowerCase());
     }
	}

}
