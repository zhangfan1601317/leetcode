package niukewang;

import java.awt.Robot;

public class Convert
{
	TreeNode head=null;
    TreeNode tail=null;
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		

	}
    public TreeNode Convert(TreeNode pRootOfTree) {        
        if(pRootOfTree==null)
        	return head;
        if(pRootOfTree.left==null&&head==null)
        	head=tail=pRootOfTree;
        Convert(pRootOfTree.left);
        if(tail!=pRootOfTree){
        	tail.right=pRootOfTree;
        	pRootOfTree.left=tail;
        	tail=pRootOfTree;
        }
        Convert(pRootOfTree.right);
        return head;
        
    }
}
