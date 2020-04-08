import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args) 
	{
		//code
		int t;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int N;
		    N=s.nextInt();
		    int [] coin=new int [N];
		   
		    for(int j=0;j<N;j++)
		    {
		        coin[j]=s.nextInt();
		    }
		    int target=s.nextInt();
		    System.out.println(knapSack(coin,target,N));
		} 
		    
	}
	public static int knapSack(int [] coin,int target,int N)
	{
	    int [][] result=new int [N+1][target+1];
	    for(int i=0;i<N+1;i++)
	    {
	        result[i][0]=1;
	    }
	    for(int i=0;i<target+1;i++)
	    {
	        result[0][i]=0;
	    }
	    for(int i=1;i<N+1;i++)
	    {
	        for(int j=1;j<target+1;j++)
	        {
	            if(coin[i-1]>j)
	            {
	                result[i][j]=result[i-1][j];
	            }
	            else
	            {
	                result[i][j]=result[i][j-coin[i-1]]+result[i-1][j];
	            }
	        }
	    }
	    return result[N][target];
	}
}


	
//https://practice.geeksforgeeks.org/problems/coin-change/0
