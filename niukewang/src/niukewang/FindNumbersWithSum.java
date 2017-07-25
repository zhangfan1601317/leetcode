package niukewang;

import java.util.ArrayList;

public class FindNumbersWithSum
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int []array={1,2,3,5,8,14,15};
		int sum=15;
		System.out.println(FindNumbersWithSum(array, sum));

	}
    public static  ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>();
        if(array==null||array.length==0)
        	return res;
        int start=0;
        int end=array.length-1;
        while(start<end){
        	if(array[start]+array[end]<sum){
        		start++;
        	}else if(array[start]+array[end]>sum){
        		end--;
        	}else{
        		list.add(array[start]);
        		list.add(array[end]);
        		start++;
        	}
        }       
        if(list.size()>=2){
        	int result=list.get(0)*list.get(1);
        	res.add(list.get(0));
        	res.add(list.get(1));
	        for(int i=0;i<list.size();i+=2){
	            if(result>list.get(i)*list.get(i+1)){
	            	result=list.get(i)*list.get(i+1);
	            	res.clear();
	            	res.add(list.get(i));
	            	res.add(list.get(i+1));
	            }
	            	
	        }
        }
        return res;
    }

}
