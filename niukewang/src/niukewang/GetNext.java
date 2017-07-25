package niukewang;

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class GetNext
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static  TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null){
        	return null;
        }
        TreeLinkNode target=null;
        if(pNode.right!=null){
        	target=pNode.right;
        	while(target.left!=null){
        		target=target.left;
        	}
        	return target;
        }
        while(pNode.next!=null){
        	if(pNode.next.left==pNode)
        		return pNode.next;
        	pNode=pNode.next;
        }
        return null;
    }

}
