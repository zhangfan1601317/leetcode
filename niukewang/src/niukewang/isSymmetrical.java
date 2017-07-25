package niukewang;

public class isSymmetrical
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	boolean isSymmetrical(TreeNode pRoot)
    {
        return SubisSym(pRoot, pRoot);
    }
	private static boolean SubisSym(TreeNode left, TreeNode right){
		if(left==null&&right==null){
			return true;
		}
		else if(left==null||right==null){
			return false;
		}
		if(left.val!=right.val){
			return false;
		}
		return SubisSym(left.left, right.right)&&SubisSym(left.right, right.left);
	}

}
