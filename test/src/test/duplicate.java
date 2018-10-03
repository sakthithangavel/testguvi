package test;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.LinkedHashMap;
public class duplicate {
   static Scanner sc;
	public static void main(String[] args) 
	{
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		LinkedHashSet<Integer> se=new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> se2=new LinkedHashSet<Integer>();
		LinkedHashMap<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			se.add(arr[i]);
		}
		for(Integer i:se)
		{
			int count=1;
			m.put(i, count);
			for(int j:arr)
			{
				if(i==j)
				{
				   m.put(i, count++);	
				}
			}
		}
		if(se.size()==1)
		{
			System.out.print("unique");
		}
		else
		{
		for(Map.Entry<Integer,Integer> e:m.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.print(e.getKey()+" ");
			}
			else
			{
				se2.add(e.getValue());
			}
		}
		}
		if(se2.size()==1)
		{
			System.out.print("unique");
		}
	}

}
