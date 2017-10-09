package niukewang;

public class insertionSortList
{
	//牺牲空间来换取时间的排序
	public ListNode insertionSortList(ListNode head) {
        if(head==null)
        	return head;
		ListNode res=new ListNode(-1);
        ListNode cur=res;
        while(head!=null){
        	ListNode next=head.next;
        	cur=res;
        	while(cur.next!=null&&cur.next.val<head.val)
        		cur=cur.next; 
        	head.next=cur.next;
        	cur.next=head;
        	head=next;       	    	
        }
        return res.next;
    }
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}

}
