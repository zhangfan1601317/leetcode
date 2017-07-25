package niukewang;

import java.util.Stack;

public class MinStack
{
	Stack<Integer>stack=new Stack<>();
    Stack<Integer>minStack=new Stack<>();
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
    public void push(int node) {
    	stack.push(node);
    	//push的时候用一个辅助栈用来存储依次减小的元素们
    	if(minStack.size()==0||node<minStack.peek())
    		minStack.push(node);
    }
    
    public void pop() {
    	if(stack.peek()==minStack.peek())
    		minStack.pop();
    	stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }

}
