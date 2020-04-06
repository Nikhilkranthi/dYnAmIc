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
	    if(sum==0)
	    {
	        return true;
	    }
	    if(sum!=0 && length==0)
	    {
	        return false;
	    }
	    if(arr[length-1]>sum)
	    {
	        knapSack(arr,sum,length-1);
	    }
	    return knapSack(arr,sum-arr[length-1],length-1) || knapSack(arr,sum,length-1);
	}
}
