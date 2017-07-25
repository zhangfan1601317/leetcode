package niukewang;

public class LeftRotateString
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String string="abcXYZdef";
		int k=12;
		System.out.println(LeftRotateString(string, k));

	}
    public static  String LeftRotateString(String str,int n) {
        if(str==null||str.length()<=0)
        	return "";
        n=n%str.length();
        StringBuffer sb=new StringBuffer();
        sb.append(str.substring(n, str.length()));
        sb.append(str.substring(0,n));
        return sb.toString();
    }

}
