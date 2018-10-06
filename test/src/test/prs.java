package test;
import java.util.Scanner;
import java.util.LinkedHashMap;
public class prs {
     static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
      LinkedHashMap<Character,Integer> m=new LinkedHashMap<Character,Integer>();
      m.put('P',1);
      m.put('S',2);
      m.put('R',3);
      char a=sc.next().toUpperCase().charAt(0);
      char b=sc.next().toUpperCase().charAt(0);
      if(a==b)
      {
    	  System.out.println("D");
      }
      else
      {
    	  int s=(m.get(a)+m.get(b))%3;
    	  switch(s)
    	  {
    	  case 0:System.out.println("S");
    	         break;
    	  case 1:System.out.println("P");
    	         break;
    	  case 2:System.out.println("R");
    	         break;
    	  }
      }
	}

}
