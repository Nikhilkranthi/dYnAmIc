import java.io.*;

class GFG 
{
	public static void main (String[] args) 
	{
		int [] arr=new int[]{1,5,11,5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		    sum=sum+arr[i];
		}
		if((sum&1)!=0)
		{
		    System.out.println("False");
		    return;
		}
		else
		{
		    System.out.println(knapSack(arr,sum/2,arr.length));
		}
	
	}
	public static boolean knapSack(int [] arr,int sum,int length)
	{
	    boolean [][] result=new boolean[arr.length+1][sum+1];
	    
	    for(int i=0;i<sum+1;i++)
	    {
	        result[0][i]=false;
	    }
	    
	    for(int i=0;i<length+1;i++)
	    {
	        result[i][0]=true;
	    }
	    
	    for(int i=1;i<length+1;i++)
	    {
	        for(int j=1;j<sum+1;j++)
	        {
	            if(arr[i-1]>j)
	            {
	                result[i][j]= result[i-1][j];
	            }
	            else
	            {
	                result[i][j]= (result[i-1][j-arr[i-1]])||(result[i-1][j]);
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
