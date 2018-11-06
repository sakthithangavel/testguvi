package test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.IntStream;
public class foc 
{
    static Scanner sc=new Scanner(System.in);    
	public static void main(String[] args) 
	{
		String s=sc.next();
		ArrayList<Character> li=new ArrayList<Character>();
		LinkedHashSet<Character> se=new LinkedHashSet<Character>();
		IntStream.range(0, s.length()).forEach(i -> li.add(s.charAt(i)));
		IntStream.range(0, s.length()).forEach(i -> se.add(s.charAt(i)));
		for(char i:se)
		{
		   int f=Collections.frequency(li, i);
		   if(f==1)
		   {
			   System.out.print(i);
		   }
		}
	}

}
