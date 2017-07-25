import java.util.Arrays;

public class MaxProductThreeNumbers
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int num[]=new int[]{-4,-3,-2,-1,60};
		System.out.println(maximumProduct(num));
	}
	public static int maximumProduct(int[] nums) {
        int  max=0;
        int length=nums.length;
        Arrays.sort(nums);
        max=nums[length-1]*nums[length-2]*nums[length-3];
        max=Math.max(max,nums[0]*nums[1]*nums[length-1]);
		return max;
    }
}
