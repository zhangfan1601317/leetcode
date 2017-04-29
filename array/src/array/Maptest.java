package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Maptest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random rand=new Random();
		Map<Integer, Integer> m=new HashMap<>();
		for(int i=0;i<1000;i++)
		{
			int r=rand.nextInt(20);
			Integer freq=m.get(r);
			m.put(r, freq==null?1:freq+1);
		}
		System.out.println(m);
	}

}
