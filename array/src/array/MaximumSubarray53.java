package array;

import java.util.Arrays;

public class MaximumSubarray53 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int []nums=new int []{-2,1};
		if(nums.length==0)
			System.out.println(0);
		int maxSubArray=nums[0];//ȫ�ֱ���
		int thisNumber=nums[0];//�ֲ�����
		for(int i=1;i<nums.length;i++)
		{				
			thisNumber+=nums[i];
			if(thisNumber<nums[i])//����ֲ�����
				thisNumber=nums[i];			
			if(thisNumber>maxSubArray)//����ȫ������ ˳���ܵߵ���
				maxSubArray=thisNumber;	
			
		}
		System.out.println(maxSubArray);
	}

}
