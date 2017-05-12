import java.util.ArrayList;

public class IntersectionofTwoArrays2350
{

	public static void main(String[] args)
	{
		int [] nums1=new int[]{};
		int [] nums2=new int[]{};
		int [] nums=intersect(nums1, nums2);

	}
	public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>result=new ArrayList<>();
        for(int i:nums1)
        	list.add(i);
        for(int i=0;i<nums2.length;i++)
        {
        	if(list.contains(nums2[i]))
        	{
        		result.add(nums2[i]);
        		list.remove(list.indexOf(nums2[i]));
        	}
        }
        int [] res=new int [result.size()];
        for(int i=0;i<result.size();i++)
        {
        	res[i]=result.get(i);
        }
        return res;
    }
}
