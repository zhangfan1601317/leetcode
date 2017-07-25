package niukewang;


public class isNumeric
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
    public static  boolean isNumeric(char[] str) {
        if(str==null||str.length<=0)
        	return false;
        String s=String.valueOf(str);
        return s.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");
    }

}
