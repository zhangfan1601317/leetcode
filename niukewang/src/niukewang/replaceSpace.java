package niukewang;

public class replaceSpace
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根

	}
	public static  String replaceSpace(StringBuffer str) {
	    if(str!=null)
	    {
			for(int i=0;i<str.length();i++)
		    {
		    	if(str.charAt(i)==' ')
		    	{
		    		str.replace(i, i+1, "%20");
		    	}
		    }
	    }
	    return str.toString();
	    	
	    }
}
