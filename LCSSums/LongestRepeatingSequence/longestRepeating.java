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
		    int N;
		    String W;
		    N=s.nextInt();
		    W=s.next();
		    
		    System.out.println(lcs(W,W));
		}
	}
	public static int lcs(String s,String s1)
	{
	    int [][] result=new int [s.length()+1][s1.length()+1];
	    for(int i=0;i<s.length()+1;i++)
	    {
	        for(int j=0;j<s1.length()+1;j++)
	        {
	            if(i==0||j==0)
	            {
	                result[i][j]=0;
	            }
	        }
	    }
	    for(int i=1;i<s.length()+1;i++)
	    {
	        for(int j=1;j<s1.length()+1;j++)
	        {
	            if(s.charAt(i-1)==s1.charAt(j-1) && i!=j)
	            {
	                result[i][j]=1+result[i-1][j-1];
	            }
	            else
	            {
	                 result[i][j]=Math.max(result[i][j-1],result[i-1][j]);
	            }
	        }
	    }
	    return result[s.length()][s1.length()];
	}
}

/* https://practice.geeksforgeeks.org/problems/longest-repeating-subsequence/0  */
