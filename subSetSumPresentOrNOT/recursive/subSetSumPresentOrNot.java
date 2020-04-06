
import java.io.*;

class GFG 
{
	public static void main (String[] args) 
	{
		int [] arr=new int[]{2,8,10,11};
		int sum=9;
		System.out.println(knapSack(arr,sum,arr.length));
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
	    if(arr[arr.length-1]>sum)
	    {
	        knapSack(arr,sum,length-1);
	    }
	    return knapSack(arr,sum-arr[arr.length-1],length-1) || knapSack(arr,sum,length-1);
	}
}
