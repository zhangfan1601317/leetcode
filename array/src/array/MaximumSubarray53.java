package array;

import java.util.Arrays;

public class MaximumSubarray53 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums=new int []{-2,1};
		if(nums.length==0)
			System.out.println(0);
		int maxSubArray=nums[0];//全局变量
		int thisNumber=nums[0];//局部变量
		for(int i=1;i<nums.length;i++)
		{				
			thisNumber+=nums[i];
			if(thisNumber<nums[i])//先求局部最优
				thisNumber=nums[i];			
			if(thisNumber>maxSubArray)//再求全局最优 顺序不能颠倒啊
				maxSubArray=thisNumber;	
			
		}
		System.out.println(maxSubArray);
	}

}
