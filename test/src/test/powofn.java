package test;
import java.util.Scanner;
public class powofn {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt(),p=sc.nextInt();
	  System.out.print((int)(Math.pow(n, p)));
	  sc=null;
	}

}
