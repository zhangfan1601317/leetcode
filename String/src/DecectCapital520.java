
public class DecectCapital520
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String word="FlaG";
		System.out.println(detectCapitalUse(word));

	}
	public static boolean detectCapitalUse(String word)
	{
		if(word==null||word.length()==0)
			return false;
		if(word.toLowerCase().equals(word)||word.toUpperCase().equals(word))
			return true;
		if(word.charAt(0)>='A'&&word.charAt(0)<='Z')
		{
			if(word.substring(1).toLowerCase().equals(word.substring(1)))
				return true;
		}
		return false;		
	}

}
