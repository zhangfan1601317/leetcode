package niukewang;

public class EntryNodeOfLoop
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode fast=pHead;
        ListNode slow=pHead;
        while(fast!=null&&fast.next!=null){
        	fast=fast.next.next;
        	slow=slow.next;
        	if(fast==slow){
        		break;
        	}
        }
        if(fast==null||fast.next==null){
        	return null;
        }
        fast=pHead;
        while(fast!=slow){
        	fast=fast.next;
        	slow=slow.next;
        }
        return fast;
    }

}
