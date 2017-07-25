package niukewang;

public class ReverseList
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static  ListNode ReverseList(ListNode head) {
		if(head==null)
            return null;
		ListNode reverseNode=head;
        ListNode pre=null;
        ListNode next=null;        
        while(head!=null)
        {
        	next=head.next;
        	head.next=pre;
        	if(next!=null)
        	{
        		reverseNode=head;
	        	pre=head;
	        	head=next;
        	}
        }
        return reverseNode;      
    }

}
