package test;
import java.util.Scanner;
import java.util.LinkedHashSet;
public class rrec {
  static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
      String s=sc.next().toLowerCase();
      LinkedHashSet<Character> li =new LinkedHashSet<Character>();
      for(char i:s.toCharArray())
      {
    	  li.add(i);
      }
      for(char i:li)
      {
    	  System.out.print(i);
      }
	}

}
