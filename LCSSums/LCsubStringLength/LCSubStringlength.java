import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) 
	{
		int t;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int N,W;
		    N=s.nextInt();
		    W=s.nextInt();
		    String s1;
		    String s2;
		    s1=s.next();
		    s2=s.next();
		    
		    System.out.println(lcs(s1,s2,N,W));
		}
	}
	public static int lcs(String s1,String s2,int l1,int l2)
	{
	    int [][] result=new int [l1+1][l2+1];
	    for(int i=0;i<l1+1;i++)
	    {
	        for(int j=0;j<l2+1;j++)
	        {
	            if(i==0 || j==0)
	            {
	                result[i][j]=0;
	            }
	        }
	    }
	    for(int i=1;i<l1+1;i++)
	    {
	        for(int j=1;j<l2+1;j++)
	        {
	            if(s1.charAt(i-1)==s2.charAt(j-1))
	            {
	                result[i][j]=1+result[i-1][j-1];
	            }
	            else
	            {
	                result[i][j]=0;
	            }
	        }
	    }
	   // for(int i=0;i<l1+1;i++)
	   // {
	   //     for(int j=0;j<l2+1;j++)
	   //     {
	   //         System.out.print(result[i][j]+" ");
	   //     }
	   //     System.out.println("");
	   // }
	    int max=-1;
	    for(int i=0;i<l1+1;i++)
	    {
	        for(int j=0;j<l2+1;j++)
	        {
	        if(result[i][j]>max)
	        {
	            max=result[i][j];
	        }
	        }
	    }
	    return max;
	}
}




//https://practice.geeksforgeeks.org/problems/longest-common-substring/0
