public class TwoSum1 {
	public static void main(String[] args) {
		int [] nums=new int[]{2,7,11,15};
		int target=9;
		int a=0; 
		int b=0;
		boolean bool=false;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if(i!=j)
				{
					if(nums[i]+nums[j]==target)
					{
						a=i;
						b=j;
						bool=true;
						break;
					}
				}
			}
			if(bool)
			{
				break;
			}
		}
		int [] arr={a,b};
		System.out.print(a+" "+b);
	}
}
