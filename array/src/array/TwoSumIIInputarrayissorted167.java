package array;

import java.util.ArrayList;

public class TwoSumIIInputarrayissorted167 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums=new int[]{-1,0,0};
		int target=-1;
		int left=0;
		int right=nums.length-1;
		while(nums[left]+nums[right]!=target)
		{
			if(nums[left]+nums[right]<target)
			{
				left++;
			}
			else
			{
				right--;
			}
		}	
		int result[]={left+1,right+1};
		System.out.println(result[0]+" "+result[1]);
	}

}
