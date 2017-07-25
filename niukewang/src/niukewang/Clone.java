package niukewang;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class Clone
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public RandomListNode Clone(RandomListNode pHead){  
        CloneNodes(pHead);  
        ConnectSiblingNodes(pHead);  
        return ReconnectNodes(pHead);  
    }  
  
    private RandomListNode ReconnectNodes(RandomListNode pHead) {  
        // TODO Auto-generated method stub  
        RandomListNode pNode=pHead;  
        RandomListNode pCloneHead=null;  
        RandomListNode pCloneNode=null;  
          
        if(pNode!=null){  
            pCloneNode=pCloneHead=pHead.next;  
            pNode.next=pCloneNode.next;  
            pNode=pNode.next;     
        }  
        while(pNode!=null){  
            pCloneNode.next=pNode.next;  
            pCloneNode=pCloneNode.next;  
            pNode.next=pCloneNode.next;  
            pNode=pNode.next;  
        }  
          
        return pCloneHead;  
    }  
  
    private void ConnectSiblingNodes(RandomListNode pHead) {  
        // TODO Auto-generated method stub  
        RandomListNode pNode = pHead;  
        while (pNode != null) {  
            if (pNode.random != null) {  
                pNode.next.random = pNode.random.next;  
            }else{  
                pNode.next.random=null;  
            }  
            pNode=pNode.next.next;  
        }  
    }  
  
    private void CloneNodes(RandomListNode pHead) {  
        // TODO Auto-generated method stub  
        RandomListNode pNode=pHead;  
        while(pNode!=null){  
            RandomListNode pCloned=new RandomListNode(pNode.label);  
            pCloned.next=pNode.next;  
            pNode.next=pCloned;  
            pNode=pCloned.next;   
        }  
    }  

}
