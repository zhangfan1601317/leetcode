package niukewang;

import java.util.ArrayList;

public class postorderTraversal
{
    ArrayList<Integer>list=new ArrayList<>();
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
        	return null;
        postorderTraversal(root.left);
		postorderTraversal(root.right);
		list.add(root.val);
		return list;
        	
    }
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}

}
