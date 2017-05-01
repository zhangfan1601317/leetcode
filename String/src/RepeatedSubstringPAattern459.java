
public class RepeatedSubstringPAattern459 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s="aabaabaab";
		boolean result=repeatedSubstringPattern(s);
		System.out.println(result);
		
	}
	static boolean repeatedSubstringPattern(String s)
	{
		if(s==null||s.length()==0||s.length()==1)
			return false;		
		for(int k=1;k<s.length()/2+1;k++)
		{
			for(int i=0,j=i+k;i<s.length()-k;i++,j++)
			{
				if(s.charAt(i)!=s.charAt(j))
					break;
				if(j==s.length()-1)
				{
					if(s.length()%k==0)
						return true;
					else
						return false;
				}
			}
		}
		return false;
	}
}
