package niukewang;
public class Mirror
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
	}
    public static  void Mirror(TreeNode root) {
        if((root==null)||(root.left==null&&root.right==null))
        	return ;
        TreeNode tempNode=root.left;
        root.left=root.right;
        root.right=tempNode;
        if(root.left!=null)
        	Mirror(root.left);
        if(root.right!=null)
        	Mirror(root.right);
    }

}
