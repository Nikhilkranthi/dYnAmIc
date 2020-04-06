import java.io.*;
import java.util.*;
class GFG 
{
    //static min=100000;
    public static void main (String[] args) 
	{
		int noOfTime;
		Scanner s=new Scanner(System.in);
		noOfTime=s.nextInt();
		int f=0;
		while(f<noOfTime)
		{
		    int arrLen;
		    arrLen=s.nextInt();
		    int [] arr=new int[arrLen];
		    int f1=0;
		    while(f1<arrLen)
		    {
		        int p=s.nextInt();
		        arr[f1]=p;
		        f1++;
		    }
		    int sum=0;
		    for(int i=0;i<arr.length;i++)
		    {
		        sum+=arr[i];
		    }
		    System.out.println(knapSack(arr,sum,arr.length));
		    f++;
		}
		
	}
	
	public static int knapSack(int [] arr,int sum,int arrLength)
	{
	    int min=100000;
	    boolean [][] result=new boolean[arr.length+1][sum+1];
	    for(int i=0;i<arr.length+1;i++)
	    {
	        for(int j=0;j<sum+1;j++)
	        {
	            if(i==0)
	            {
	                result[i][j]=false;
	            }
	            if(j==0)
	            {
	                result[i][j]=true;
	            }
	        }
	    }
	    for(int i=1;i<arr.length+1;i++)
	    {
	        for(int j=1;j<sum+1;j++)
	        {
	            if(arr[i-1]<=j)
	            {
	                result[i][j]=result[i-1][j-arr[i-1]] || result[i-1][j];
	            }
	            else
	            {
	                result[i][j]=result[i-1][j];
	            }
	        }
	    }
	   // for(int i=0;i<arr.length+1;i++)
	   // {
	   //     for(int j=0;j<sum+1;j++)
	   //     {
	   //         if(result[i][j]==true)
	   //         {
	   //             System.out.print("T"+" ");
	   //         }
	   //         else
	   //         {
	   //             System.out.print("F"+" ");
	   //         }
	   //     }
	   //     System.out.println("");
	   // }
	    for(int i=0;i<sum+1;i++)
	    {
	       int t;
	       if(result[arr.length-1][i]==true)
	       {
	           t=sum-(2*i);
	           if(t<0)
	           {
	               t=-t;
	           }
	           if(t<min)
	           {
	               min=t;
	           }
	       }
	    }
	    return min;
	  //  return result[arr.length][sum];
	}
}
