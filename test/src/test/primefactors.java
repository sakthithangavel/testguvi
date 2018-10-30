package test;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class primefactors {
    static Scanner sc=new Scanner(System.in);
    static LinkedHashSet<Integer> li=new LinkedHashSet<Integer>();
	public static void main(String[] args) 
	{  
		int n=sc.nextInt();
		if(n!=0&&n>2)
		{
		primeFactors(n);
		for(int i:li)
		{
			System.out.print(i+" ");
		}
		}
		else
		{
			if(n<0)
			{
			System.out.print("number is lessthan 0");
			}
			else
			{
				System.out.print("number is zero");
			}
		}
		
	}
	public static void primeFactors(int n) 
    {  
        while (n%2==0) 
        { 
            li.add(2); 
            n /= 2; 
        } 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        {  
            while (n%i == 0) 
            { 
                li.add(i); 
                n /= i; 
            } 
        } 
        if (n > 2) 
            li.add(n); 
    } 

}
