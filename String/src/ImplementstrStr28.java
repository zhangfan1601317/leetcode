
public class ImplementstrStr28
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String hay="";
		String ned="";
		int out=ImplementstrStr(hay, ned);
		System.out.println(out);
	}
	public static int ImplementstrStr(String haystack,String neddle)
	{
		if(haystack==null||neddle==null)
			return 0;
		if(haystack.length()==0&&neddle.length()==0)
			return 0;
		if(haystack.equals(neddle))
			return 0;
		int res=haystack.indexOf(neddle);
		return res;
	}

}
