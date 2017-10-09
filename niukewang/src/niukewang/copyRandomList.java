package niukewang;

import java.util.HashMap;

public class copyRandomList
{
	
	 //Definition for singly-linked list with a random pointer.
	 class RandomListNode {
	      int label;
	     RandomListNode next, random;
	     RandomListNode(int x) { this.label = x; }
	  };
	  public RandomListNode copyRandomList(RandomListNode head) {
		  if(head==null)
	        	return head;
		  
	        RandomListNode node=head;
	        RandomListNode copy=null;
	        RandomListNode second=copy;//保存复制好的节点
	        //确定把copy插入到node里面
	        while(node!=null){
	        	copy=new RandomListNode(node.label);
	        	RandomListNode temp=node.next;
              
	        	node.next=copy;
	        	copy.next=temp;	        	
	        	
	        	if(second==null)
	        		second=copy;
	        	
	            node=temp;
              
	        }
      
	        node=head;
	        //将random在插入之后的基础上进行指正
	        while(node!=null){
	        	if(node.random!=null){
	        		node.next.random=node.random.next;
	        	}
              else
	        		node.next.random=null;
	        	node=node.next.next;
	        }
	        
	        node=head;
      	    copy=second;
      	    //	拆分两者，保持原链表不变
	        while(copy.next!=null){
	        	node.next=copy.next;
              node=node.next;
              copy.next=node.next;
              copy=copy.next;
	        	
	        }
	        return second;
	  }
	  public RandomListNode copyRandomList2(RandomListNode head){
		  if(head==null)
			  return head;
		  RandomListNode result=null;
		  RandomListNode pold=head,pnew=result,next=null;
		  do{
			  next=pold.next;
			  pnew=new RandomListNode(pold.label);
			  
			  pold.next=pnew;
			  pnew.next=next;
			  
			  if(result==null)
				  result=pnew;
			  pold=next;
			  
		  }while(pold!=null);
		  
		  pold=head;
		  while(pold!=null){
			  if(pold.random!=null){
				  pold.next.random=pold.random.next;				  
			  }
			  pold=pold.next.next;
		  }
		  
		  pold=head;
		  pnew=result;
		  while(pnew.next!=null){
			  pold.next=pnew.next;
			  pold=pold.next;
			  pnew.next=pold.next;
			  pnew=pnew.next;
		  }
		  
		  pold.next=null;
		  pnew.next=null;
		  
		  return result;
	  }
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}

}
