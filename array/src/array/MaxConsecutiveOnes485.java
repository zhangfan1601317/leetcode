package array;
public class MaxConsecutiveOnes485 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums={1,0,1,1,1,1};		
		if(nums.length<10000)
		{
			int max=0;
			int cnt=0;
			for(int i=0;i<nums.length;i++)
			{			
				if(nums[i]==1)
				{
					cnt++;
				}
				else if(cnt>=max) 
				{							
					max=cnt;
					cnt=0;									
				}
			}
			if(cnt>=max); max=cnt;	
		System.out.println(max);
		}		
	}
}
