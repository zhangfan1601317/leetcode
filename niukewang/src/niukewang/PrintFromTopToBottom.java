package niukewang;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
    public static  ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        if(root==null)
             return list;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while(queue.isEmpty()==false){
        	TreeNode treeNode=queue.poll();
        	if(treeNode.left!=null){
        		queue.offer(treeNode.left);
        	}
        	if(treeNode.right!=null){
        		queue.offer(treeNode.right);
        	}
        	list.add(treeNode.val);
        }
        return list;
    }

}
