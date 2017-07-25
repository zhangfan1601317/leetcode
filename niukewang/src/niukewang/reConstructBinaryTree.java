package niukewang;

public class reConstructBinaryTree
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static  TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null||in==null||pre.length!=in.length||pre.length<1)
        	return null;
        TreeNode root=construct(pre, 0, pre.length-1, in, 0, in.length-1);
        return root;
    }
    public static TreeNode construct(int[]pre, int prestart,int preend,int [] in,int instart,int inend){
    	if(prestart>preend||instart>inend)
    		return null;
    	int val=pre[prestart];
    	TreeNode node=new TreeNode(val);
    	node.val=val;
    	for(int index=instart;index<=inend;index++)
    	{
    		if(in[index]==val)
    		{
    	    	node.left=construct(pre, prestart+1, prestart+index-instart, in, instart, index-1);
    	    	node.right=construct(pre, prestart+index-instart+1, preend, in, index+1, inend);
    		}
    	}
    	return node;
    }

}
