package niukewang;

import java.util.ArrayList;
import java.util.Collections;
public class maxInWindows
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		

	}
	public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer>windowMax=new ArrayList<>();
        if(num==null||size<0){
        	return null;
        }
        int length=num.length; 
        if(size==0||length<size)
        	return windowMax;
        ArrayList<Integer>temp=null;                     
    	for(int i=0;i<length-size+1;i++){
    		temp=new ArrayList<Integer>();
    		for(int j=i;j<size+i;j++){
    			temp.add(num[j]);
    		}
    		Collections.sort(temp);
    		windowMax.add(temp.get(temp.size()-1));
    	}       
        return windowMax;
    }

}
