package niukewang;

import java.util.LinkedList;
import java.util.Queue;

public class TreeDepth
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	 public static  int TreeDepth2(TreeNode root) {
	        if(root==null){
	        	return 0;
	        }
	        int left=TreeDepth2(root.left);
	        int right=TreeDepth2(root.right);
	        return left>right?(left+1):(right+1);	        
	    }	
	 //非递归版
	 public int TreeDepth(TreeNode root){
		 if(root==null)
			 return 0;
		 Queue<TreeNode>queue=new LinkedList<>();
		 queue.add(root);
		 int depth=0,count=0,nextCount=1;
		 while(queue.size()!=0){
			 TreeNode top=queue.poll();
			 count++;
			 if(top.left!=null){
				 queue.add(top.left);
			 }
			 if(top.right!=null){
				 queue.add(top.right);
			 }
			 if(count==nextCount){
				 nextCount=queue.size();
				 count=0;
				 depth++;
			 }
		 }
		 return depth;
	 }
}
