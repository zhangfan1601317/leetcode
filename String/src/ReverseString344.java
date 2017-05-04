
public class ReverseString344
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String s="";
		System.out.println(reverseString2(s));
	}
	public static String reverseString(String s)
	{
		if(s==null||s.length()==0)
			return "";
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			res+=s.charAt(i);
		}
		return res;
	}
	public static String reverseString2(String s)
	{
		char[] c=s.toCharArray();
		int formindex=0;
		int lastindex=c.length-1;
		while(formindex<lastindex)
		{
			char temp=c[lastindex];
			c[lastindex]=c[formindex];
			c[formindex]=temp;
			formindex++;
			lastindex--;
		}
		return new String(c);
	}
}
