import java.io.*;

class GFG 
{
    static int c=0;
    public static void main (String[] args) 
	{
	   c=0;
	   int [] nums=new int[]{1,1,1,1,1};
	   int S=3;
       knapSack(nums,S,nums.length);
       System.out.println(c);
	}
	public static void knapSack(int [] nums,int S,int length)
    {
        
        if(S==0 && length==0)
        {
            c++;
            return;
        }
        if(length==0 && S!=0)
        {
            return;
        }
        knapSack(nums,S-nums[length-1],length-1);
        knapSack(nums,S+nums[length-1],length-1);
    }
}
