package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI496
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int [] nums1=new int[]{4,1,2};
		int [] nums2=new int[]{1,3,4,2};
		int []nums=nextGreaterElement1(nums1, nums2);
		for(int i:nums)
			System.out.print(i);

	}
	 public static  int[] nextGreaterElement(int[] findNums, int[] nums) {
        int [] res=new int[findNums.length];
        for(int i=0;i<findNums.length;i++)
        {
        	boolean flag=false;
        	res[i]=-1;
        	for(int j=0;j<nums.length;j++)
        	{       		
        		if(findNums[i]==nums[j])
        		{
        			flag=true;
        		}
        		if(flag&&nums[j]>findNums[i])
        		{
        			res[i]=nums[j];
        			break;
        		}
        	}
        }
        return res;
    }
	 public static  int[] nextGreaterElement1(int[] findNums, int[] nums) {
		 Stack<Integer>stack=new Stack<>();
		 Map<Integer, Integer>map=new HashMap<>();
		 for(int i=0;i<nums.length;i++)
		 {
			 while(!stack.isEmpty()&&stack.peek()<nums[i])
				 map.put(stack.pop(), nums[i]);
			 stack.push(nums[i]);
		 }
		 System.out.println(map);
		 int [] res=new int[findNums.length];
		 for(int i=0;i<findNums.length;i++)
		 {
			 res[i]=map.getOrDefault(findNums[i], -1);
		 }
		 return res;
	 }
}
