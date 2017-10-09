package niukewang;

import java.util.ArrayList;

public class preorderTraversal
{
	ArrayList<Integer>list=new ArrayList<>();
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
        	return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}

}
