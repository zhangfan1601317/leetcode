
public class LinkedListCycle141
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		
	}
	
	 public boolean hasCycle(ListNode head) {
	        ListNode slow=head,fast=head;
	        while(fast!=null&&slow!=null)
	        {
	        	slow=slow.next;
	        	fast=fast.next.next;
	        	if(slow==fast)
	        		return true;
	        }
	        return false;
	    }
}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	         val = x;
	         next = null;
	      }
	  }
