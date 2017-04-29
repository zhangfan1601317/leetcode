package array;

import java.util.ArrayList;

public class RotateArray189 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int k=3;
		int nums[]=new int[]{-1,2};
		ArrayList<Integer>list=new ArrayList<>();
		if(nums.length<k)
			k=k-nums.length;
		for(int i=nums.length-k;i<nums.length;i++)
		{
			list.add(nums[i]);
		}
		for(int i=0;i<nums.length-k;i++)
		{
			list.add(nums[i]);
		}
		System.out.println(list);
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=list.get(i);
		}
	}

}
