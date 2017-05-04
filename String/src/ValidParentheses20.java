import java.util.Stack;

public class ValidParentheses20
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		boolean output=isValid("){");
		System.out.println(output);
	}
	public static boolean isValid(String s) {
		Stack<Character> stack=new Stack<>();
        if(s==null||s.length()==0)
        	return false;
        if(s.length()%2!=0)
        	return false;
        for(int i=0;i<s.length();i++)
        {
			if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
				stack.push(s.charAt(i));
			else
			{				
				if(stack.size()==0)
					return false;
				char top=stack.peek();
				if(s.charAt(i)==')')
					if(top=='(')
						stack.pop();
					else 
						return false;
				else if(s.charAt(i)=='}')
					if(top=='{')
						stack.pop();
					else 
						return false;
				else if(s.charAt(i)==']')
					if(top=='[')
						stack.pop();
					else 
						return false;
			}
			
        }
        return stack.size()==0;
    }
}
