package array;

import java.util.HashMap;
import java.util.Map;

public class KdiffPairsinanArray532 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int nums[]=new int[]{3, 1, 4, 1, 5};
		int k=2;
		if (nums == null || nums.length == 0 || k < 0)
			System.out.println(0);
		Map<Integer, Integer> map=new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                } 
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }       		
	}
        System.out.println(count);
}
}
