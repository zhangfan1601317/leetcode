package niukewang;

import java.util.ArrayList;

public class FindContinuousSequence
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int sum=15;
		System.out.println(FindContinuousSequence(sum));

	}
	public static  ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	       ArrayList< ArrayList<Integer>> listAll=new ArrayList< ArrayList<Integer>>();
	       if(sum<3)
	    	   return listAll;
	       int small=1;
	       int big=2;
	       int mid=(sum+1)/2;
	       int curSum=3;
	       while(small<mid){
	    	   while(curSum<sum){
	    		   big++;
	    		   curSum+=big;
	    	   }
	    	   if(curSum==sum){
	    		   ArrayList<Integer>list=new ArrayList<>();
	    		   for(int i=small;i<=big;i++){
	    			   list.add(i);
	    		   }
	    		   listAll.add(list);
	    	   }
	    	   curSum-=small;
	    	   small++;
	       }
	       return listAll;
    }

}
