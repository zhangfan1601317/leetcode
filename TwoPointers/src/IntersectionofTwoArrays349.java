import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionofTwoArrays349
{

	public static void main(String[] args)
	{
		// TODO �Զ����ɵķ������
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
	    //��hashsetת��Ϊinteger����
	    Integer[] temp = inSet.toArray(new Integer[] {});
	    //��integerת��Ϊint
	    int []result=new int[temp.length];
	    for(int i=0;i<temp.length;i++)
	    {
	    	result[i]=temp[i].intValue();
	    }
	    return result;
	 }

}
