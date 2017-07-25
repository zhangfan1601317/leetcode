package niukewang;

public class printTree
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static void printTree(TreeNode node){
    	if(node!=null){
    		printTree(node.left);
    		System.out.print(node.val+" ");
    		printTree(node.right);
    	}
    }
}
