package array;

import java.util.HashSet;

public class ContainsDuplicateII219 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums=new int[]{1,2,3,4,2,1};		
		int k=2;
		boolean result=false;
		HashSet<Integer> inSet=new HashSet<>();
		for(int i=0;i<nums.length;i++)
		{
			if(i>k)
			{
				inSet.remove(nums[i-k-1]);
			}
			if(!inSet.add(nums[i]))
			{
				result=true;
				break;
			}
		}	
		System.out.println(result);
	}
}
