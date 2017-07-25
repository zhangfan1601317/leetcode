package niukewang;

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
}
public class Find
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int [] pre={1,2,4,7,3,5,6,8};
		int [] in={4,7,2,1,5,3,8,6};
		//TreeNode node=reConstructBinaryTree(pre, in);
		//printTree(node);
		int []array={1,1,1,0,1};
	}
	public static  boolean Find (int target, int [][] array) {
		boolean find=false;
		if(array!=null)
		{
			int row=array.length;
			int col=array[0].length;
	        int i=0;
	        int j=col-1;
	        while(i<row&&j>=0)
	            {
	        	if(array[i][j]==target)
	        	{
	        		find=true;
	        	    break;
	        	}
	        	else if(array[i][j]<target)
	                i++;
	            else
	                j--;
	        }
		}		
        return  find;
    }
	
    
    
    
    
    
    
    
    
}

