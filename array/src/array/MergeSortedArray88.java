package array;

import java.util.ArrayList;

public class MergeSortedArray88 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int m=1;
		int n=1;
		int nums1[]=new int[m+n];
		int nums2[]=new int[]{1};		
		nums1[0]=2;
		int index1=m-1;
		int index2=n-1;
		int index=m+n-1;
		if(nums1==null||nums2==null)
			System.out.println();
		while(index1>=0&&index2>=0)
		{
			if(nums1[index1]>nums2[index2])
				nums1[index--]=nums1[index1--];
			else  
				nums1[index--]=nums2[index2--];
		}
		while(index2>=0)
		{
			nums1[index--]=nums2[index2--];
		}
		for(int i=0;i<m+n;i++)
		{
			System.out.println(nums1[i]);
		}
	}

}
