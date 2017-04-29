package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPartitionI561 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums=new int[]{1,4,3,2};
		Arrays.sort(nums);
		int n=0;
		for(int i=0;i<nums.length;i++)
		{
			if(i%2==0)
				n+=nums[i];
		}
		System.out.println(n);
	}

}
