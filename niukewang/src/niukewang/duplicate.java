package niukewang;

import java.util.ArrayList;

public class duplicate
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int num[]={2,3,1,0,2,5,3};
		int length=7;
		int [] dup=new int[1];
		System.out.println(duplicate(num, length, dup));

	}
	public static  boolean duplicate(int numbers[],int length,int [] duplication) {
	    ArrayList<Integer>list=new ArrayList<>();
	    if(numbers==null||numbers.length<=0)
	    	return false;
	    for(int i=0;i<length;i++){
	    	if(list.contains(numbers[i])==false){
	    		list.add(numbers[i]);
	    	}
	    	else{
	    		duplication[0]=numbers[i];
	    		return true;
	    	}
	    }	    
	    return false;	    
    }
}
