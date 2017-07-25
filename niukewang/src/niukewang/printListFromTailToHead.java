package niukewang;

import java.util.ArrayList;

public class printListFromTailToHead
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	ArrayList<Integer> list=new ArrayList<Integer>(); 
    	ListNode pre=null; 
    	ListNode next=null;
    	while(listNode!=null)
    	{ 
    		next=listNode.next; 
    		listNode.next=pre;
    		pre=listNode;
    		listNode=next;
    		} 
    	while(pre!=null){ 
    		list.add(pre.val);
    		pre=pre.next;
    		} 
    	return list;
    	} 
}
