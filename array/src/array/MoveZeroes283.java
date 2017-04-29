package array;

import java.util.ArrayList;

public class MoveZeroes283 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums=new int[]{0,1,0,3,12};
		ArrayList<Integer>list=new ArrayList<>();
		int cnt=0;
		int index=0;
		for(int num:nums)
		{
			if(num!=0)
			{
			//list.add(num);		
				nums[index++]=num;
			}
			else
				cnt++;
		}
		//for(int i=nums.length-cnt;i<nums.length;i++)
			//list.add(0);
		//System.out.println(list);
		while(cnt>0)
		{
			nums[index++]=0;
			cnt--;
		}
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]+" ");
		}
	}

}
