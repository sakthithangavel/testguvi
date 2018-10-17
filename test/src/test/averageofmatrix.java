package test;
import java.util.Scanner;
import java.util.ArrayList;
public class averageofmatrix {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=sc.nextInt();
		float average=0.000000f;
		int m[][]=new int[n][n];
		ArrayList<Double> li=new ArrayList<Double>();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				m[i][j]=sc.nextInt();
			}
		}
		for(int i[]:m)
		{
			double sum=0.0;
			for(int j:i)
			{
				sum+=j;
			}
			li.add(sum/n);
		}
		for(double i:li)
		{
			average+=i;
		}
		average=average/n;
		System.out.printf("%.6f",average);
	}

}
