package array;

import java.nio.channels.Pipe;

public class BestTimetoBuyandSellStock121 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//System.out.println("haha");
		int [] prices=new int[]{};
		int max=0;
		if(prices.length==0)
			max=0;
		else
		{
			//int  min=prices[0];
			for(int i=1;i<prices.length;i++)
			{
				//ֻ��һ�ν���
//				if(prices[i]<min)
//					min=prices[i];
//				else {
//					max=Math.max(max, prices[i]-min);
//				}
				//���޴�������
				if(prices[i]-prices[i-1]>0)
					max+=prices[i]-prices[i-1];
			}	
		}	 	
		System.out.println(max);
	}

}
