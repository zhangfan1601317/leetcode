public class MissingNumber268 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x=missingNumber();
		System.out.println(x);
	}
	public static int missingNumber() {
		int nums[]=new int[]{0,1,3};
        int length=nums.length;
        int result=0;
		if(nums[length/2]>length/2)
		{
			for(int i=0;i<length/2;i++)
			{
				if(nums[i]==i && nums[i+1]==i+2)
				{
					result=i+1;
					break;
				}
			}
		}
		else if(nums[length/2]>=length/2)
		{
			for(int i=length/2;i<length;i++)
			{
				if(nums[i]==i+1 && nums[i-1]==i-1)
				{
				    result=i;
				    break;
				}
				else
				{
				    result=length;
				}
			}
		}
		return result;
    }
}
