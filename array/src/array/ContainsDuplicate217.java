package array;
import java.util.LinkedList;
import java.util.Set;

public class ContainsDuplicate217 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] nums={};
		boolean bol=false;
		LinkedList <Integer>inSet=new LinkedList<>();
		for(int i=0;i<nums.length;i++)
		{		    
			if(inSet.contains(nums[i]))
			   bol= true;
			inSet.add(nums[i]);
		}
		System.out.println(bol);
	}

}
