package niukewang;

import java.util.Stack;

public class evalRPN
{
	public static int evalRPN(String[] tokens) {
		if(tokens.length==1)
			return Integer.parseInt(tokens[0]);		
		Stack<Integer>myStack=new Stack<Integer>();
		for(int i=0;i<tokens.length;i++){
			if(!tokens[i].equals("+")&&!tokens[i].equals("-")&&!tokens[i].equals("*")&&!tokens[i].equals("/"))
				myStack.push(Integer.parseInt(tokens[i]));
			else
			{
				int m=myStack.pop();
				int n=myStack.pop();
				if(tokens[i]=="+")
					myStack.push(n+m);
				else if(tokens[i]=="-")
					myStack.push(n-m);
				else if(tokens[i]=="*")
					myStack.push(n*m);
				else {
					myStack.push(n/m);
				}
			}						
		}
		return myStack.pop();
    }
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String iString[]={"3","-4","+"};
		//String iString[]={"4", "13", "5", "/", "+"};
		System.out.println(evalRPN(iString));

	}

}
