package niukewang;

public class sortList
{
	//归并排序的思想：找到中间节点，归并两段链表，实现思想。
	public ListNode sortList(ListNode head) {
		if(head==null||head.next==null)
        	return head;
		ListNode middle=middleList(head);
		ListNode next=middle.next;
		middle.next=null;
		return mergeList(sortList(head), sortList(next));
				
    }
	ListNode middleList(ListNode head){
		
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null)
        {
        	slow=slow.next;
        	fast=fast.next.next;
        }
        return slow;//中间节点
	}
	ListNode mergeList(ListNode slow,ListNode fast){
		ListNode node=new ListNode(-1);
		ListNode cur=node;
		while(slow.next!=null&&fast.next!=null){
			if(slow.val<=fast.val){
				cur.next=slow;
				slow=slow.next;
			}else{
				cur.next=fast;
				fast=fast.next;
			}
			cur=cur.next;			
		}
		cur.next=slow!=null?slow:fast;
		return node.next;
	}
	
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}

}
