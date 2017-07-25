package niukewang;

//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
public class FindKthToTail
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public  static  ListNode FindKthToTail(ListNode head,int k) {
		if(head==null||k==0)
			return null;
		ListNode first=head;
		ListNode second=null;
		for(int i=0;i<k-1;i++)
		{
			if(first.next!=null)
				first=first.next;
			else
				return null;
		}
		second=head;
		while(first.next!=null)
		{
			first=first.next;
			second=second.next;
		}
		return second;
    }

}
