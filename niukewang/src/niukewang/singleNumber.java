package niukewang;

import java.util.HashMap;

public class singleNumber
{

	public int singleNumber(int[] A) {
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int i=0;i<A.length;i++){
        	if(map.containsKey(A[i]))
        		map.put(A[i], map.get(A[i])+1);
        	else
        		map.put(A[i], 1);
        }
        for(int i=0;i<A.length;i++){
        	if(map.get(A[i])==1)
        		return A[i];
        }
		return 0;
    }
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}

}
