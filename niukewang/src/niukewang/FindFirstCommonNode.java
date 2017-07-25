package niukewang;

public class FindFirstCommonNode
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static  ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 int p1length=GetListLength(pHead1);
		 int p2length=GetListLength(pHead2);
		 int minus=p1length-p2length;
		 ListNode longlist=pHead1;
		 ListNode shortlist=pHead2;
		 if(p1length<p2length){
			 minus=p2length-p1length;
			 longlist=pHead2;
			 shortlist=pHead1;
		 }
		 for(int i=0;i<minus;i++){
			 longlist=longlist.next;
		 }
		 while(longlist!=null&&shortlist!=null){
			 if(longlist==shortlist)
				 break;
			 else{
				 longlist=longlist.next;
				 shortlist=shortlist.next;
			 }
		 }
	     ListNode fisrstCommon=longlist;
	     return  fisrstCommon;
		
		 
    }
	public static int GetListLength(ListNode p){
		int length=0;
		if(p==null)
			return length;
		while(p!=null){
			length++;
			p=p.next;
		}
		return length;
	}

}
