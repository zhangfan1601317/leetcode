package niukewang;

public class FirstAppearingOnce
{
	String string="";
	int hash[]=new int[256];
	int index=0;
	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public void Insert(char ch)
    {
        index++;
        string+=ch;
        hash[ch-'\0']++;
    }
	
	public char FirstAppearingOnce()
    {
		char [] strChar=string.toCharArray();
		for(int i=0;i<index;i++){
			if(hash[(strChar[i]-'\0')]==1)
				return strChar[i];
		}
		return '#';
    }

}
