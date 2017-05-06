
public class CountandSay38
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int n=5;
		System.out.println(countAndSay(n));
		
	}
	public static String countAndSay(int n)
	{
		String s[]=new String[n];
		int t=0;
		s[0]="1";		
		while(t<n-1)
		{		
			s[t+1]=slast(s[t]);
			t++;			
		}
		return s[n-1];
	}
	//string求解
	public static String slast(String slast)
	{
		slast+='0';
		int count=1;
		String snew="";
		for(int i=1;i<slast.length();i++)
		{
			if(slast.charAt(i)!=slast.charAt(i-1))
			{
				
				snew+=count;
				snew+=slast.charAt(i-1);
				count=1;
			}
			else
			{
				count++;
			}
		}
		return snew;
	}

}
