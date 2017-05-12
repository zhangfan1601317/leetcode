
public class PalindromeLinkedList234
{

	public static void main(String[] args)
	{
		

	}
public static boolean isPalindrome(ListNode head) {
        if(head==null)
        	return true;
        ListNode p=head;
        ListNode q=new ListNode(head.val);
        while(p.next!=null)
        {
        	ListNode temp=new ListNode(p.next.val);
        	temp.next=q;
        	q=temp;
        	p=p.next;
        }
        ListNode p1=head;
        ListNode p2=q;
        while(p!=null)
        {
        	if(p1.val!=p2.val)
        		return false;
        	p1=p1.next;
        	p2=p2.next;
        }
        return true;
    }

}
public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	  }
