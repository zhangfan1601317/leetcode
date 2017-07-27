package Chapter1;

public class Reverse
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		Stack<Integer>stack=new Stack<>();
		while(!StdIn.isEmpty()){
			stack.push(StdIn.readInt());
		}
		for(int i:stack)
			StdOut.println(i);
	}

}
