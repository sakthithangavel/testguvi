package test;
import java.util.Scanner;
public class mcountcharacters {
   static Scanner sc=new Scanner(System.in);
   static String c="";
   static char b[];
   static int pos=0;
	public static void main(String[] args) 
	{
       b=sc.next().toCharArray();
       for(int i=pos;i<b.length;)
       {
    	   if(i==0)
    	   {
    		   c+=b[i];
    		   i++;
    	   }
    	   else 
    	   {
    		   if(b[i-1]==b[i])
    		   {
    			   c+=b[i];
    			   i++;
    		   }
    		   else
    		   {
    			   c+=" ";
    			   if(i+1<b.length&&b[i+1]==b[i])
    			   {
    				   c+=b[i];
    			   }
    			   else
    			   {
    				   c+=b[i];
    			   }
    			   i++;
    		   }		  
    	   }
       }
       String count[]=c.split(" ");
       int max=0;
       for(int i=1;i<count.length;i++)
       {
    	  if(count[max].length()<count[i].length())
    	  {
    		  max=i;
    	  }
       }
       System.out.println(count[max].charAt(0)+" "+count[max].length());
	}	
}
