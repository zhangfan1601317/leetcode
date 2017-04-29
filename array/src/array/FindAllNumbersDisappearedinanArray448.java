package array;

import java.util.ArrayList;

public class FindAllNumbersDisappearedinanArray448 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums=new int[]{4,3,2,7,8,2,3,1};
		ArrayList<Integer>list=new ArrayList<>();
		int []flag=new int[nums.length+1];
		for(int num:nums)
		{
			flag[num]=-1;
		}
		for(int i=1;i<nums.length+1;i++)
		{
			if(flag[i]!=-1)
				list.add(i);
		}
		System.out.println(list);
	}

}
