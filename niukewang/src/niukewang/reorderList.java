package niukewang;

public class reorderList
{

	public void reorderList(ListNode head) {
		if(head==null||head.next==null)
        	return ;		       
		ListNode middle=getmiddlenode(head);
		ListNode back=reversenode(middle);
		merge(head, back);
               
    }
	public ListNode getmiddlenode(ListNode head){		 
	    //找到中间节点
		ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
        	slow=slow.next;
        	fast=fast.next.next;
        }
	    return slow;
	}
	public ListNode reversenode(ListNode slow){
		//拆分并反转后半部分
        ListNode pre=null;
		ListNode cur=slow.next;
		slow.next=null;
		
		while(cur!=null)
		{
			ListNode next=cur.next;
			
			cur.next=pre;
			
			pre=cur;
			cur=next;
			
		}
		return pre;
	}
	public void merge(ListNode form,ListNode back){
		 while(form!=null&&back!=null){
        	ListNode first=form.next;
        	ListNode second=back.next;
        	form.next=back;
        	back.next=first;        	
        	form=first;
        	back=second;
        }
	}
	
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}

}
