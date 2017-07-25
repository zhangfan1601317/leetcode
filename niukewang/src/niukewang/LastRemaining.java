package niukewang;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LastRemaining
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static int LastRemaining_Solution(int n, int m) {
		if(n<1||m<1){
			return -1;
		}
		LinkedList<Integer>list=new LinkedList<>();
		for(int i=0;i<n;i++){
			list.add(i);
		}
		int index=0;
		while(list.size()>1){
			for(int i=1;i<m;i++){
				index=(index+1)%list.size();
			}
			list.remove(index);
		}
		return list.get(0);
	}	
}
