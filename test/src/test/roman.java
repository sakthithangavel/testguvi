package test;
import java.util.Scanner;
import java.util.LinkedHashMap;
public class roman {
  static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
	 char s[]=sc.next().toUpperCase().toCharArray();
	 LinkedHashMap<Character,Integer> m=new LinkedHashMap<Character,Integer>();
	 m.put('I',1);
	 m.put('V',5);
	 m.put('X',10);
	 m.put('L',50);
	 m.put('C',100);
	 m.put('D',500);
	 m.put('M',1000);
	 int sum=0;
	 if(s.length==1)
	 {
		 sum+=m.get(s[0]);
	 }
	 else
	 {
     if(s.length%2==0)
     {
	  for(int i=0;i<s.length;i+=2)
	   {
		 
		 if(i+1<s.length&&m.get(s[i])<m.get(s[i+1]))
		 {
			 sum+=m.get(s[i+1])-m.get(s[i]);
		 }
		 else if(i+1<s.length&&m.get(s[i])>=m.get(s[i+1]))
		 {
			 sum+=m.get(s[i+1])+m.get(s[i]); 
		 }
	    }
	 
	 }
     else
     {
    	 for(int i=0;i<s.length;i+=2)
  	     {
  		 
  		 if(i+1<s.length&&m.get(s[i])<m.get(s[i+1]))
  		 {
  			 sum+=m.get(s[i+1])-m.get(s[i]);
  		 }
  		 else if(i+1<s.length&&m.get(s[i])>=m.get(s[i+1]))
  		 {
  			 sum+=m.get(s[i+1])+m.get(s[i]); 
  		 }
  	     }
    	 if(m.get(s[s.length-2])>=m.get(s[s.length-1]))
    	 {
    		 sum+=m.get(s[s.length-1]);
    	 }
    	 else
    	 {
    		 sum+=m.get(s[s.length-1])-m.get(s[s.length-2])-1;
    	 }
     }
	 System.out.print(sum);
	}
	}
}
