package array;

import java.util.ArrayList;

public class RotateArray2189 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int k=3;
		int nums[]=new int[]{1,2,3,4,5,6,7};
		if(nums.length<k)
			k=k-nums.length;
		int temp[]=new int[k];
		for(int i=0;i<k;i++)
		{
			temp[i]=nums[nums.length-k+i];
		}
		for(int i=nums.length-k-1;i>=0;i--)
		{
			nums[i+k]=nums[i];
		}
		for(int i=0;i<k;i++)
		{
			nums[i]=temp[i];
		}
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
	}

}
