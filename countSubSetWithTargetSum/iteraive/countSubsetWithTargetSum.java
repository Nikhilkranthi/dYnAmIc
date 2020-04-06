import java.io.*;

class GFG 
{
    
    
	public static void main (String[] args) 
	{
		int [] arr=new int[]{2,3,7,8,10};
		System.out.println(knapSack(arr,10,arr.length));
		
	}
	
	public static int knapSack(int [] arr,int sum,int arrLength)
	{
	    int [][] result=new int[arr.length+1][sum+1];
	    for(int i=0;i<arr.length+1;i++)
	    {
	        for(int j=0;j<sum+1;j++)
	        {
	            if(i==0)
	            {
	                result[i][j]=0;
	            }
	            if(j==0)
	            {
	                result[i][j]=1;
	            }
	        }
	    }
	    for(int i=1;i<arr.length+1;i++)
	    {
	        for(int j=1;j<sum+1;j++)
	        {
	            if(arr[i-1]<=j)
	            {
	                result[i][j]=result[i-1][j-arr[i-1]] + result[i-1][j];
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
	    return result[arr.length][sum];
	}
}
