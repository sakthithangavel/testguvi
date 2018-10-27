import java.util.Scanner;
public class palindromeofnumber {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]) 
    {
     Integer n=sc.nextInt();
     String a=n.toString();
     String b=new StringBuilder(a).reverse().toString();
     if(a.equals(b))
     {
         System.out.println("yes");
     }
     else
     {
         System.out.println("no");
     }
    }
}
