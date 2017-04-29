package array;

import java.nio.channels.Pipe;

public class BestTimetoBuyandSellStock121 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
				//只有一次交易
//				if(prices[i]<min)
//					min=prices[i];
//				else {
//					max=Math.max(max, prices[i]-min);
//				}
				//不限次数交易
				if(prices[i]-prices[i-1]>0)
					max+=prices[i]-prices[i-1];
			}	
		}	 	
		System.out.println(max);
	}

}
