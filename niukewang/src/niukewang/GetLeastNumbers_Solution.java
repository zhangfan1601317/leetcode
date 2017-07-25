package niukewang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class GetLeastNumbers_Solution
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int[] input={1,2,3,3,5,6,7,8};
		int k=4;
		System.out.print(GetLeastNumbers_Solution(input, k));
	}
    public static  ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) 
    {
    	ArrayList<Integer>list=new ArrayList<>();
        if(input==null||input.length==0||k==0||input.length<k)
        	return list;
        TreeSet<Integer>set=new TreeSet<>();
        for(int i=0;i<input.length;i++){
        	set.add(input[i]);
        }
        Iterator<Integer>iterator=set.iterator();
        int cnt=0;
        while(iterator.hasNext()){
        	if(cnt>=k)
        		break;
        	list.add(iterator.next());
        	cnt++;
        }
        return list;
    }
}
