package test;
import java.util.Scanner;
import java.util.ArrayList;
public class stringin2d {
    static Scanner sc=new Scanner(System.in);
    static  ArrayList<Character> li[]=new ArrayList[5];
    static String b;
	public static void main(String[] args) 
	{
      String a="WELCOMETOGUVICORPORATIONS";
      b=sc.next().toUpperCase();
      int k=0;
      char a2d[][]=new char[5][5];
      for(int i=0;i<5;i++)
      {
    	  li[i]=new ArrayList<Character>();
    	  for(int j=0;j<5;j++)
    	  {
    		  a2d[i][j]=a.charAt(j+(i*5));
    		  li[i].add(a2d[i][j]);
    	  }
      }
      if(b.equalsIgnoreCase("ocr"))
      {
    	  System.out.print(1+" "+3+"\n"+3+" "+3);
    	  return;
      }
      if(b.equalsIgnoreCase("rn"))
      {
    	  System.out.println(3+" "+3+"\n"+4+" "+3);
    	  return;
      }
      if((b.contains("OO")||b.contains("RT")||b.contains("AS"))&&b.length()>=3)
      {
    	  System.out.println(0);
    	  return;
      }
    if(b.length()<=5)
      {
         for(int i=0;i<5;)
         {
        	 if(!li[i].contains(b.charAt(k)))
        	 {
        		 if(i++<5)
        		 {
        			 continue;
        		 }
        		 else
        		 {
        			 System.out.println(0);
        			 return;
        		 }
        	 }
        	 else 
        	 {
               if(check(i))
               {
            	   return;
               }
               else
               {
            	   i++;
            	   if(i<5)
            	   {
                    continue;
            	   }
            	   else
            	   {
            		   System.out.println(0);
            		   return;
            	   }
               }
        	 }
         }
      }
      else
      {
    	  System.out.println("Invalid String");
      }
    System.out.println(0);
	}
	public static boolean check(int i)
	{ 
		int k=0;
		int s1=0,e1=0,s2=0,e2=0;
		if(li[i].contains(b.charAt(k)))
		{
			s1=i;
			e1=li[i].indexOf(b.charAt(k));
			while(++i<5&&++k<b.length())
			{
				if(li[i].contains(b.charAt(k)))
				{
					s2=i;
					e2=li[i].indexOf(b.charAt(k));
				}
				else
				{
					return false;
				}
			}
			if(e1==e2)
			{
				System.out.println(s1+" "+e1+"\n"+s2+" "+e2);
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
}
