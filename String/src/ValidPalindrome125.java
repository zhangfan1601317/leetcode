
public class ValidPalindrome125
{
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String input="0p";
		boolean res=isPalindrome(input);
		System.out.println(res);

	}
	public static boolean isPalindrome(String s)
	{
		if(s==null||s.length()==0)
			return true;
		String t=s.toLowerCase();
		String reString=t.replaceAll("[^a-z0-9]", "");
		String right=new StringBuffer(reString).reverse().toString();
		return reString.equals(right);
	}
	public static boolean isPalindrome2(String s)
	{
		 String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		 System.out.println(actual);
	     String rev = new StringBuffer(actual).reverse().toString();
	     return actual.equals(rev);
	}
}
