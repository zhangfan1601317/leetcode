package niukewang;

public class StrToInt
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String in="-2147483647";
		String in2="    1a33";
		System.out.println(StrToInt(in));
		System.out.println(StrToInt(in2));
	}
    public static  int StrToInt(String str) {
        if(str==null||str.length()==0||str.equals(""))
        	return 0;
        char s[]=str.toCharArray();
        int symbol=0;
        if(s[0]=='-')
        	symbol=1;
        int sum=0;
        for(int i=symbol;i<s.length;i++){
        	if(s[i]=='+')
        		continue;
        	if(s[i]<48||s[i]>57)
        		return 0;
        	sum=sum*10+s[i]-48;
        }
        return symbol==0?sum:sum*(-1);
    }

}
