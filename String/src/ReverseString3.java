public class ReverseString3
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String input="L";
		System.out.println(reverseWords(input));
	}
	public static String reverseWords(String s)
	{
		if(s==null||s.length()==0)
			return   "";
		String temp="";
		int q=0;
		for(int p=0;p<s.length();p++)
		{
			if(p==s.length()-1)
			{
				temp+=reverseword(s.substring(q, p+1));
			}
			if(s.charAt(p)==' ')
			{
				temp+=reverseword(s.substring(q, p));
				temp+=s.charAt(p);
				q=p+1;
			}
		}
		return temp;
	}
	public static String reverseword(String word)
	{
		String result="";
		for(int i=word.length()-1;i>=0;i--)
		{
			result+=word.charAt(i);
		}
		return result;
	}

}
