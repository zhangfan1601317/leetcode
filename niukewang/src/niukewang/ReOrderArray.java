package niukewang;

import java.util.ArrayList;

public class ReOrderArray
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
    public static void reOrderArray(int [] array) {
    	ArrayList<Integer> odd=new ArrayList<>();
    	ArrayList<Integer> even=new ArrayList<>();
    	for(int i=0;i<array.length;i++){
        	if(array[i]%2==1)
        		odd.add(array[i]);
        	else
        		even.add(array[i]);
        }
    	for(int i=0;i<array.length;i++)
    	{
    		if(i<odd.size())
    		   array[i]=odd.get(i);
    		else
    			array[i]=even.get(i-odd.size());
    	}
    }

}
