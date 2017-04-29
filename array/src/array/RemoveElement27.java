package array;
public class RemoveElement27 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums=new int[]{};
		int val=3;
		int len=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=val)
			{
				nums[len]=nums[i];
				len++;
			}
		}
		System.out.println(len);
	}

}
