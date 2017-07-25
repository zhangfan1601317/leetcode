public class ReverseString3
{
	public static void main(String[] args)
	{
		// TODO �Զ����ɵķ������
		String input="Let's take LeetCode contest";
		System.out.println(reverseWords2(input));
	}
	public static String reverseWords(String s)
	{
		if(s==null||s.length()==0)
			return   "";
		String temp="";
		int q=0;
		for(int p=0;p<s.length();p++)
		{
			if(s.charAt(p)==' ')
			{
				temp+=reverseword(s.substring(q, p));
				temp+=s.charAt(p);
				q=p+1;
			}
		}
		temp+=reverseword(s.substring(q,s.length()));
		return temp;
	}
	public static String reverseWords2(String s){
		char[]arr=s.toCharArray();
		int last=-1;
		int next=0;
		while(next<arr.length)
		{
			if(arr[next]==' ')
			{
				reverseword2(arr, last+1, next-1);				
				last=next;
			}
			next++;
		}
		reverseword2(arr, last+1, next-1);
		return new String(arr);
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
	public static char[] reverseword2(char[] s,int index1,int index2)
	{
		while(index1<index2)
		{
			char temp=s[index2];
			s[index2]=s[index1];
			s[index1]=temp;
			index1++;
			index2--;
		}
		return s;
	}

}
