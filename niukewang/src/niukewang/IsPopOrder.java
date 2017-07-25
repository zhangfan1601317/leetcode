package niukewang;

import java.util.Stack;

public class IsPopOrder
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int push[]={1,2,3,4,5};
		int pop[]={4,5,3,2,1};
		System.out.println(IsPopOrder(push, pop));

	}
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
	    boolean Is=false;
	    Stack<Integer>order=new Stack<>();
	    if(popA!=null&&pushA!=null&&popA.length==pushA.length){
	    	int j=0;
	    	for(int i=0;i<popA.length;i++)
	    	{
	    		order.push(pushA[i]);
	    		while(order.isEmpty()==false&&order.peek()==popA[j]){
	    			order.pop();
	    			j++;
	    		}
	    	}
	    }
	    if(order.isEmpty()==true)
	    	Is=true;
	    return Is;
	      
    }

}
