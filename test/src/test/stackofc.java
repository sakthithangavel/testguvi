package test;
import java.util.Scanner;

public class stackofc {
   static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
      int n=sc.nextInt();
      int k=sc.nextInt();
      int m=n%k==0?k:(n%k);
      System.out.println(m);
	}

}
