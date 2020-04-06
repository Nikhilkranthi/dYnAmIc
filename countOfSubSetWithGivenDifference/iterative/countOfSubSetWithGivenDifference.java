import java.io.*;

class GFG 
{
    //static min=100000;
    public static void main (String[] args) 
	{
		int [] arr=new int[]{1,1,2,3};
		int sum=0;
		int target=1;
		for(int i=0;i<arr.length;i++)
		{
		    sum=sum+arr[i];
		}
	
		int target1=(target+sum)/2;
		//	System.out.println(target1);
		System.out.println(knapSack(arr,target1,arr.length));
		
	}
	
	public static int knapSack(int [] arr,int target1,int arrLength)
	{
	    int min=100000;
	    int c=0;
	    int [][] result=new int[arr.length+1][target1+1];
	    for(int i=0;i<arr.length+1;i++)
	    {
	        for(int j=0;j<target1+1;j++)
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
	        for(int j=1;j<target1+1;j++)
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
	   //             System.out.print(result[i][j]+" ");
	           
	   //     }
	   //     System.out.println("");
	   // }
	   
	       //for(int i=0;i<arr.length+1;i++)
	       //{
	       //    c=c+result[i][target1];
	           
	       //}
	    
	  
	   return result[arr.length][target1];
	 
	}
}
