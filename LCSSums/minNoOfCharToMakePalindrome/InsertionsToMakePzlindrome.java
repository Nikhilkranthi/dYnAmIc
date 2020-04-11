import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args) 
	{
		int t;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		   String s1=s.next();
		   StringBuffer ss=new StringBuffer(s1);
		   ss.reverse();
		   String s2=ss.toString();
		    System.out.println(lps(s1,s2));
		}
	}
	public static int lps(String s1,String s2)
	{
	    int [][] res=new int [s1.length()+1][s2.length()+1];
	    for(int i=0;i<=s1.length();i++)
	    {
	        for(int j=0;j<=s2.length();j++)
	        {
	            if(i==0 || j==0 )
	            {
	                res[i][j]=0;
	            }
	        }
	    }
	    for(int i=1;i<=s1.length();i++)
	    {
	        for(int j=1;j<=s2.length();j++)
	        {
	            if(s1.charAt(i-1)==s2.charAt(j-1))
	            {
	                res[i][j]=1+res[i-1][j-1];
	            }
	            else
	            {
	                res[i][j]=Math.max(res[i-1][j],res[i][j-1]);
	            }
	        }
	    }
	    return s1.length()-res[s1.length()][s1.length()];
	}
}

/* anasdad  ada
   dadsana      
   https://practice.geeksforgeeks.org/problems/form-a-palindrome/0     */
