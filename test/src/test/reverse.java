package test;
import java.util.Scanner;
public class reverse {
   static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String s=new StringBuilder(sc.next()).reverse().toString();
        System.out.println(s);
	}

}
