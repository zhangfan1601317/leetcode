import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionofTwoArrays349
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int []nums1=new int[]{};
		int []nums2=new int[]{};		
		intersection(nums1, nums2);
	}
	 public static int[] intersection(int[] nums1, int[] nums2) {
	    HashSet<Integer> inset1=new HashSet<>();
	    HashSet<Integer> inSet2=new HashSet<>();
	    HashSet<Integer> inSet=new HashSet<>();
	    for(int i:nums1)
	    	inset1.add(i);
	    for(int i:nums2)
	    	inSet2.add(i);
	    for(int i=0;i<nums1.length;i++)
	    {
	    	if(inset1.contains(nums1[i]) && inSet2.contains(nums1[i]))
	    	{
	    		inSet.add(nums1[i]);
	    	}
	    }
	    //将hashset转换为integer数组
	    Integer[] temp = inSet.toArray(new Integer[] {});
	    //将integer转换为int
	    int []result=new int[temp.length];
	    for(int i=0;i<temp.length;i++)
	    {
	    	result[i]=temp[i].intValue();
	    }
	    return result;
	 }

}
