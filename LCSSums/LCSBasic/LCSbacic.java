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
		    int [][] result=new int [N+1][W+1];
		    for(int j=0;j<N+1;j++)
		    {
		        for(int k=0;k<W+1;k++)
		        {
		            result[j][k]=-1;
		        }
		    }
		    System.out.println(lcs(s1,s2,N,W,result));
		}
	}
	public static int lcs(String s1,String s2,int l1,int l2,int [][] result)
	{
	    if(result[l1][l2]!=-1)
	    {
	        return result[l1][l2];
	    }
	    if(l1==0 || l2==0)
	    {
	        return 0;
	    }
	    if(s1.charAt(l1-1)==s2.charAt(l2-1))
	    {
	        return result[l1][l2]=1+lcs(s1,s2,l1-1,l2-1,result);
	    }
	    else
	    {
	        return result[l1][l2]=Math.max(lcs(s1,s2,l1-1,l2,result),lcs(s1,s2,l1,l2-1,result));
	    }
	}
}
