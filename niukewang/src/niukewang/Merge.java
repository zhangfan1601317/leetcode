package niukewang;

public class Merge
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
    public static  ListNode Merge(ListNode list1,ListNode list2) {
    	if(list1==null)
        	return list2;
        if(list2==null)
        	return list1;
        ListNode MergeNode=null;
        if(list1!=null&&list2!=null){
            if(list1.val<list2.val)
            {
                MergeNode=list1;
                MergeNode.next=Merge(list1.next, list2);
            }
            else
            {
                MergeNode=list2;
                MergeNode.next=Merge(list1, list2.next);
            }
        }
        return MergeNode;
        	
    }
    public static  ListNode Merge2(ListNode list1,ListNode list2){
    	if(list1==null)
    		return list2;
    	if(list2==null)
    		return list1;
    	ListNode MergeHead=new ListNode(0);
    	ListNode res=MergeHead;
    	while(list1!=null&&list2!=null){
    		if(list1.val<list2.val){
    			MergeHead.next=list1;
    			MergeHead=list1;
    			list1=list1.next;
    		}
    		else{
    			MergeHead.next=list2;
    			MergeHead=list2;
    			list2=list2.next;
    		}
    	}
    	if(list1!=null){
    		MergeHead.next=list1;
    	}
    	if(list2!=null){
    		MergeHead.next=list2;
    	}
    	return res.next;
    		
    }
}
