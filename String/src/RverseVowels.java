
public class RverseVowels
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String string="Live on evasions? No I save no evil.";	
		System.out.println(reverseVowels2(string));
		//for(String pattern :new String[]{"[aeiou]"})
			//System.out.println(string.matches("[aeiou]"));
		

	}
	public static String reverseVowels(String s) {
        String Vowels="";
        for(int i=0;i<s.length();i++)
        {
        	int ch=s.charAt(i);
        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        	{
        		Vowels+=s.charAt(i);
        	}
        }
        String reString="";
        int j=Vowels.length()-1;
        for(int i=0;i<s.length();i++)
        {
        	int ch=s.charAt(i);
        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        	{
        		reString+=Vowels.charAt(j);
        		j--;
        	}
        	else
        	{
        		reString+=s.charAt(i);
        	}
        }
        return reString;
    }
	public static String reverseVowels2(String s) {		
		char [] chars=s.toCharArray();
		String Vowels="aeiouAEIOU";
		int formindex=0;
		int lastindex=chars.length-1;
		while(formindex<lastindex)
		{
			while(formindex<lastindex && !Vowels.contains(chars[formindex]+""))
				formindex++;
			while(formindex<lastindex && !Vowels.contains(chars[lastindex]+""))
				lastindex--;
			if(formindex<lastindex)
			{
				char temp=chars[formindex];
				chars[formindex++]=chars[lastindex];
				chars[lastindex--]=temp;
			}
		}
		return new String(chars);
	}
}
