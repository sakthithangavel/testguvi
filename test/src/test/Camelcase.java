package test;
import java.util.Scanner;
public class Camelcase {
 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
     String s[]=sc.nextLine().split(" ");
     for(String i:s)
     {
    	 if(Character.isUpperCase(i.charAt(0)))
    	  continue;
    	 else
    	 {
    		 System.out.println("No");
    		 return;
    	 }
     }
     System.out.println("Yes");
	}
}
