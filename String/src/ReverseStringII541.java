
public class ReverseStringII541
{
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		//String string="hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
		String string="abcdefg";
		int k=2;
		char [] arr=string.toCharArray();
		if(string.length()<k)
		{
			reverseword2(arr, 0, string.length()-1);
			System.err.println(arr);
		}
		for(int i=0;i+2*k-1<string.length();i+=2*k)
		{
			reverseword2(arr, i, i+k-1);			
		}
		int last=string.length()-string.length()%(2*k);
		if(string.length()%(2*k)<k)
		reverseword2(arr, last, string.length()-1);
		else
			reverseword2(arr, last, last+k-1);
		System.err.println(arr);
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
