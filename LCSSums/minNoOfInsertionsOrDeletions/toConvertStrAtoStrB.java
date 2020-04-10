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
		    int l1=s.nextInt();
		    int l2=s.nextInt();
		    String N,W;
		    N=s.next();
		    W=s.next();
		  
		    System.out.println(lcs(N,W,N.length(),W.length()));
		}
	}
	public static int lcs(String N,String W,int len1,int len2)
	{
	    int [][] r=new int[len1+1][len2+1];
	    for(int i=0;i<len1+1;i++)
	    {
	        r[i][0]=0;
	    }
	    for(int i=0;i<len2+1;i++)
	    {
	        r[0][i]=0;
	    }
	    for(int i=1;i<len1+1;i++)
	    {
	        for(int j=1;j<len2+1;j++)
	        {
	            if(N.charAt(i-1)==W.charAt(j-1))
	            {
	                r[i][j]=1+r[i-1][j-1];
	            }
	            else
	            {
	                r[i][j]=Math.max(r[i-1][j],r[i][j-1]);
	            }
	        }
	    }
	    return len1+len2-(2*r[len1][len2]);
	}
	
}

//https://practice.geeksforgeeks.org/problems/minimum-number-of-deletions-and-insertions/0
