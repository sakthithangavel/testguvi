package test;
import java.util.Scanner;
import java.util.ArrayList;
public class spliter {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
     String a=sc.next();
     String b[]=a.split("\\d+");
     String c[]=a.split("[a-zA-Z]");
     ArrayList<String> s=new ArrayList<String>();
     ArrayList<Integer> d=new ArrayList<Integer>();
     String o="";
     for(String i:b)
     {
    	 if(!i.equals(""))
    	 {
        	s.add(i);
    	 }
     }
     for(String i:c)
     {
    	 if(!i.equals(""))
    	 {
    	 d.add(Integer.parseInt(i));
    	 }
     }
     for(int i=0;i<s.size();i++)
     {
    	int val=d.get(i);
    	while(val>0)
    	{
    		o+=s.get(i);
    		val--;
    	}
     }
     System.out.println(o);
	}
}
