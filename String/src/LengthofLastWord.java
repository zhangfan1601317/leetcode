
public class LengthofLastWord
{

	public static void main(String[] args)
	{
		// TODO �Զ����ɵķ������
		String input="a";
		System.out.println(lengthOfLastWord(input));

	}
	public static int lengthOfLastWord(String s) {
		if(s==null||s.length()==0)
			return 0;
        int lastindex=0;
        for(int index=s.length()-1;index>=0;index--)
        {
        	if(s.charAt(index)!=' ')
        	{
        		lastindex=index;
        		break;
        	}
        }
        int count=0;
        while(lastindex>=0&&s.charAt(lastindex)!=' ')
        {
        	count++;
        	lastindex--;
        }
        return count;
    }
}
