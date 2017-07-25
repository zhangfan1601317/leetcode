package niukewang;

public class KthNode
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null||k<1){
        	return null;
        }
        int [] tmp={k};
        return kthNodeCore(pRoot, tmp);
    }
	private static TreeNode kthNodeCore(TreeNode Proot,int [] num){
		TreeNode result=null;
		if(Proot.left!=null){
			result=kthNodeCore(Proot.left, num);
		}
		if(result==null){
			if(num[0]==1)
				result=Proot;
			else
				num[0]--;
		}
		if(result==null&&Proot.right!=null){
			result=kthNodeCore(Proot.right, num);
		}
		return result;
	}

}
