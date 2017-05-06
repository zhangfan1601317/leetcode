public class LongestUncommonSubsequence521
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String aString="aaa";
		String bString="aaa";
		System.out.println(findLUSlength(aString, bString));
	}
	public static int findLUSlength(String a, String b) {
        if(a==null&&b==null||a.length()==0&&b.length()==0||a.equals(b))
        	return -1; 	
        if(a.length()<b.length())
        	return b.length();
        else
        	return a.length();       	
    }
}
