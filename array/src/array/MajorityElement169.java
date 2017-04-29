package array;

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement169 {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 5, 5, 5, 5, 5 };
		// System.out.println(MajorityElement169.majority(nums));
		int fre[]=new int[nums.length];
		ArrayList<Integer> list = new ArrayList<>();
//		for (int i : nums)
//		{
//			if(!list.contains(i))
//				list.add(i);
//			fre[list.indexOf(i)]++;
//			if(fre[list.indexOf(i)]>nums.length/2)
//				//return i;
//				System.out.println(i);
//		}
		for(int i:nums)
		{
			if(!list.contains(i))
				list.add(i);
			fre[list.indexOf(i)]++;
			if(fre[list.indexOf(i)]>nums.length/2)
				System.out.println(i);
		}
//		for (int i : nums) {
//			list.add(i);
//		}		
//		int result = 0;
//		for (int i = 0; i < nums.length; i++) {
//			int size = list.size();
//			result = i;
//			if (list.size() + nums.length / 2 < size) {
//				break;
//			}
//		}
//		System.out.println(result);

	}

	public static int majority(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if (hm.containsKey(i))
				hm.put(i, hm.get(i) + 1);
			else
				hm.put(i, 1);
			if (hm.get(i) > nums.length / 2)
				return i;
		}
		return 0;
	}

}
