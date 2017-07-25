package niukewang;

public class HasSubtree
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static  boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean IsSubtree=false;
        if(root1!=null&&root2!=null)
        {
        	if(root1.val==root2.val){
        		IsSubtree=DoesRoot1HaveRoot2(root1,root2);
        		if(IsSubtree==false)
        			IsSubtree=HasSubtree(root1.left, root2);
        		if(IsSubtree==false)
        			IsSubtree=HasSubtree(root1.right, root2);	
        	}
        }
        return IsSubtree;              
    }
	public static boolean DoesRoot1HaveRoot2(TreeNode root1, TreeNode root2){
		if(root2==null)
			return true;
		if(root1==null)
			return false;
		if(root1.val!=root2.val)
			return false;
		return DoesRoot1HaveRoot2(root1.left, root2.left)&&DoesRoot1HaveRoot2(root1.right, root2.right);
	}

}
