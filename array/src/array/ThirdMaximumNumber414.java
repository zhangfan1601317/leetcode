package array;

import java.util.ArrayList;
import java.util.HashSet;

public class ThirdMaximumNumber414 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int nums[]=new int[]{1,1,2};
		int thirdMax=-2147483647;
		HashSet<Integer>inSet=new HashSet<>();
		for(int i=0;i<nums.length;i++)
		{
			inSet.add(nums[i]);
		}
		if(inSet.size()<3)
		{
			if(inSet.size()==1)
				thirdMax=nums[0];
			else
			{
				thirdMax=nums[0];
				for(int i=1;i<nums.length;i++)
				{
					if(nums[i]!=thirdMax)
					{
						if(nums[i]>thirdMax)
						  thirdMax=nums[i];
						break;
					}
				}
			}
		}
		else
		{					
			int max1=0;
			for(int i=0;i<nums.length;i++)
			{
				if(nums[i]>max1) max1=nums[i];
			}	
			int max2=0;
			for(int i=0;i<nums.length;i++)
			{
				if(nums[i]>max2&&nums[i]!=max1) max2=nums[i];
			}
			int max3=0;
			for(int i=0;i<nums.length;i++)
			{
				if(nums[i]>max3&&nums[i]!=max1&&nums[i]!=max2) max3=nums[i];
			}
			thirdMax=max3;
		}
		System.out.println(thirdMax);
	}
}
