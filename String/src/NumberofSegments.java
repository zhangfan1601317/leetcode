public class NumberofSegments {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s="hello, my name is zf";
		System.out.println("x " + s);
		int result=("x " + s).split(" +").length - 1;
		//int result=countSegments(s);
		System.out.println(result);

	}
	static int countSegments(String s)
	{
		int max=0;
		int thisNumber=0;
		if(s==null||s.length()==0)
			return 0;
		else
		{
			for(int i=0;i<s.length()-1;i++)
			{
				if(s.charAt(i)!=' '&&s.charAt(i+1)==' ')
				{
					thisNumber++;
				}
				if(thisNumber>max)
					max=thisNumber;
			}
			if(s.charAt(s.length()-1)!=' ')
			{
				max++;
			}
			return max;
		}		
	}

}
