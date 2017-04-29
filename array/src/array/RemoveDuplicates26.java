package array;
public class RemoveDuplicates26 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []nums=new int[]{1,1,2};
		if(nums.length==0)
			System.out.println(0);
		int j=0;
		for(int i=0;i<nums.length;i++)
	    {
           if(nums[i]!=nums[j])
            nums[++j]=nums[i];
	    }      
        System.out.println(j+1);
	}

}
