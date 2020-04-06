import java.io.*;

class GFG 
{
    
    
	public static void main (String[] args) 
	{
		int [] arr=new int[]{2,3,7,8,10};
		System.out.println(knapSack(arr,11,arr.length));
		
	}
	
	public static boolean knapSack(int [] arr,int sum,int arrLength)
	{
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
	    for(int i=0;i<arr.length+1;i++)
	    {
	        for(int j=0;j<sum+1;j++)
	        {
	            if(result[i][j]==true)
	            {
	                System.out.print("T"+" ");
	            }
	            else
	            {
	                System.out.print("F"+" ");
	            }
	        }
	        System.out.println("");
	    }
	    return result[arr.length][sum];
	}
}
