package test;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
public class duplireverse {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
       String a=sc.next();
       String o="";
       LinkedHashSet<Character> li=new LinkedHashSet<Character>();
       LinkedList<Character> l=new LinkedList<Character>();
       for(char i:a.toCharArray())
       {
    	   li.add(i);
       }
       l.addAll(li);
       li.clear();
       Collections.reverse(l);
       for(char i:l)
       {
    	   o+=i;
       }
       System.out.println(o);
	}

}
