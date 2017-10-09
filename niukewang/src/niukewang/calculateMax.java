package niukewang;

import java.util.ArrayList;
import java.util.Collections;

public class calculateMax
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		//int price[]={3,8,5,1,7,8};
		int price[]={5,15,56,26,62,65,57,69};
		System.out.println(calculateMax(price));

	}
	//动态规划的思想
	public static  int calculateMax(int[] prices) {
		int res=0;
		if(prices==null||prices.length<2)
			return 0;
		for(int i=1;i<prices.length;i++){
			int tmp=SubcalculateMax(prices, 0, i)+SubcalculateMax(prices, i, prices.length-1);
			if(tmp>res)
				res=tmp;
		}
		return res;
		
    }
	public static int SubcalculateMax(int [] prices,int start,int end){
		int min=prices[start];
		int max=0;
		for(int i=start+1;i<=end;i++){			
			if(prices[i]-min>max)
				max=prices[i]-min;
			if(prices[i]<min)
				min=prices[i];
		}
		return max;
	}

}
