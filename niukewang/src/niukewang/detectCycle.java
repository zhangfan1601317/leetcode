package niukewang;

public class detectCycle
{

	public ListNode detectCycle(ListNode head) {
        if(head==null)
        	return head;
        ListNode slow=head;
        ListNode fast=head;
        boolean isCycle=false;
        while(fast.next!=null&&fast.next.next!=null)
        {
        	slow=slow.next;
        	fast=fast.next.next;
        	if(fast==slow)
        	{
        		isCycle=true;
        		break;
        	}      		
        }
        if(isCycle){
        	slow=head;
        while(slow!=fast){
        	slow=slow.next;
        	fast=fast.next;
        }
        return slow;
        }
        else
        	return null;
        
    }
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}

}
