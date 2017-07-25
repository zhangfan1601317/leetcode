package niukewang;

public class deleteDuplication
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static  ListNode deleteDuplication(ListNode pHead)
    {
		if(pHead==null){
			return null;
		}
		if(pHead.next==null){
			return pHead;
		}
		ListNode root=new ListNode(0);
		root.next=pHead;
		ListNode prev=root;
		ListNode node=pHead;
		while(node!=null&&node.next!=null){
			if(node.val==node.next.val){
				while(node.next!=null&&node.next.val==node.val){
					node=node.next;
				}
				prev.next=node.next;
			}
			else{
				prev.next=node;
				prev=prev.next;
			}
			node=node.next;
		}
		return root.next;
    }

}
