package Chapter1;

public class FixedCapacityStackOfStrings
{

	private String[] aStrings;
	private int N;
	public FixedCapacityStackOfStrings(int cap){
		aStrings=new String[cap];
	}
	public boolean isEmpty(){
		return N==0;
	}
	public int  size()
	{
		return N;
	}
	public void push(String item)
	{
		aStrings[N++]=item;
	}
	public String pop(){
		return aStrings[--N];
	}
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		FixedCapacityStackOfStrings s=new FixedCapacityStackOfStrings(100);
		while(!StdIn.isEmpty()){
			String item=StdIn.readString();
			if(!item.equals("-"))
				s.push(item);
			else if(!s.isEmpty())
				StdOut.print(s.pop()+" ");
		}
		StdOut.println("("+s.size()+"left on stack)");
		System.out.println("("+s.size()+"left on stack)");
	}

}
